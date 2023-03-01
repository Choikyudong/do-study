package baekjoon.pack1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Question : 단어 공부
 * Writer : Kyudong
 * Date : 2023-03-01
 * Time : 오후 10:31
 */
public class Soluction15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 단어
		String s = scanner.next().toLowerCase();

		// 글자 갯수
		int[] arr = new int[26];
		Arrays.fill(arr, 0);
		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i) - 97] += 1;
		}

		// 글자 갯수 비교
		int max = -1;
		int index = -1;
		int number;
		for (int i = 0; i < arr.length; i++) {
			number = arr[i];
			if (number == 0) {
				continue;
			}
			if (max == number) {
				index = -1;
			}
			if (number > max) {
				max = number;
				index = i;
			}
		}

		// 출력용
		if (index == -1) {
			System.out.println("?");
		} else {
			char result = (char) (index + 97);
			System.out.println(String.valueOf(result).toUpperCase());
		}
	}

}
