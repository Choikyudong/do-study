package baekjoon.pack1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Question : 문자와 문자열
 * Writer : Kyudong
 * Date : 2023-03-09
 * Time : 오후 10:30
 */
public class Soluction25 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int charAt = Integer.parseInt(br.readLine()) - 1;

		if (charAt > str.length()) {
			System.out.println();
		} else {
			System.out.println(str.charAt(charAt));
		}
	}

}
