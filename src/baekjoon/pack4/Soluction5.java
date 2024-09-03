package baekjoon.pack4;

import java.io.*;

public class Soluction5 {

	public static void main(String[] args) throws IOException {
		// 1. 소수 배열을 미리 생성
		int maxLength = 1_000_000;
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

		// 2. 입력값 받기 및 두 소수의 합을 찾기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			int count = 0;
			int num = Integer.parseInt(br.readLine());
			for (int j = num - 1; j >= num / 2; j--) {
				int tempNum = num - j;
				if (!prime[j] && !prime[tempNum]) {
					++count;
				}
			}
			sb.append(count).append('\n');
		}
		bw.write(sb.toString());
		bw.flush();
	}

}
