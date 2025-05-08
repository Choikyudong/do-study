package leetcode.pack2;

/**
 * <a href="https://leetcode.com/problems/subtree-of-another-tree/description/?envType=problem-list-v2&envId=depth-first-search">
 * 문제링크
 * </a>
 */
public class Soluction4 {

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
				4,
				new TreeNode(1),
				new TreeNode(2)
		);
		TreeNode rightNode = new TreeNode(5);
		TreeNode root = new TreeNode(1, leftNode, rightNode);
		TreeNode subRoot = new TreeNode(
				4,
				new TreeNode(1),
				new TreeNode(2)
		);
		System.out.println(isSubtree(root, subRoot)); // true

		// 테스트 2
		leftNode = new TreeNode(
				4,
				new TreeNode(1),
				new TreeNode(
						2,
						new TreeNode(0),
						null
				)
		);
		rightNode = new TreeNode(5);
		root = new TreeNode(3, leftNode, rightNode);
		subRoot = new TreeNode(
				4,
				new TreeNode(1),
				new TreeNode(2)
		);
		System.out.println(isSubtree(root, subRoot)); // false
	}

	public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
		if (root == null || subRoot == null) {
			return false;
		}

		if (root.val == subRoot.val && helper(root, subRoot)) {
			return true;
		}

		return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
	}

	private static boolean helper(TreeNode root, TreeNode subRoot) {
		if (root == null && subRoot == null) {
			return true;
		}

		if (root == null || subRoot == null || root.val != subRoot.val) {
			return false;
		}

		return helper(root.left, subRoot.left) && helper(root.right, subRoot.right);
	}

}

