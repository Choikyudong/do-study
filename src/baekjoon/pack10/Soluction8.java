package baekjoon.pack10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		System.out.println(test(a, b, c));
	}

	public static long test(int a, int b, int c) {
		if (b == 1) {
			return a % c;
		}

		long half = test(a, b / 2, c);
		long result = (half * half) % c;

		if (b % 2 == 1) { // b가 홀수라면 한 번 더 곱함
			result = (result * a) % c;
		}

		return result;
	}

}