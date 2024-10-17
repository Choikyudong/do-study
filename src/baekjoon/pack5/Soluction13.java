package baekjoon.pack5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction13 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 입력 단계
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		// 단위가 5 단위로 떨어져서 값을 나누면 연산 횟수를 줄일 수 있다.
		int count = 0;
		for (int i = n - 1; i >= 0; i--) {
			if (k / arr[i] != 0) {
				count += k / arr[i];
				k -= arr[i] * (k / arr[i]);
			}
		}
		System.out.println(count);
	}

}
