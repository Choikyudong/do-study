package baekjoon.pack6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction8 {

	public static void main(String[] args) throws IOException {
		// 1. 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		for (int i = 0; i < n; i++) {
			String[] list = br.readLine().split(" ");
			arr[i][0] = Integer.parseInt(list[0]);
			arr[i][1] = Integer.parseInt(list[1]);
		}

		// 2. 등수구하기
		int[] rankList = new int[n];
		for (int i = 0; i < n; i++) {
			int count = n;
			int x = arr[i][0];
			int y = arr[i][1];
			for (int j = 0; j < n; j++) {
				int p = arr[j][0];
				int q = arr[j][1];
				// 3. 문제에서 제시한 덩치 구하기 구현
				if (x >= p && y >= q) {
					rankList[i] = count--;
				} else if (x >= p) {
					rankList[i] = count--;
				} else if (y >= q) {
					rankList[i] = count--;
				}
			}
		}

		// 4. 결과 출력
		StringBuilder sb = new StringBuilder();
		for (int result : rankList) {
			sb.append(result).append(' ');
		}
		System.out.println(sb);
	}

}
