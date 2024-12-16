package baekjoon.pack7;

import java.io.IOException;

public class Soluction17 {

	public static int read() throws IOException {
		int num = System.in.read() & 15;
		int input;
		while ((input = System.in.read()) > 32) {
			num = ((num << 3) + (num << 1)) + (input & 15);
		}
		return num;
	}

	public static void main(String[] args) throws IOException {
		int N = (int) Math.pow(2, read());
		int r = read(); // 행
		int c = read(); // 열
		System.out.println(divde(N, r, c));
	}

	private static int divde(int length, int r, int c) {
		if (length == 1) {
			return 0;
		}

		int half = length / 2;
		if (r < half && c < half) {
			return divde(half, r, c); // 왼쪽 위
		} else if (r < half && c >= half) {
			return half * half + divde(half, r, c - half); // 오른쪽 위
		} else if (r >= half && c < half) {
			return 2 * half * half + divde(half, r - half, c); // 왼쪽 아래
		} else {
			return 3 * half * half + divde(half, r - half, c - half); // 오른쪽 아래
		}
	}

}
