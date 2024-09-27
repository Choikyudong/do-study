package baekjoon.pack4;

import java.io.IOException;

public class Soluction28 {

	public static void main(String[] args) throws IOException {
		int resultA = 0;
		int resultB = 0;
		int input;
		while ((input = System.in.read()) != '\n') {
			if (input == 32) {
				continue;
			}
			if (resultA == 0) {
				resultA = input - '0';
			} else if (resultB == 0) {
				resultB = input - '0';
			}
		}
		System.out.println(resultA - resultB);
	}

}
