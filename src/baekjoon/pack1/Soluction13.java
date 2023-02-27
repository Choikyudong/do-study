package baekjoon.pack1;

import java.util.Scanner;

/**
 * Question : 숫자의 합
 * Writer : Kyudong
 * Date : 2023-02-27
 * Time : 오후 9:47
 */
public class Soluction13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 글자를 입력할 횟수
		int keyDownCount = scanner.nextInt();

		int result = 0;
		String str = scanner.next();
		while (keyDownCount > 0) {
			result += str.charAt(keyDownCount-- - 1) - 48;
		}

		System.out.println(result);
	}

}
