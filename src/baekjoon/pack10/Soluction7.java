package baekjoon.pack10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction7 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[] arr = new int[N];
		int max = 0;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			max = Math.max(num, max);
			arr[i] = num;
		}

		int index = 0;
		int[] result = new int[N];
		for (int i = 1; i <= max; i++) {
			for (int j = 0; j < N; j++) {
				if (arr[j] == i) {
					result[j] = index++;
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i : result) {
			sb.append(i).append(" ");
		}
		System.out.println(sb);
	}

}