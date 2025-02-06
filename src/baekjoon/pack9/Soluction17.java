package baekjoon.pack9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction17 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while (n-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int t = Integer.parseInt(st.nextToken());
			int[] arr = new int[t];
			for (int i = 0; i < t; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

			long sum = 0;
			for (int i = 0; i < t; i++) {
				for (int j = i + 1; j < t; j++) {
					long gcd = Math.max(arr[i], arr[j]);
					long modulo = Math.min(arr[i], arr[j]);
					while (modulo != 0) {
						long num = gcd % modulo;
						gcd = modulo;
						modulo = num;
					}
					sum += gcd;
				}
			}
			sb.append(sum).append("\n");
		}
		System.out.println(sb);
	}

}
