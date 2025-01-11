package baekjoon.pack8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction14 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			for (int j = n - i; j > 0; j--) {
				sb.append(" ");
			}
			int j = 0;
			boolean isSpace = false;
			while (j != i) {
				if (isSpace) {
					sb.append(" ");
					isSpace = false;
				} else {
					j++;
					sb.append("*");
					isSpace = true;
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
