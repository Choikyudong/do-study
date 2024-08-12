package baekjoon.pack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction17 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int result = 0;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		while (st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			if (num == 2 || num == 3 || num == 5 || num == 7) {
				++result;
				continue;
			}

			boolean isPrime = true;
			for (int i = 2; i < num; i++) {
				if  (num % i == 0) {
					isPrime = false;
					break;
				}
			}

			if (num != 1 && isPrime) {
				++result;
			}
		}
		System.out.println(result);
	}

}
