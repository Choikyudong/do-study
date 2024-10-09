package baekjoon.pack5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Soluction6 {

	static boolean[] visit;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		visit = new boolean[n];
		arr = new int[m];
		dfs(n, m, 0);
		System.out.println(sb);
	}

	private static void dfs(int n, int m, int depth) {
		// 재구의 깊이와 탐색의 깊이가 같다면 담겨진 값을 출력 준비
		if (depth == m) {
			for (int i : arr) {
				sb.append(i).append(" ");
			}
			sb.append('\n');
			return;
		}

		for (int i = 0; i < n; i++) {
			if (!visit[i]) { // 방문하지 않은 노드라면
				visit[i] = true;
				arr[depth] = i + 1;
				dfs(n, m, depth + 1);
				visit[i] = false; // 재귀가 끝난 후 방문을 false로 꼭 해야한다.
			}
		}
	}

}
