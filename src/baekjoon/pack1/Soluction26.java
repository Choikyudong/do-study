package baekjoon.pack1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Question : 팰린드롬인지 확인하기
 * Writer : Kyudong
 * Date : 2023-03-10
 * Time : 오후 10:41
 */
public class Soluction26 {

	// 팰린드롬 : 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		// 문제에서 팰린드롬일 경우 1을 출력하도록 되어있다.
		int isPalindrome = 1;
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - (i + 1))) {
				isPalindrome = 0;
				break;
			}
		}

		System.out.println(isPalindrome);
	}

}
