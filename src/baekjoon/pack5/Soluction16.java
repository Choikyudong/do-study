package baekjoon.pack5;

import java.io.IOException;

public class Soluction16 {

	public static int read() throws IOException {
		int num = System.in.read() & 15;
		int input;
		while ((input = System.in.read()) > 32) {
			num = ((num << 3) + (num << 1)) + (input & 15);
		}
		return num;
	}

	public static void main(String[] args) throws IOException {
		int t = read();

		long[] arr = new long[101];
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 1;
		for (int i = 3; i < 101; i++) {
			arr[i] = arr[i - 3] + arr[i - 2];
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			sb.append(arr[read() - 1]).append('\n');
		}
		System.out.println(sb);
	}

}
