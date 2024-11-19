package baekjoon.pack6;

import java.io.IOException;
import java.util.Arrays;

public class Soluction11 {

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
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = read();
		}
		Arrays.sort(arr);

		int p = (int) Math.round((n * (0.15)));
		int sum = 0;
		int count = 0;
		for (int i = p; i < n - p; i++, count++) {
			sum += arr[i];
		}
		System.out.println(Math.round(((float) sum / count)));
	}

}

