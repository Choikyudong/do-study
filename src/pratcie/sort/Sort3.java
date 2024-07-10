package pratcie.sort;

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
			System.out.println(Arrays.toString(array));
			System.out.println("quickSort 소요시간 : " + (System.nanoTime() - start));
		}).start();
	}

	public static int[] makeRandomArray() {
		int length = 10;
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = (random.nextInt(10) * random.nextInt(10));
		}
		return array;
	}

	static void swap(int[] array, int idx1, int idx2) {
		int temp = array[idx1];
		array[idx1] = array[idx2];
		array[idx2] = temp;
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

}
