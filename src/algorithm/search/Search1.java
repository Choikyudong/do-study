package algorithm.search;

import algorithm.sort.Sort3;

import java.util.Arrays;

public class Search1 {

	public static void main(String[] args) {
		int[] orginArr = Sort3.makeRandomArray();
		Sort3.quickSort(orginArr, 0, orginArr.length - 1);
		int key = orginArr[orginArr.length / 2];
		new Thread(() -> {
			long start = System.nanoTime();
			int[] array = Arrays.copyOf(orginArr, orginArr.length);
			int result = linearSearch(array, key);
			System.out.printf("linearSearch 요소위치 : %d,소요시간 : %d\n", result,(System.nanoTime() - start));
		}).start();
		new Thread(() -> {
			long start = System.nanoTime();
			int[] array = Arrays.copyOf(orginArr, orginArr.length + 1);
			array[orginArr.length] = 235; // 보초법 추가
			int result = linearSearchSen(array, key);
			System.out.printf("linearSearchSen 요소위치 : %d,소요시간 : %d\n", result,(System.nanoTime() - start));
		}).start();
		new Thread(() -> {
			long start = System.nanoTime();
			int[] array = Arrays.copyOf(orginArr, orginArr.length);
			int result = binarySearch(array, key);
			System.out.printf("binarySearch 요소위치 : %d,소요시간 : %d\n", result,(System.nanoTime() - start));
		}).start();
		new Thread(() -> {
			long start = System.nanoTime();
			int[] array = Arrays.copyOf(orginArr, orginArr.length);
			int result = interpolationSearch(array, array.length - 1, 0, key);
			System.out.printf("interpolationSearch 요소위치 : %d,소요시간 : %d\n", result,(System.nanoTime() - start));
		}).start();
	}

	static int linearSearch(int[] array, int key) {
		int i = 0;
		while (array.length > i) {
			if (array[i] == key) {
				return i;
			}
			++i;
		}
		return -1;
	}

	// 보초법 적용
	static int linearSearchSen(int[] array, int key) {
		int i = 0;
		while (array[i] != key) {
			++i;
		}
		return i;
	}

	static int binarySearch(int[] array, int key) {
		int pl = 0; // 검색범위 첫 인덱스
		int pr = array.length - 1; // 검색 범위의 끝 인덱스
		do {
			int pc = (pl + pr) / 2; // 중앙
			if (array[pc] == key) {
				return pc;
			} else if (key > array[pc]) {
				pl = pc + 1;
			} else {
				pr = pc - 1;
			}
		} while (pr >= pl);
		return -1;
	}

	static int interpolationSearch(int[] array, int pl, int pr, int key) {
		if (pl >= pr && key >= array[pr] && key <= array[pl]) {
			// 탐색 위치를 예상 : (list[high] - list[low]) : (k - list[low]) = (high - low) : (pos - low)
			int pos = pl + ((pr - pl) / (array[pr] - array[pl]) * (key - array[pl]));
			if (array[pos] == key) {
				return pos;
			}

			if (array[pos] < key) {
				return interpolationSearch(array, pl, pos + 1, key);
			}

			if (array[pos] > key) {
				return interpolationSearch(array, pos - 1, pr, key);
			}
		}
		return -1;
	}

}
