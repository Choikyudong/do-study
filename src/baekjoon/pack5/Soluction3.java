package baekjoon.pack5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction3 {

	static int repeat1 = 0;
	static int repeat2 = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		fibonacciNum1(n);
		fibonacciNum2(n);
		System.out.println(repeat1 + " " + repeat2);
	}

	// 재귀형식
	private static int fibonacciNum1(int n) {
		if (n == 1 || n == 2) {
			repeat1++;
			return 1;
		}
		return fibonacciNum1(n - 1) + fibonacciNum1(n - 2);
	}

	// 동적 형식
	private static int fibonacciNum2(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}

		int[] array = new int[n + 1];
		array[0] = 1;
		array[1] = 1;

		repeat2++;
		for (int i = 3; i < n; i++) {
			repeat2++;
			array[i] = array[i - 1] + array[i - 1];
		}
		return array[n];
	}

}
