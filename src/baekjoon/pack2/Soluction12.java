package baekjoon.pack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction12 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int a = 1;
		int b = 1;
		boolean c = true;
		for (int i = 1; i < x; ++i) {
			if (a == 1 && c) {
				++b;
				c = false;
			} else if (b == 1 && !c) {
				++a;
				c = true;
			} else if (!c) {
				++a;
				--b;
			} else {
				++b;
				--a;
			}
		}
		System.out.printf("%d/%d%n", a, b);
	}

}
