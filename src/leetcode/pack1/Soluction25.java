package leetcode.pack1;

/**
 * <a href="https://leetcode.com/problems/invert-binary-tree/description/?envType=problem-list-v2&envId=depth-first-search">
 * 문제링크
 * </a>
 */
public class Soluction25 {

	public static void main(String[] args) {
		// 테스트 1
		TreeNode leftNode = new TreeNode(
				1,
				null,
				null
		);
		TreeNode rightNode = new TreeNode(
				3,
				null,
				null
		);
		TreeNode root = new TreeNode(2, leftNode, rightNode);
		System.out.println(invertTree(root)); // [2,3,1]

		// 테스트 2
		leftNode = new TreeNode(
				2,
				new TreeNode(
						1,
						null,
						null
				),
				new TreeNode(
						3,
						null,
						null
				)
		);
		rightNode = new TreeNode(
				7,
				new TreeNode(
						6,
						null,
						null
				),
				new TreeNode(
						9,
						null,
						null
				)
		);
		root = new TreeNode(4, leftNode, rightNode);
		System.out.println(invertTree(root)); // [4,7,2,9,6,3,1]

		root = null;
		System.out.println(invertTree(root)); // [4,7,2,9,6,3,1]
	}

	public static TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return null;
		}

		TreeNode leftNode = invertTree(root.left);
		TreeNode rightNode = invertTree(root.right);

		// swap
		root.left = rightNode;
		root.right = leftNode;
		return root;
	}

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

}

