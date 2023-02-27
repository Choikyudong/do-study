package baekjoon.pack1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Question : 알파벳 찾기
 * Writer : Kyudong
 * Date : 2023-02-27
 * Time : 오후 10:22
 */
public class Soluction14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 단어
		String s = scanner.next();

		// 위치 담기용
		int[] arr = new int[26];
		Arrays.fill(arr, -1);

		for (int i = 0; i < s.length(); i++) {
			int index = s.charAt(i) - 97;
			if (arr[index] == -1) {
				arr[index] = i;
			}
		}

		// 출력용
		for (var i : arr) {
			System.out.println(i);
		}
	}

}
