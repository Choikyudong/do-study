package baekjoon.pack5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction22 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			char word = input.charAt(i);
			char replaceWord = (char) (word > 96 ? word - 32 : word + 32);
			sb.append(replaceWord);
		}
		System.out.println(sb);
	}

}
