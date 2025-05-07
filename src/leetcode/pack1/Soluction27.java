package leetcode.pack1;

/**
 * <a href="https://leetcode.com/problems/evaluate-boolean-binary-tree/description/?envType=problem-list-v2&envId=depth-first-search">
 * 문제링크
 * </a>
 */
public class Soluction27 {

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
				1,
				null,
				null
		);
		TreeNode rightNode = new TreeNode(
				3,
				new TreeNode(
						0,
						null,
						null
				),
				new TreeNode(
						1,
						null,
						null
				)
		);
		TreeNode root = new TreeNode(2, leftNode, rightNode);
		System.out.println(evaluateTree(root)); // true

		// 테스트 2
		root = new TreeNode(0, null, null);
		System.out.println(evaluateTree(root)); // false
	}

	public static boolean evaluateTree(TreeNode root) {
		if (root == null) {
			return false;
		}

		if (root.val == 0) {
			return false;
		}

		if (root.val == 1) {
			return true;
		}

		if (root.val == 2) {
			return evaluateTree(root.left) || evaluateTree(root.right);
		} else {
			return evaluateTree(root.left) && evaluateTree(root.right);
		}
	}

}

