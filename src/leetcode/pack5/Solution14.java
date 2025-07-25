package leetcode.pack5;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/find-center-of-star-graph/description/">
 * 문제링크
 * </a>
 */
public class Solution14 {

	public static void main(String[] args) {
		Solution14 solution = new Solution14();

		// 테스트1 : 2
		System.out.println((solution.findCenter(new int[][]{{1,2},{2,3},{4,2}})));

		// 테스트2 : 1
		System.out.println((solution.findCenter(new int[][]{{1,2},{5,1},{1,3},{1,4}})));
	}

	/* 넘 느림
	public int findCenter(int[][] edges) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int[] edge : edges) {
			map.put(edge[0], map.getOrDefault(edge[0], 0) + 1);
			map.put(edge[1], map.getOrDefault(edge[1], 0) + 1);
		}

		int ans = 0;
		int max = 0;
		for (int key : map.keySet()) {
			if (map.get(key) > max) {
				ans = key;
				max = map.get(key);
			}
		}
		return ans;
	}
	*/

	public int findCenter(int[][] edges) {
		return edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1] ? edges[0][0] : edges[0][1];
	}

}
