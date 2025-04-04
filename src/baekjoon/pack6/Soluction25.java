package baekjoon.pack6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction25 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		if (N == 1) {
			System.out.println(1);
			return;
		}
		if (N == 2) {
			System.out.println(3);
			return;
		}

		int[] arr = new int[N + 1];
		arr[1] = 1;
		arr[2] = 3;
		arr[3] = 5;
		for (int i = 4; i <= N; i++) {
			arr[i] = (arr[i - 1] + (arr[i - 2] * 2)) % 10007;
		}
		System.out.println(arr[N]);
	}

}
