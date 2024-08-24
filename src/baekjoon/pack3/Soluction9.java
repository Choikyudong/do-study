package baekjoon.pack3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction9 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long result = 666;
		for (int i = 1; i < n; i++) {
			do {
				++result;
			} while (!findSixPattern(result));
		}
		System.out.println(result);
	}

	static boolean findSixPattern(long number) {
		while (number > 0) {
			if (number % 1000 == 666) {
				return true;
			}
			number /= 10;
		}
		return false;
	}

}
