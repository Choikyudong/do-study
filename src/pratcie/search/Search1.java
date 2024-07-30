package pratcie.search;

import pratcie.sort.Sort3;

import java.util.Arrays;

public class Search1 {

	public static void main(String[] args) {
		int[] orginArr = Sort3.makeRandomArray();
		new Thread(() -> {
			long start = System.nanoTime();
			int[] array = Arrays.copyOf(orginArr, orginArr.length);
			linearSearch(array, 235);
			System.out.printf("linearSearch 소요시간 : %d\n", (System.nanoTime() - start));
		}).start();
		new Thread(() -> {
			long start = System.nanoTime();
			int[] array = Arrays.copyOf(orginArr, orginArr.length + 1);
			array[orginArr.length] = 235; // 보초법 추가
			linearSearchSen(array, 235);
			System.out.printf("linearSearchSen 소요시간 : %d\n", (System.nanoTime() - start));
		}).start();
		new Thread(() -> {
			long start = System.nanoTime();
			int[] array = Arrays.copyOf(orginArr, 10);
			int key = array[array.length / 2];
			Sort3.quickSort(array,0, array.length - 1);
			binarySearch(array, key);
			System.out.printf("binarySearch 소요시간 : %d\n", (System.nanoTime() - start));
		}).start();
	}

	static void linearSearch(int[] array, int key) {
		int i = 0;
		int result = -1;
		while (array.length > i) {
			if (array[i] == key) {
				result = i;
				break;
			}
			++i;
		}
		
		if (result == -1) {
			System.out.println("배열에 없슴");
		} else {
			System.out.println(result + "번째에 있슴");
		}
	}

	// 보초법 적용
	static void linearSearchSen(int[] array, int key) {
		int i = 0;
		while (array[i] != key) {
			++i;
		}

		if (i == array.length) {
			System.out.println("배열에 없슴");
		} else {
			System.out.println(i + "번째에 있슴");
		}
	}

	static void binarySearch(int[] array, int key) {
		int pl = 0; // 검색범위 첫 인덱스
		int pr = array.length - 1; // 검색 범위의 끝 인덱스
		int result = -1;
		do {
			int pc = (pl + pr) / 2; // 중앙
			if (array[pc] == key) {
				result = pc;
				break;
			} else if (key > array[pc]) {
				pl = pc + 1;
			} else {
				pr = pc - 1;
			}
		} while (pr >= pl);

		if (result == -1) {
			System.out.println("배열에 없슴");
		} else {
			System.out.println(result + "번째에 있슴");
		}
	}

}
