package baekjoon.pack9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction7 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		long m = Long.parseLong(st.nextToken());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int count = 0;
		int start = 0;
		int end = 0;
		int sum = 0;
		while (end < n) {
			sum += arr[end++];
			while (sum > m) {
				sum -= arr[start++];
			}

			if (sum == m) {
				count++;
			}
		}
		System.out.println(count);
	}

}