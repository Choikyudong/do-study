package baekjoon.pack8;

import java.util.Scanner;

public class Soluction28 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count;
		if (100 > n) {
			count = n;
		} else {
			count = 99;
			for (int i = 100; i <= n; i++) {
				int firstNum = i / 100;
				int secondNum = i / 10 % 10;
				int lastNum = i % 10;
				if (firstNum - secondNum == secondNum - lastNum) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
