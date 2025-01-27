package baekjoon.pack9;

import java.util.Scanner;

public class Soluction5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		boolean isSk = true;
		while (true) {
			n -= n >= 3 ? 3 : 1;
			if (n == 0) {
				break;
			}
			isSk = !isSk;
		}
		System.out.println(isSk ? "SK" : "CY");
	}

}
