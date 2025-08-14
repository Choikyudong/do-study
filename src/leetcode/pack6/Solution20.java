package leetcode.pack6;

/**
 * <a href="https://leetcode.com/problems/find-the-number-of-winning-players/">
 * 문제링크
 * </a>
 */
public class Solution20 {

	public static void main(String[] args) {
		Solution20 solution = new Solution20();

		// 테스트1 : 2
		System.out.println((solution.winningPlayerCount(
				4,
				new int[][]{{0,0}, {1,0}, {1,0}, {2, 1}, {2, 1}, {2, 0}}
		)));

		// 테스트2 : 0
		System.out.println((solution.winningPlayerCount(
				5,
				new int[][]{{1,1}, {1,2}, {1,3}, {1,4}}
		)));

		// 테스트3 : 1
		System.out.println((solution.winningPlayerCount(
				5,
				new int[][]{{1,1}, {2,4}, {2,4}, {2,4}}
		)));
	}

	/* 조금 느림
	public int winningPlayerCount(int n, int[][] picks) {
		Map<Integer, Map<Integer, Integer>> map = new HashMap<>();

		for (int[] pick : picks) {
			int x = pick[0];
			int y = pick[1];
			map.computeIfAbsent(x, k -> new HashMap<>())
					.merge(y, 1, Integer::sum);
		}

		int ans = 0;
		for (int key : map.keySet()) {
			for (int subKey : map.get(key).keySet()) {
				int count = map.get(key).get(subKey);
				if (count >= key + 1) {
					ans++;
					break;
				}
			}
		}
		return ans;
	}
	*/

	public int winningPlayerCount(int n, int[][] picks) {
		int[][] balls = new int[n][10 + 1];
		for (int[] pick : picks) {
			final int player = pick[0];
			final int color = pick[1];
			++balls[player][color];
		}

		int ans = 0;
		for (int i = 0; i < n; i++) {
			int max = 0;
			for (final int freq : balls[i]) {
				max = Math.max(max, freq);
			}
			if (max > i) {
				ans++;
			}
		}
		return ans;
	}

}

