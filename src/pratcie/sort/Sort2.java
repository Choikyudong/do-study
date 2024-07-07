package pratcie.sort;

import java.util.Arrays;
import java.util.Random;

public class Sort2 {

	public static final Random random = new Random();

	public static void main(String[] args) {
		int[] orginArr = makeRandomArray();
		new Thread(() -> selectionSort(Arrays.copyOf(orginArr, orginArr.length))).start();
	}

	public static int[] makeRandomArray() {
		int length = 10000;
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = (random.nextInt(100) * random.nextInt(1000));
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
		System.out.println(Arrays.toString(array));
		System.out.println("bubbleSort1 소요시간 : " + (System.nanoTime() - start));
	}

}
