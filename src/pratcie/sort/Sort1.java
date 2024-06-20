package pratcie.sort;

import java.util.Random;

public class Sort1 {

	public static void main(String[] args) {
		int[] orginArr = makeRandomArray();
		int[] arr1 = new int[orginArr.length];
		System.arraycopy(orginArr, 0, arr1, 0, orginArr.length);

		int[] arr2 = new int[orginArr.length];
		System.arraycopy(orginArr, 0, arr2, 0, orginArr.length);

		int[] arr3 = new int[orginArr.length];
		System.arraycopy(orginArr, 0, arr3, 0, orginArr.length);

		new Thread(() -> bubbleSort1(arr1)).start();
		new Thread(() -> bubbleSort2(arr2)).start();
		new Thread(() -> bubbleSort3(arr3)).start();
	}

	public static int[] makeRandomArray() {
		Random random = new Random();
		int length = random.nextInt(450000) + 1;
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = (random.nextInt(10000) * random.nextInt(100000));
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
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
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

}
