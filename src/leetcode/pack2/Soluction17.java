package leetcode.pack2;

/**
 * <a href="https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/?envType=problem-list-v2&envId=depth-first-search">
 * 문제링크
 * </a>
 */
public class Soluction17 {

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
		TreeNode left = new TreeNode(
				1,
				new TreeNode(0),
				new TreeNode(2, null, new TreeNode(3))
		);
		TreeNode right = new TreeNode(
				6,
				new TreeNode(5),
				new TreeNode(7, null, new TreeNode(8))
		);
		TreeNode root = new TreeNode(4, left, right);
		TreeNode result = bstToGst(root);
//		System.out.println(result); // [30,36,21,36,35,26,15,null,null,null,33,null,null,null,8]

		// 테스트 2
		right = new TreeNode(1);
		root = new TreeNode(1, null, right);
		result = bstToGst(root);
		System.out.println(result); // [1,null,1]
	}

	private static Integer prev = null;
	public static TreeNode bstToGst(TreeNode root) {
		if (root == null) {
			return null;
		}

		if (root.right != null) {
			bstToGst(root.right);
		}

		if (prev != null) {
			root.val = prev + root.val;
		}
		prev = root.val;

		if (root.left != null) {
			bstToGst(root.left);
		}

		return root;
	}

}

