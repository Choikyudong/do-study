package leetcode.pack1;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/find-if-path-exists-in-graph/description/?source=submission-ac">
 * 문제링크
 * </a>
 */
public class Soluction16 {

	public static void main(String[] args) {
		int n = 3;
		int[][] edges = new int[][]{{0,1},{1,2},{2,0}};
		int source = 0;
		int destination = 2;
		System.out.println(validPath(n, edges, source, destination));

		n = 6;
		edges = new int[][]{{0,1},{0,2},{3,5},{5,4},{4,3}};
		source = 0;
		destination = 5;
		System.out.println(validPath(n, edges, source, destination));
	}

	public static boolean validPath(int n, int[][] edges, int source, int destination) {
		List<List<Integer>> graph = new ArrayList<>(); // 인접 리스트를 구현하기 위해 채택함
		for (int i = 0; i < n; i++) {
			graph.add(new ArrayList<>());
		}

		for (int[] edge : edges) {
			int edgeX = edge[0];
			int edgeY = edge[1];
			graph.get(edgeX).add(edgeY);
			graph.get(edgeY).add(edgeX);
		}

		boolean[] vistied = new boolean[n];
		return dfs(graph, vistied, source, destination);
	}

	public static boolean dfs(List<List<Integer>> graph, boolean[] visteid, int source, int destination) {
		// 종료조건
		if (source == destination) {
			return true;
		}

		visteid[source] = true;
		for (int neighbor : graph.get(source)) {
			if (!visteid[neighbor] && dfs(graph, visteid, neighbor, destination)) {
				return true;
			}
		}
		return false;
	}

}

