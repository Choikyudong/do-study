package pratcie.sort;

import java.util.Arrays;
import java.util.Random;

public class Sort1 {

	public static final Random random = new Random();

	public static void main(String[] args) {
		int[] orginArr = makeRandomArray();
		new Thread(() -> bubbleSort1(Arrays.copyOf(orginArr, orginArr.length))).start();
		new Thread(() -> bubbleSort2(Arrays.copyOf(orginArr, orginArr.length))).start();
		new Thread(() -> bubbleSort3(Arrays.copyOf(orginArr, orginArr.length))).start();
		new Thread(() -> cocktailSort(Arrays.copyOf(orginArr, orginArr.length))).start();
	}

	public static int[] makeRandomArray() {
		int length = 100;
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = (random.nextInt(100) * random.nextInt(1000));
		}
		return array;
	}

	public static void bubbleSort1(int[] array) {
		long start = System.nanoTime();
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = array.length - 1; j > i; j--) {
				if (array[j - 1] > array[j]) {
					int temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("bubbleSort1 소요시간 : " + (System.nanoTime() - start));
	}

	public static void bubbleSort2(int[] array) {
		long start = System.nanoTime();
		boolean isChanged;
		for (int i = 0; i < array.length - 1; i++) {
			isChanged = false;
			for (int j = array.length - 1; j > i; j--) {
				if (array[j - 1] > array[j]) {
					int temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
					isChanged = true;
				}
			}
			if (!isChanged) { // 교환이 이루어지지 않을 경우 종료
				break;
			}
		}
		System.out.println("bubbleSort2 소요시간 : " + (System.nanoTime() - start));
	}

	public static void bubbleSort3(int[] array) {
		long start = System.nanoTime();
		int length = array.length;;
		int k = 0; // 마지막 교환 위치를 추적하는 용도
		while (k < length - 1) {
			int last = length - 1; // 이번 루프에서 마지막으로 교환된 위치
			for (int i = length - 1; i > k; i--) {
				if (array[i - 1] > array[i]) {
					int temp = array[i - 1];
					array[i - 1] = array[i];
					array[i] = temp;
					last = i;
				}
			}
			k = last;
		}
		System.out.println("bubbleSort3 소요시간 : " + (System.nanoTime() - start));
	}

	// 버블정렬의 개선 버전, 양방향 버블 정렬 또는 셰이커 정렬이라고도 부름
	public static void cocktailSort(int[] array) {
		long start = System.nanoTime();
		boolean isChanged; // 요소가 교환 여부를 추적하는 용도
		int startIndex = 0;
		int endIndex = array.length - 1;
		do {
			isChanged = false;

			// 왼쪽부터 정렬 시작
			for (int i = startIndex; i < endIndex; i++) {
				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					isChanged = true;
				}
			}
			if (!isChanged) {
				break;
			}

			isChanged = false;
			endIndex--;

			// 오른쪽에서 정렬 시작
			for (int i = endIndex - 1; i >= startIndex; i--) {
				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					isChanged = true;
				}
			}

			startIndex++;
		} while (isChanged);
		System.out.println("cocktailSort 소요시간 : " + (System.nanoTime() - start));
	}

}
