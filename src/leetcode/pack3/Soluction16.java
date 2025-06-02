package leetcode.pack3;

/**
 * <a href="https://leetcode.com/problems/max-increase-to-keep-city-skyline/description/?envType=problem-list-v2&envId=greedy">
 * 문제링크
 * </a>
 */
public class Soluction16 {

	public static void main(String[] args) {
		// 테스트1
		System.out.println(maxIncreaseKeepingSkyline(
				new int[][]{
					{3,0,8,4},
					{2,4,5,7},
					{9,2,6,3},
					{0,3,1,0}
				}
		)); // 35

		// 테스트2
		System.out.println(maxIncreaseKeepingSkyline(
				new int[][]{
					{0,0,0},
					{0,0,0},
					{0,0,0},
				}
		)); // 0

		// 테스트3
		System.out.println(maxIncreaseKeepingSkyline(
				new int[][]{
					{59,88,44},
					{3,18,38},
					{21,26,51},
				}
		)); // 117
	}

	public static int maxIncreaseKeepingSkyline(int[][] grid) {
		int n = grid.length;
		int[] rows = new int[n];
		int[] cols = new int[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				rows[j] = Math.max(rows[j], grid[i][j]);
				cols[j] = Math.max(cols[j], grid[j][i]);
			}
		}

		int result = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int dis = Math.min(rows[i], cols[j]);
				result += dis - grid[i][j];
			}
		}
		return result;
	}

}
