package baekjoon.pack6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction17 {

	public static void main(String[] args) throws IOException {
		// 파보나치 수 계산
		int[] arr = new int[41];
		arr[0] = 0;
		arr[1] = 1;
		for (int i = 2; i < 41; i++) {
			arr[i] = arr[i - 2] + arr[i - 1];
		}

		// 입력 및 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < T; i++) {
			int num = Integer.parseInt(br.readLine());
			if (num == 0) {
				sb.append(1).append(' ').append(0).append('\n');
				continue;
			}
			sb.append(arr[num - 1]).append(' ').append(arr[num]).append('\n');
		}
		System.out.println(sb);
	}

}
