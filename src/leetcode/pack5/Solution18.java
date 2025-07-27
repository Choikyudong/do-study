package leetcode.pack5;

/**
 * <a href="https://leetcode.com/problems/deepest-leaves-sum/description/">
 * 문제링크
 * </a>
 */
public class Solution18 {

	public static void main(String[] args) {
		Solution18 solution = new Solution18();

		// 테스트1 : 15
		TreeNode treeNode = new TreeNode(
				1,
				new TreeNode(
						2,
						new TreeNode(
								4,
								new TreeNode(7),
								null
						),
						new TreeNode(5)
				),
				new TreeNode(
						3,
						null,
						new TreeNode(
								6,
								null,
								new TreeNode(8)
						)
				)
		);
		System.out.println((solution.deepestLeavesSum(treeNode)));

		// 테스트2 : 19
		treeNode = new TreeNode(
				6,
				new TreeNode(
						7,
						new TreeNode(
								2,
								new TreeNode(9),
								null
						),
						new TreeNode(
								7,
								new TreeNode(1),
								new TreeNode(4)
						)
				),
				new TreeNode(
						8,
						new TreeNode(1),
						new TreeNode(
								3,
								null,
								new TreeNode(5)
						)
				)
		);
		System.out.println((solution.deepestLeavesSum(treeNode)));
	}

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		TreeNode(int val) {
			this.val = val;
		}
		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public int deepestLeavesSum(TreeNode root) {
		int maxDepth = depthHelper(root, 0);
		return sumHelper(root, 0, maxDepth);
	}

	private int depthHelper(TreeNode node, int depth) {
		if (node == null) {
			return depth - 1;
		}

		if (node.left == null && node.right == null) {
			return depth;
		}

		int left = depthHelper(node.left, depth + 1);
		int right = depthHelper(node.right, depth + 1);
		return Math.max(left, right);
	}

	private int sumHelper(TreeNode node, int depth, int maxDepth) {
		if (node == null) {
			return 0;
		}

		if (depth == maxDepth && node.left == null && node.right == null) {
			return node.val;
		}

		int left = sumHelper(node.left, depth + 1, maxDepth);
		int right = sumHelper(node.right, depth + 1, maxDepth);
		return left + right;
	}

}
