package baekjoon.pack6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction2 {

	public static void main(String[] args) throws IOException {
		// 1. 입력값 받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();

		// 2. 해싱처리?
		long result = 0;
		long pow = 1;
		int m = 1234567891;
		for (int i = 0; i < n; i++) {
			int l = (int) str.charAt(i) - 96;
			result += l * pow;
			pow = pow * 31 % m;
		}
		System.out.println(result % m);
	}

}
