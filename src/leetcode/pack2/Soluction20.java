package leetcode.pack2;

/**
 * <a href="https://leetcode.com/problems/flatten-binary-tree-to-linked-list/description/?envType=problem-list-v2&envId=depth-first-search">
 * 문제링크
 * </a>
 */
public class Soluction20 {

	private static class TreeNode {
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
		TreeNode left = new TreeNode(2);
		TreeNode right = new TreeNode(3);
		TreeNode root = new TreeNode(1, left, right);
		flatten(root); // [1,null,2,null,3]

		// 테스트 2
		left = new TreeNode(
				2,
				new TreeNode(3),
				new TreeNode(4)
		);
		right = new TreeNode(
				5,
				null,
				new TreeNode(6)
		);
		root = new TreeNode(1, left, right);
		flatten(root); // [1,null,2,null,3,null,4,null,5,null,6]

		// 테스트 3
		left = new TreeNode(3);
		right = new TreeNode(2);
		root = new TreeNode(1, left, right);
		flatten(root); // []
	}

	public static void flatten(TreeNode root) {
		if (root == null) {
			return;
		}

		prevNode = null;
		helper(root);
	}

	private static TreeNode prevNode;
	private static TreeNode helper(TreeNode node) {
		if (node == null) {
			return null;
		}

		helper(node.right);
		helper(node.left);
		if (prevNode != null) {
			node.right = prevNode;
			node.left = null;
		}
		prevNode = node;

		return node;
	}

}

