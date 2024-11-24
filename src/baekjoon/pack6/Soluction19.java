package baekjoon.pack6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Soluction19 {

	private static int count = 0;
	public static void main(String[] args) throws IOException {
		// 1. 입력값 받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[][] graph = new int[n + 1][n + 1];
		for (int i = 0; i < c; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int root = Integer.parseInt(st.nextToken());
			int node = Integer.parseInt(st.nextToken());
			// 양방향 연결
			graph[root][node] = 1;
			graph[node][root] = 1;
		}

		// 2. 정답 출력
		boolean[] vists = new boolean[n + 1];
		dfs(1, vists, graph);
		System.out.println(count);
	}

	private static void dfs(int node, boolean[] vists, int[][] graph) {
		vists[node] = true;

		for (int i = 0; i < graph[node].length; i++) {
			if (graph[node][i] == 1 && !vists[i]) {
				count++;
				dfs(i, vists, graph);
			}
		}
	}

}
