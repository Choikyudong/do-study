package leetcode.pack3;

/**
 * <a href="https://leetcode.com/problems/find-valid-matrix-given-row-and-column-sums/description/?envType=problem-list-v2&envId=greedy">
 * 문제링크
 * </a>
 */
public class Soluction21 {

	public static void main(String[] args) {
		// 테스트1
		System.out.println(restoreMatrix(
				new int[]{3,8}, new int[]{4,7}
		)); // [[3,0], [1,7]]

		// 테스트2
		System.out.println(restoreMatrix(
				new int[]{5,7,10}, new int[]{8,6,8}
		)); // [[0,5,0],[6,1,0],[2,0,8]]
	}

	public static int[][] restoreMatrix(int[] rowSum, int[] colSum) {
		int rowLen = rowSum.length;
		int colLen = colSum.length;
		int[][] result = new int[rowLen][colLen];

		for (int i = 0; i < rowLen; i++) {
			for (int j = 0; j < colLen; j++) {
				int min = Math.min(colSum[j], rowSum[i]);
				result[i][j] = min;
				rowSum[i] -= min;
				colSum[j] -= min;
			}
		}

		return result;
	}

}
