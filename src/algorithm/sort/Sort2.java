package algorithm.sort;

import java.util.Arrays;
import java.util.Random;

public class Sort2 {

	public static final Random random = new Random();

	public static void main(String[] args) {
		int[] orginArr = makeRandomArray();
		new Thread(() -> selectionSort(Arrays.copyOf(orginArr, orginArr.length))).start();
		new Thread(() -> insertionSort(Arrays.copyOf(orginArr, orginArr.length))).start();
		new Thread(() -> binaryInsertionSort(Arrays.copyOf(orginArr, orginArr.length))).start();
		new Thread(() -> shellSort1(Arrays.copyOf(orginArr, orginArr.length))).start();
		new Thread(() -> shellSort2(Arrays.copyOf(orginArr, orginArr.length))).start();
	}

	public static int[] makeRandomArray() {
		int length = 1000000;
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = (random.nextInt(1000) * random.nextInt(1000));
		}
		return array;
	}

	public static void selectionSort(int[] array) {
		long start = System.nanoTime();
		int length = array.length;
		for (int i = 0; i < length - 1; i++) {
			int min = i; // 가장 작은 값을 가진 요소의 인덱스
			for (int j = i + 1; j < length; j++) {
				if (array[min] > array[j]) {
					min = j; // 인덱스값 업데이트
				}
			}
			// 정렬
			int max = array[i];
			array[i] = array[min];
			array[min] = max;
		}
		System.out.println("selectionSort 소요시간 : " + (System.nanoTime() - start));
	}

	public static void insertionSort(int[] array) {
		long start = System.nanoTime();
		int length = array.length;
		for (int i = 1; i < length; i++) {
			int temp = array[i];
			int j; // temp 가 저장될 인덱스
			for (j = i; j > 0 && array[j - 1] > temp; j--) {
				array[j] = array[j - 1]; // temp가 더 작다면 이전의 값들을 뒤로 땡긴다.
			}
			array[j] = temp;
		}
		System.out.println("insertionSort 소요시간 : " + (System.nanoTime() - start));
	}

	public static void binaryInsertionSort(int[] array) {
		long start = System.nanoTime();
		int length = array.length;
		for (int i = 0; i < length; i++) {
			// 이진검색 알고리즘
			int key = array[i];
			int searchFirst = 0; // 검색범위 맨 앞의 인덱스
			int searchLast = i - 1; // 검색범위 맨 뒤의 인덱스
			int searchCenter; // 중앙의 인덱스
			int searchInsert; // 삽입하는 위치의 인덱스
			do {
				searchCenter = (searchFirst + searchLast) / 2;
				if (array[searchCenter] == key) {
					break;
				} else if (array[searchCenter] < key) {
					searchFirst = searchCenter + 1;
				} else {
					searchLast = searchCenter - 1;
				}
			} while (searchFirst <= searchLast);
			searchInsert = (searchFirst <= searchLast) ? searchCenter + 1 : searchLast + 1;

			for (int j = i; j > searchInsert; j--) {
				array[j] = array[j - 1]; // insertionSort 적용
			}
			array[searchInsert] = key;
		}
		System.out.println("binaryInsertionSort 소요시간 : " + (System.nanoTime() - start));
	}

	public static void shellSort1(int[] array) {
		long start = System.nanoTime();
		int length = array.length;
		for (int h = length / 2; h > 0; h /= 2) { // h = 정렬할 그룹의 수를 의미하며, h-정렬이라고도 부른다.
			for (int i = h; i < length; i++) { // 나누어진 그룹에서 정렬을 시작한다.
				int j; // 인덱스
				int temp = array[i];
				for (j = i - h; j >= 0 && array[j] > temp ; j -= h) { // 삽입 정렬 시작
					array[j + h] = array[j];
				}
				array[j + h] = temp;
			}
		}
		System.out.println("shellSort1 소요시간 : " + (System.nanoTime() - start));
	}

	public static void shellSort2(int[] array) {
		long start = System.nanoTime();
		int length = array.length;
		int h;
		for (h = 1; h < length / 9 ; h = h * 3 + 1); // 3의 배수로 그룹을 구해버린다.
		for (; h > 0; h /= 3) {
			for (int i = h; i < length; i++) {
				int j;
				int temp = array[i];
				for (j = i - h; j >= 0 && array[j] > temp ; j -= h) {
					array[j + h] = array[j];
				}
				array[j + h] = temp;
			}
		}
		System.out.println("shellSort2 소요시간 : " + (System.nanoTime() - start));
	}

}
