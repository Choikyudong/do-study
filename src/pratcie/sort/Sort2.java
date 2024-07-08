package pratcie.sort;

import java.util.Arrays;
import java.util.Random;

public class Sort2 {

	public static final Random random = new Random();

	public static void main(String[] args) {
		int[] orginArr = makeRandomArray();
		new Thread(() -> selectionSort(Arrays.copyOf(orginArr, orginArr.length))).start();
		new Thread(() -> insertionSort(Arrays.copyOf(orginArr, orginArr.length))).start();
		new Thread(() -> binaryInsertionSort(Arrays.copyOf(orginArr, orginArr.length))).start();
	}

	public static int[] makeRandomArray() {
		int length = 10;
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = (random.nextInt(10) * random.nextInt(10));
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

}
