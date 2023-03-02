package baekjoon.pack1;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Question : 단어의 개수
 * Writer : Kyudong
 * Date : 2023-03-02
 * Time : 오후 10:09
 */
public class Soluction16 {

	// split
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//
//		// 문장
//		String str = scanner.nextLine().trim();
//
//		// 공백이 올 경우
//		if (str.isBlank()) {
//			System.out.println(0);
//			return;
//		}
//
//		// 글자 갯수
//		String[] strs = str.split("\\s");
//		System.out.println(strs.length);
//	}

	// Token
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 문장
		String str = scanner.nextLine();

		// 글자 갯수
		StringTokenizer st = new StringTokenizer(str, " ");
		System.out.println(st.countTokens());
	}


}
