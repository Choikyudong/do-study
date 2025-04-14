package baekjoon.pack10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());

		int minLen = -1;
		long startNum = -1;
		for (int len = l; len <= 100; len++) {
			long temp = n - (long) len * (len - 1) / 2;
			if (temp % len == 0) {
				long a = temp / len;
				if (a >= 0) {
					minLen = len;
					startNum = a;
					break;
				}
			}
		}

		// 결과 출력
		if (minLen == -1) {
			System.out.println(-1);
		} else {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < minLen; i++) {
				sb.append(startNum + i).append(" ");
			}
			System.out.println(sb);
		}
	}
}
