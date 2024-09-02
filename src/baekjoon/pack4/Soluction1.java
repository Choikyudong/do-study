package baekjoon.pack4;

import java.io.*;

public class Soluction1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 1. 입력값 배열에 저장
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		// 2. 각 가로수의 간격 계산
		int[] gaps = new int[n - 1];
		for (int i = 0; i < gaps.length; i++) {
			gaps[i] = arr[i + 1] - arr[i];
		}

		// 3. 최대 공약수 구하기
		int gcd = gaps[0];
		for (int i = 1; i < gaps.length; i++) {
			gcd = gcd(gcd, gaps[i]);
		}

		// 4. 결과 게산 및 출력
		int count = (arr[n - 1] - arr[0]) / gcd + 1;
		int result = count - n;
		System.out.print(result);
	}

	private static int gcd(int x, int y) {
		return y == 0 ? x : gcd(y, x % y);
	}

}
