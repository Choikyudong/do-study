package baekjoon.pack8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Soluction30 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			arr[i] = i;
		}

		List<Integer> result = new ArrayList<>();
		int idx = 0;
		int count = 1;
		int total = 0;
		StringBuilder sb = new StringBuilder("<");
		int k = Integer.parseInt(st.nextToken());
		while (n > total) {
			if (idx > n) {
				idx = 0;
			}

			if (arr[idx] == 0) {
				idx++;
				continue;
			}

			if (count == k) {
				sb.append(arr[idx]);
				if (n - 1 > total) {
					sb.append(", ");
				}
				arr[idx] = 0;
				total++;
				count = 0;
			}
			idx++;
			count++;
		}
		sb.append(">");
		System.out.println(sb);
	}

}
