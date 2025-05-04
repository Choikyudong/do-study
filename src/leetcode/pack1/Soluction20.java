package leetcode.pack1;

/**
 * <a href="https://leetcode.com/problems/balanced-binary-tree/description/?envType=problem-list-v2&envId=depth-first-search">
 * 문제링크
 * </a>
 */
public class Soluction20 {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		TreeNode(int val) { this.val = val; }
		TreeNode(int val, TreeNode left, TreeNode right) {
		  this.val = val;
		  this.left = left;
		  this.right = right;
		}
	}

	public static void main(String[] args) {
		// 테스트 1
		TreeNode leftNode = new TreeNode(9, null, null);
		TreeNode rightNode = new TreeNode(
			20,
			new TreeNode(15, null, null),
			new TreeNode(7, null, null)
		);
		TreeNode root = new TreeNode(3, leftNode, rightNode);
		System.out.println(isBalanced(root)); // true

	/*	// 테스트2
		leftNode = new TreeNode(
				2,
				new TreeNode(3,
						new TreeNode(4, null, null),
						new TreeNode(4, null, null)
				),
				new TreeNode(3, null, null)
		);
		rightNode = new TreeNode(2, null, null);
		root = new TreeNode(1, leftNode, rightNode);
		System.out.println(isBalanced(root)); // false

		// 테스트3
		root = new TreeNode(1, null, null);
		System.out.println(isBalanced(root)); // true

		// 테스트4
		rightNode = new TreeNode(
				2,
				null,
				new TreeNode(3, null, null)
		);
		root = new TreeNode(1, null, rightNode);
		System.out.println(isBalanced(root)); // false*/

		// 테스트5
		leftNode = new TreeNode(
				2,
				new TreeNode(
						3,
						new TreeNode(4, null, null),
						null
				),
				null
		);
		rightNode = new TreeNode(
				2,
				null,
				new TreeNode(
						3,
						null,
						new TreeNode(4, null, null)
				)
		);
		root = new TreeNode(1, leftNode, rightNode);
		System.out.println(isBalanced(root)); // false
	}

	public static boolean isBalanced(TreeNode root) {
		if (root == null) {
			return true;
		}

		return dfs(root) != -1;
	}

	public static int dfs(TreeNode node) {
		if (node == null) {
			return 0;
		}

		int left = dfs(node.left);
		if (left == -1) {
			return -1;
		}

		int right = dfs(node.right);
		if (right == -1) {
			return -1;
		}

		// 높이 계산
		int height = Math.abs(left - right);
		if (height >= 2) {
			return -1;
		}

		return Math.max(left, right) + 1;
	}

}

