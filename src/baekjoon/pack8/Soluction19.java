package baekjoon.pack8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction19 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int a = 0;
		int b = 0;
		int c = 0;
		if (t >= 300) {
			a = t / 300;
			t %= 300;
		}

		if (t >= 60) {
			b = t / 60;
			t %= 60;
		}

		if (t >= 10) {
			c = t / 10;
			t %= 10;
		}

		if (t > 0) {
			System.out.println(-1);
		} else {
			System.out.println(a + " " + b + " " + c);
		}
	}

}
