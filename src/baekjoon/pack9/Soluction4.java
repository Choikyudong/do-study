package baekjoon.pack9;

import java.util.Scanner;

public class Soluction4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int piece = 0;
		int length = 64;
		while (x > 0) {
			if (x - length > -1) {
				x -= length;
				piece++;
			}
			length >>= 1;
		}
		System.out.println(piece);
	}

}
