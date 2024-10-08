package algorithm.sort;

import java.util.Arrays;
import java.util.Random;

public class Sort3 {

	public static final Random random = new Random();

	public static void main(String[] args) {
		int[] orginArr = makeRandomArray();
		new Thread(() -> {
			long start = System.nanoTime();
			int[] array = Arrays.copyOf(orginArr, orginArr.length);
			quickSort(array, 0, array.length - 1);
			System.out.printf("quickSort 소요시간 : %d, 배열 : %s%n", (System.nanoTime() - start), Arrays.toString(array));
		}).start();
		new Thread(() -> {
			long start = System.nanoTime();
			int[] aArray = new int[]{2, 4, 6, 8, 11, 13};
			int[] bArray = new int[]{1, 2, 3, 4, 9, 16, 21};
			int[] cArray = new int[13];
			mergeArray(aArray, aArray.length, bArray, bArray.length, cArray);
			System.out.printf("mergeArray 소요시간 : %d, 배열 : %s%n", (System.nanoTime() - start), Arrays.toString(cArray));
		}).start();
		new Thread(() -> {
			long start = System.nanoTime();
			int[] array = Arrays.copyOf(orginArr, orginArr.length);
			mergeArray = new int[array.length]; // 작업용 배열 생성
			mergeSort(array, 0, array.length - 1);
			System.out.printf("mergeSort 소요시간 : %d, 배열 : %s%n", (System.nanoTime() - start), Arrays.toString(array));
		}).start();
		new Thread(() -> {
			long start = System.nanoTime();
			int[] array = Arrays.copyOf(orginArr, orginArr.length);
			heapSort(array);
			System.out.printf("heapSort 소요시간 : %d, 배열 : %s%n", (System.nanoTime() - start), Arrays.toString(array));
		}).start();
		new Thread(() -> {
			long start = System.nanoTime();
			int[] array = Arrays.copyOf(orginArr, orginArr.length);
			countingSort(array);
			System.out.printf("countingSort 소요시간 : %d, 배열 : %s%n", (System.nanoTime() - start), Arrays.toString(array));
		}).start();
	}

	public static int[] makeRandomArray() {
		int length = 100;
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = (random.nextInt(10) * random.nextInt(10));
		}
		return array;
	}

	public static void quickSort(int[] array, int left, int right) {
		int pl = left; // 왼쪽 커서
		int pr = right; // 오른쪽 커서
		int p = array[(pl + pr) / 2]; // 피벗 (중앙값)
		do {
			while (array[pl] < p) pl++;
			while (array[pr] > p) pr--;
			if (pl <= pr) {
				int temp = array[pl];
				array[pl] = array[pr];
				array[pr] = temp;
				pl++;
				pr--;
			}
		} while (pl <= pr);

		if (left < pr) {
			quickSort(array, left, pr);
		}
		if (pl < right) {
			quickSort(array, pl, right);
		}
	}

	public static void mergeArray(int[] aArray, int na, int[] bArray, int nb, int[] cArray) {
		int pa = 0; // aArray의 인덱스 위치
		int pb = 0; // bArray의 인덱스 위치
		int pc = 0; // cArray의 인덱스 위치

		// 두 배열을 비교하여 요소가 작은 값을 cArray에 넣는다.
		while (pa < na && pb < nb) {
			cArray[pc++] = (aArray[pa] <= bArray[pb]) ? aArray[pa++] : bArray[pb++];
		}

		while (pa < na) { // aArray에 남아있는 요소를 복사
			cArray[pc++] = aArray[pa++];
		}

		while (pb < nb) { // bArray에 남아있는 요소를 복사
			cArray[pc++] = bArray[pb++];
		}
	}

	static int[] mergeArray;

	public static void mergeSort(int[] array, int left, int right) {
		if (left < right) {
			int center = (left + right) / 2;
			int k = left;

			mergeSort(array, left, center); // 앞부분 병합 정럴
			mergeSort(array, center + 1, right); // 뒷부분 병합 정럴

			// 병합 수행 코드
			int i;
			int j = 0;
			int p = 0;
			for (i = left; i <= center; i++) {
				mergeArray[p++] = array[i];
			}
			while (i <= right && j < p) {
				array[k++] = (mergeArray[j] <= array[i]) ? mergeArray[j++] : array[i++];
			}
			while (j < p) {
				array[k++] = mergeArray[j++];
			}
		}
	}

	public static void downHeap(int[] array, int left, int right) {
		int temp = array[left]; // 루트
		int child; // 큰 값을 가진 노드
		int parent;

		for (parent = left; parent < (right + 1) / 2; parent = child) {
			int cl = parent * 2 + 1;
			int cr = cl + 1;
			child = (cr <= right && array[cr] > array[cl]) ? cr : cl;
			if (temp >= array[child]) {
				break;
			}
			array[parent] = array[child];
		}
		array[parent] = temp;
	}

	public static void heapSort(int[] array) {
		int length = array.length;
		for (int i = (length - 1) / 2; i >= 0; i--) {
			downHeap(array, i, length - 1);
		}

		for (int i = (length - 1); i > 0; i--) {
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			downHeap(array, 0, i - 1);
		}
	}

	public static void countingSort(int[] array) {
		int length = array.length;
		
		// 배열의 최대값 구하기
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			max = Math.max(max, array[i]);
		}
		
		int[] f = new int[max + 1]; // 도수분포와 누적도수를 넣는 배열
		int[] b = new int[length]; // 임시저장용

		// 도수 분포표 만들기
		for (int i = 0; i < length; i++) {
			f[array[i]]++;
		}
		
		// 누적 도수 분포표 만들기
		for (int i = 1; i <= max; i++) {
			f[i] += f[i - 1];
		}
		
		// 목적 배열 만들기
		for (int i = length - 1; i >= 0; i--) {
			b[--f[array[i]]] = array[i];
		}
		
		// 배열 복사 
		for (int i = 0; i < length; i++) {
			array[i] = b[i];
		}
	}
}
