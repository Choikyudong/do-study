package baekjoon.pack5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction14 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int result = 0;
		int length = input.length();
		int j = 0;
		int i = 0;
		for (;i < length; i = j) {
			char c = input.charAt(i);
			if (c == '-') {
				break;
			} else {
				j++;
			}
			for (; j < length; j++) {
				c = input.charAt(j);
				if (c == '+' || c == '-') {
					break;
				}
			}
			int number = Integer.parseInt(input.substring(i, j));
			result += number;
		}

		for (;i < length; i = j) {
			char c = input.charAt(i);
			if (c == '+' || c == '-') {
				i++;
			}
			j = i;
			for (; j < length; j++) {
				c = input.charAt(j);
				if (c == '+' || c == '-') {
					break;
				}
			}
			int number = Integer.parseInt(input.substring(i, j));
			result -= number;
		}
		System.out.println(result);
	}

}
