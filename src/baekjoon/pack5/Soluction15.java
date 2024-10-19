package baekjoon.pack5;

import java.io.IOException;

public class Soluction15 {

	public static int read() throws IOException {
		int num = System.in.read() & 15;
		int input;
		while ((input = System.in.read()) > 32) {
			num = ((num << 3) + (num << 1)) + (input & 15);
		}
		return num;
	}

	public static void main(String[] args) throws IOException {
		// 1. 입력받음
		int length = read();
		int[] distance = new int[length - 1];
		for (int i = 0; i < length - 1; i++) {
			distance[i] = read();
		}

		// 2. 계산
		int min = read();
		long totalPrice = (long) distance[0] * min;
		for (int i = 1; i < length - 1; i++) {
			int curPrice = read();
			if (min > curPrice) {
				min = curPrice;
			}
			totalPrice += (long) min * distance[i];
		}
		System.out.println(totalPrice);
	}

}
