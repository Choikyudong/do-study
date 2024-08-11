package baekjoon.pack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction15 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int result = 0;
		int index = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				++index;
				if (index == k) {
					result = i;
				}
			}
		}
		System.out.println(result);
	}

}
