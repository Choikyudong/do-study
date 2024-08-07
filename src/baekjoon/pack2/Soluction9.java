package baekjoon.pack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction9 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = Integer.parseInt(br.readLine());
		for (int i = 0; i < count; i++) {
			int money = Integer.parseInt(br.readLine());

			int q = 0; // 쿼터
			while (money >= 25) {
				money -= 25;
				++q;
			}

			int d = 0; // 다임
			while (money >= 10) {
				money -= 10;
				++d;
			}

			int n = 0; // 내켈
			while (money >= 5) {
				money -= 5;
				++n;
			}

			int p = 0; // 페니
			while (money > 0) {
				money -= 1;
				++p;
			}

			System.out.printf("%d %d %d %d\n", q, d, n, p);
		}
	}

}
