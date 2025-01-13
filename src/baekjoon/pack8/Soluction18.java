package baekjoon.pack8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction18 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int zero = 0;
		int one = 0;
		for (int i = 0; i < str.length();) {
			char c = str.charAt(i);
			if (c == '0') {
				zero++;
			} else {
				one++;
			}
			while (i < str.length() && str.charAt(i) == c) {
				i++;
			}
		}

		System.out.println(Math.min(zero, one));
	}

}
