package baekjoon.pack3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction6 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int result = 0;
		for (int i = n; i > 0; i--) {
			int temp = i;
			int m = 0; // 분해합
			while (temp > 0) {
				m += temp % 10;
				temp /= 10;
			}
			if (i + m == n) {
				result = i;
			}
		}
		System.out.println(result);
	}

}
