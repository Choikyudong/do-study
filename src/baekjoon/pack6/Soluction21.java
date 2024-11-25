package baekjoon.pack6;

import java.io.IOException;

public class Soluction21 {

	public static int read() throws IOException {
		int num = System.in.read() & 15;
		int input;
		while ((input = System.in.read()) > 32) {
			num = ((num << 3) + (num << 1)) + (input & 15);
		}
		return num;
	}

	public static void main(String[] args) throws IOException {
		int n = read();
		int m = read();
		int[] arr = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			arr[i] = arr[i - 1] + read();
		}

		StringBuilder sb = new StringBuilder();
		for (int k = 0; k < m; k++) {
			int i = read();
			int j = read();
			int result;
			if (i == 1) {
				result = arr[j];
			} else {
				result = arr[j] - arr[i - 1];
			}
			sb.append(result).append('\n');
		}
		System.out.println(sb);
	}

}
