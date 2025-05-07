package leetcode.pack1;

/**
 * <a href="https://leetcode.com/problems/island-perimeter/description/?envType=problem-list-v2&envId=depth-first-search">
 * 문제링크
 * </a>
 */
public class Soluction29 {

	public static void main(String[] args) {
		int[][] grid = new int[][]{
				{0, 1, 0, 0},
				{1, 1, 1, 0},
				{0, 1, 0, 0},
				{1, 1, 0, 0}
		};
		System.out.println(islandPerimeter(grid));

		grid = new int[][]{{1}};
		System.out.println(islandPerimeter(grid));

		grid = new int[][]{{1, 0}};
		System.out.println(islandPerimeter(grid));
	}

	public static int islandPerimeter(int[][] grid) {
		int sum = 0;
		int rowLength = grid.length;
		int colLength = grid[0].length;
		for (int row = 0; row < rowLength; row++) {
			for (int col = 0; col < colLength; col++) {
				if (grid[row][col] == 1) {
					// 양방향 확인
					int width = 4;
					if (row - 1 >= 0 && grid[row - 1][col] == 1) {
						width--;
					}

					if (row + 1 < rowLength && grid[row + 1][col] == 1) {
						width--;
					}

					if (col - 1 >= 0 && grid[row][col - 1] == 1) {
						width--;
					}

					if (col + 1 < colLength && grid[row][col + 1] == 1) {
						width--;
					}

					sum += width;
				}
			}
		}
		return sum;
	}

	/*
	참고해서 가져오건데 이 방법은 경계면을 구하는 방법임
	public static int islandPerimeter(int[][] grid) {
		if (grid == null) {
			return 0;
		}

		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[0].length; col++) {
				if (grid[row][col] == 1) {
					return helper(grid, row, col);
				}
			}
		}

		return 0;
	}

	public static int helper(int[][] grid, int row, int col) {
		if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length) return 1;
		if (grid[row][col] == 0) return 1;
		if (grid[row][col] == -1) return 0;

		grid[row][col] = -1;
		int sum = 0;
		sum += helper(grid, row + 1, col);
		sum += helper(grid, row - 1, col);
		sum += helper(grid, row, col + 1);
		sum += helper(grid, row, col - 1);

		return sum;
	}
	*/

}

