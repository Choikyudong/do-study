package baekjoon.pack1;

import java.util.Scanner;

/**
 * Question : 문자열
 * Writer : Kyudong
 * Date : 2023-02-23
 * Time : 오후 11:36
 */
public class Soluction12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 글자를 입력할 횟수
		int keyDownCount = scanner.nextInt();

		String str;
		for (int i = 0; i < keyDownCount; i++) {
			str = scanner.next();
			System.out.print(str.charAt(0));
			System.out.print(str.charAt(str.length() - 1));
			System.out.println();
		}
	}

}
