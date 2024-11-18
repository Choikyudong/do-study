package baekjoon.pack5;

import java.io.IOException;

public class Soluction30 {

	public static int read() throws IOException {
		int num = System.in.read() & 15;
		int input;
		while ((input = System.in.read()) > 32) {
			num = ((num << 3) + (num << 1)) + (input & 15);
		}
		return num;
	}

	public static void main(String[] args) throws IOException {
		int h1 = read();
		int h2 = read();
		int h3 = read();
		StringBuilder sb = new StringBuilder();
		while (h1 != 0 && h2 != 0 && h3 != 0) {
			int sum = 0;
			int max;
			if (h1 > h2) {
				sum += h2 * h2;
				max = h1;
			} else {
				sum += h1 * h1;
				max = h2;
			}
			if (max > h3) {
				sum += h3 * h3;
			} else {
				sum += max * max;
				max = h3;
			}
			sb.append(sum == (max * max) ? "right" : "wrong").append("\n");
			h1 = read();
			h2 = read();
			h3 = read();
		}
		System.out.println(sb);
	}

}
