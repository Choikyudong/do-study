package baekjoon.pack5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction8 {

	private static int[] arr;
	private static int n;
	private static int m;
	private static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[m];
		dfs(0);
		System.out.println(sb);
	}

	private static void dfs(int depth) {
		if (m == depth) {
			for (var num : arr) {
				sb.append(num).append(' ');
			}
			sb.append('\n');
			return;
		}

		for (int i = 0; i < n; i++) {
			arr[depth] = i + 1;
			dfs(depth + 1);
		}
	}

}
