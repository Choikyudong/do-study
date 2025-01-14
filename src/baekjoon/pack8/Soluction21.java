package baekjoon.pack8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction21 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken()); // 공의 개수
		int k = Integer.parseInt(st.nextToken()); // 바구니 개수


		int sum = 0;
		for (int i = k; i > 0; i--) {
			sum += i; // 바구니에 차례대로 담는다.
		}
		n -= sum;

		if (n < 0) {
			System.out.println(-1);
		} else if (n % k == 0) {
			System.out.println(k - 1);
		} else {
			System.out.println(k);
		}
	}

}
