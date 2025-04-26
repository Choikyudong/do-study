package baekjoon.pack10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction19 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		StringBuilder sb = new StringBuilder();
		int length = str.length();
		for (int i = 0; i < length;) {
			if (length - i >= 10) {
				sb.append(str, i, i + 10).append("\n");
				i += 10;
			} else {
				sb.append(str.substring(i));
				break;
			}
		}

		System.out.println(sb);
	}

}