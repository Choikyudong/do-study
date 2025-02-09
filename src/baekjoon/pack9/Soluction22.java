package baekjoon.pack9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction22 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String a = st.nextToken();
		String b = st.nextToken();

		int min = Integer.MAX_VALUE;
		int length = b.length() - a.length();
		for (int i = 0; i <= length; i++) {
			int diff = 0;
			for (int j = 0; j < a.length(); j++) {
				if (a.charAt(j) != b.charAt(i + j)) {
					diff++;
				}
			}
			min = Math.min(min, diff);
		}
		System.out.println(min);
	}

}
