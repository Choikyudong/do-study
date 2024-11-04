package baekjoon.pack5;

import java.io.IOException;

public class Soluction17 {

	private static int k;
	private static int[] copyArr;
	private static int count = 0;
	private static int result = -1;

	public static int read() throws IOException {
		int num = System.in.read() & 15;
		int input;
		while ((input = System.in.read()) > 32) {
			num = ((num << 3) + (num << 1)) + (input & 15);
		}
		return num;
	}

	public static void main(String[] args) throws IOException {
		int a = read();
		k = read();

		int[] arr = new int[a];
		for (int i = 0; i < a; i++) {
			arr[i] = read();
		}

		copyArr = new int[a];
		mergeSort(arr,0, a - 1);
		System.out.println(result);
	}

	private static void mergeSort(int[] arr, int pl, int pr) {
		if (pl < pr) {
			int pc = (pl + pr) / 2;
			mergeSort(arr, pl, pc);
			mergeSort(arr, pc + 1, pr);
			merge(arr, pl, pc, pr);
		}
	}

	private static void merge(int[] arr, int pl, int pc, int pr) {
		int i = pl;
		int j = pc + 1;
		int t = 0;
		while (i <= pc && j <= pr) {
			if (arr[i] <= arr[j]) {
				copyArr[t++] = arr[i++];
			} else {
				copyArr[t++] = arr[j++];
			}
		}

		while (i <= pc) {
			copyArr[t++] = arr[i++];
		}

		while (j <= pr) {
			copyArr[t++] = arr[j++];
		}

		i = pl;
		t = 0;
		while (i <= pr) {
			count++;
			if (k == count) {
				result = copyArr[t];
			}
			arr[i++] = copyArr[t++];
		}
	}

}
