package baekjoon.pack6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction3 {

	public static void main(String[] args) throws IOException {
		// 1. 출력값 받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String numStr = br.readLine();

		// 2. 팰린드롬 수 찾기
		StringBuilder sb = new StringBuilder();
		while (!numStr.equals("0")) {
			int strLength = numStr.length();
			boolean isPalindrome = true;
			for (int i = 0; i < strLength / 2; i++) {
				char front = numStr.charAt(i);
				char back = numStr.charAt(strLength - (1 + i));
				if (front != back) {
					isPalindrome = false;
					break;
				}
			}
			sb.append(isPalindrome ? "yes" : "no").append('\n');
			numStr = br.readLine();
		}
		System.out.println(sb);
	}

}
