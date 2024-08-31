package baekjoon.pack3;

import java.io.*;
import java.util.StringTokenizer;

public class Soluction29 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 1. 입력값을 받는다.
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());

		// 2. 최소공배수를 구하고 출력한다.
		System.out.println((a *b) / gcd(a, b));
	}

	// 재귀형태로 구현
	private static long gcd(long a, long b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

}
