package baekjoon.pack4;

import java.io.*;

public class Soluction4 {

	public static void main(String[] args) throws IOException {
		// 1. 소수 배열을 미리 생성
		int maxLength = 123_456 * 2;
		boolean[] prime = new boolean[maxLength + 1];
		prime[0] = true;
		prime[1] = true;
		for (int i = 2; i <= Math.sqrt(maxLength); i++) {
			if (!prime[i]) {
				for (int j = i * i; j <= maxLength; j += i) {
					prime[j] = true;
				}
			}
		}

		// 2. 입력값 받기 및 범위 안의 소수 개수 찾기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		while (n != 0) {
			int count = 0;
  			for (int i = n + 1; i <= 2 * n; i++) {
				if (!prime[i]) {
					++count;
				}
			}
			sb.append(count).append('\n');
			n = Integer.parseInt(br.readLine());
		}
		bw.write(sb.toString());
		bw.flush();
	}

}
