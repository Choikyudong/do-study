package baekjoon.pack10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction30 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()) % 10;
			int b = Integer.parseInt(st.nextToken());

			if (a == 0) {
				sb.append(10).append("\n");
				continue;
			}

			int result = 1;
			for (int j = 0; j < b; j++) {
				result = (result * a) % 10;
			}
			if (result == 0) {
				sb.append(10).append("\n");
			} else {
				sb.append(result % 10).append("\n");
			}
		}
		System.out.println(sb);
	}

}