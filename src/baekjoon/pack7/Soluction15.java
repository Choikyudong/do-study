package baekjoon.pack7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction15 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] graph = new int[N][N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < N; j++) {
				graph[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					if (graph[j][i] == 1 && graph[i][k] == 1) {
						graph[j][k] = 1;
					}
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int[] arr : graph) {
			for (int num : arr) {
				sb.append(num).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
