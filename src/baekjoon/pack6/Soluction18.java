package baekjoon.pack6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soluction18 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n + 1];
		arr[1] = 0;
		for (int i = 2; i <= n; i++) {
			arr[i] = arr[i - 1] + 1;

			// 연산을 한 번 추가했다는 가정하에 이전에 연산한 횟수에 1을 더한다.
			if (i % 2 == 0) {
				arr[i] = Math.min(arr[i], arr[i / 2] + 1);
			}

			if (i % 3 == 0) {
				arr[i] = Math.min(arr[i], arr[i / 3] + 1);
			}
		}
		System.out.println(arr[n]);
	}

}
