package baekjoon.pack10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction25 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] dirs = new String[n];
		for (int i = 0; i < n; i++) {
			dirs[i] = br.readLine();
		}

		StringBuilder sb = new StringBuilder(n);
		int length = dirs[0].length();
		for (int i = 0; i < length; i++) {
			char c = dirs[0].charAt(i);
			boolean isDiffrent = false;
			for (int j = 1; j < n; j++) {
				char compC = dirs[j].charAt(i);
				if (c != compC) {
					isDiffrent = true;
					break;
				}
			}
			if (isDiffrent) {
				sb.append("?");
			} else {
				sb.append(c);
			}
		}
		System.out.println(sb);
	}

}