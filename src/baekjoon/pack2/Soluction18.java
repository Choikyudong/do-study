package baekjoon.pack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction18 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int total = 0;
		int min = Integer.MAX_VALUE;
		for (int i = m; i <= n; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}

			if (i == 1) {
				isPrime = false;
			}

			if (i == 2 || i == 3 || i == 5 || i == 7) {
				isPrime = true;
			}

			if (isPrime) {
				total += i;
				min = Math.min(min, i);
			}
		}
		if (total == 0) {
			System.out.println(-1);
		} else {
			System.out.println(total);
			System.out.println(min);
		}
	}

}
