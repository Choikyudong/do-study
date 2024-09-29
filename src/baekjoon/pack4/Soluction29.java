package baekjoon.pack4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction29 {

	public static void main(String[] args) throws IOException {
		// 1. 입력값 받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		// 2. 최대값을 구하면서 점수를 더한다.
		int max = Integer.MIN_VALUE;
		double result = 0;
		for (int i = 0; i < n; i++) {
			int score = Integer.parseInt(st.nextToken());
			max = Math.max(max, score);
			result += score;
		}

		// 3. 출력한다.
		System.out.println((result / max * 100) / n);
	}
}
