package baekjoon.pack4;

import java.io.*;

public class Soluction24 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			String str = br.readLine();

			// 1. 재귀
			count = 1;
			int result = palindrome(str, 0, str.length() - 1);
			sb.append(result).append(" ").append(count).append("\n");

			// 2. 반복문
			/*
			int isPalindrome = 1;
			int count = 1;
			for (int j = 0, k = str.length() - 1; j < str.length() / 2; j++, k--, count++) {
				if (str.charAt(j) != str.charAt(k)) {
					isPalindrome = 0;
					break;
				}
			}
			System.out.println(count  + " " + isPalindrome);
			*/
		}
		bw.write(sb.toString());
		bw.flush();
	}

	private static int count;
	public static int palindrome(String str, int first, int last) {
		if (first >= last) {
			return 1;
		} else if (str.charAt(first) != str.charAt(last)) {
			return 0;
		} else {
			count++;
			return palindrome(str, ++first, --last);
		}
	}

}
