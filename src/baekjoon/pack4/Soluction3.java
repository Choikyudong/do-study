package baekjoon.pack4;

import java.io.*;
import java.util.StringTokenizer;

public class Soluction3 {

	public static void main(String[] args) throws IOException {
		// 1. 입력값 받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());

		// 2. 에라토스테네스의 체 의 공식을 사용하여 2, 3, 5, 7 배수들을 모두 true로 변경한다.
		boolean[] prime = new boolean[n + 1];
		prime[0] = true;
		prime[1] = true;
		for (int i = 2; i * i <= n; i++) {
			if (!prime[i]) {
				for (int j = i * i; j <= n; j += i) {
					prime[j] = true;
				}
			}
		}

		// 3. prime의 값이 부정일 경우 소수로 출력한다.
		StringBuilder sb = new StringBuilder();
		for (int i = m; i < prime.length; i++) {
			if (!prime[i]) {
				sb.append(i).append("\n");
			}
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.flush();
	}

}
