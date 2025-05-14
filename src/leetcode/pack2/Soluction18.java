package leetcode.pack2;

/**
 * <a href="https://leetcode.com/problems/word-search/description/?envType=problem-list-v2&envId=depth-first-search">
 * 문제링크
 * </a>
 */
public class Soluction18 {

	public static void main(String[] args) {
		// 테스트 1
		char[][] board = {
				{'A', 'B', 'C', 'E'},
				{'S', 'F', 'C', 'S'},
				{'A', 'D', 'E', 'E'},
		};
		System.out.println(exist(board, "ABCCED")); // true

		// 테스트2
		System.out.println(exist(board, "SEE")); // true

		// 테스트3
		System.out.println(exist(board, "ABCB")); // false
	}

	/* 너무 느림!
	public static boolean exist(char[][] board, String word) {
		if (board == null || word == null) {
			return false;
		}

		int m = board.length;
		int n = board[0].length;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				char c = board[i][j];
				if (c == word.charAt(0) && dfs(board, i, j, word, "", new boolean[m][n])) {
					return true;
				}
			}
		}

		return false;
	}

	private static boolean dfs(char[][] board, int m, int n, String target, String word, boolean[][] vistied) {
		if (m < 0 || m >= board.length || n < 0 || n >= board[0].length || vistied[m][n]) {
			return false;
		}

		word += board[m][n];
		boolean up = false;
		boolean down = false;
		boolean left = false;
		boolean right = false;
		vistied[m][n] = true;
		if (word.equals(target)) {
			return true;
		} else if (target.contains(word)) {
			up = dfs(board, m + 1, n, target, word, vistied);
			down = dfs(board, m - 1, n, target, word, vistied);
			left = dfs(board, m, n - 1, target, word, vistied);
			right = dfs(board, m, n + 1, target, word, vistied);
		}
		vistied[m][n] = false;

		return left || right || up || down;
	}
	*/

	public static boolean exist(char[][] board, String word) {
		if (board == null || word == null) {
			return false;
		}

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (dfs(board, i, j, word, 0)) {
					return true;
				}
			}
		}

		return false;
	}

	private static boolean dfs(char[][] board, int m, int n, String target, int index) {
		if (m < 0 || m >= board.length || n < 0 || n >= board[0].length
				|| board[m][n] != target.charAt(index)) {
			return false;
		}

		char temp = board[m][n];
		board[m][n] = '#';
		if (index == target.length() - 1) {
			return true;
		}

		boolean up = dfs(board, m + 1, n, target, index + 1);
		boolean down = dfs(board, m - 1, n, target, index + 1);
		boolean left = dfs(board, m, n - 1, target, index + 1);
		boolean right = dfs(board, m, n + 1, target, index + 1);

		board[m][n] = temp;
		return left || right || up || down;
	}

}

