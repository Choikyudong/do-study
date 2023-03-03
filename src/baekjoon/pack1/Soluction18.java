package baekjoon.pack1;

import java.util.Scanner;

/**
 * Question : 상수
 * Writer : Kyudong
 * Date : 2023-03-04
 * Time : 오전 1:06
 */
public class Soluction18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String number1 = new StringBuilder(scanner.next()).reverse().toString();
		String number2 = new StringBuilder(scanner.next()).reverse().toString();

		System.out.println(Integer.max(Integer.parseInt(number1), Integer.parseInt(number2)));
	}

}
