package baekjoon.pack5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction9 {

	static int[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new int[n + 3];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		for (int i = 3; i <= n; i++) {
			arr[i] = -1;
		}
		System.out.println(countBin(n));
	}

	private static int countBin(int n) {
		if (arr[n] == -1) {
			arr[n] = (countBin(n - 1) + countBin(n - 2)) % 15746;
		}
		return arr[n];
	}

}
