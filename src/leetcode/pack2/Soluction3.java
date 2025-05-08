package leetcode.pack2;

/**
 * <a href="https://leetcode.com/problems/binary-tree-tilt/description/?envType=problem-list-v2&envId=depth-first-search">
 * 문제링크
 * </a>
 */
public class Soluction3 {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public static void main(String[] args) {
		// 테스트 1
		TreeNode leftNode = new TreeNode(
				2,
				null,
				null
		);
		TreeNode rightNode = new TreeNode(
				3,
				null,
				null
		);
		TreeNode root = new TreeNode(1, leftNode, rightNode);
//		System.out.println(findTilt(root)); // 1

		// 테스트 2
		leftNode = new TreeNode(
				2,
				new TreeNode(
						3,
						null,
						null
				),
				new TreeNode(
						5,
						null,
						null
				)
		);
		rightNode = new TreeNode(
				9,
				null,
				new TreeNode(
						7,
						null,
						null
				)
		);
		root = new TreeNode(4, leftNode, rightNode);
		System.out.println(findTilt(root)); // 15

		// 테스트 3
		leftNode = new TreeNode(
				7,
				new TreeNode(
						1,
						new TreeNode(3),
						new TreeNode(3)
				),
				new TreeNode(
						1,
						null,
						null
				)
		);
		rightNode = new TreeNode(
				14,
				new TreeNode(
						2,
						null,
						null
				),
				new TreeNode(
						2,
						null,
						null
				)
		);
		root = new TreeNode(21, leftNode, rightNode);
		System.out.println(findTilt(root)); // 9
	}

	private static int sum = 0;
	public static int findTilt(TreeNode root) {
		sum = 0;
		helper(root);
		return sum;
	}

	private static int helper(TreeNode node) {
		if (node == null) {
			return 0;
		}

		if (node.left == null && node.right == null) {
			return node.val;
		}

		int left = helper(node.left);
		int right = helper(node.right);
		sum += Math.abs(left - right);
		return node.val + left + right;
	}

}

