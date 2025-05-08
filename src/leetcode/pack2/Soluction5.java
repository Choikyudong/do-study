package leetcode.pack2;

/**
 * <a href="https://leetcode.com/problems/subtree-of-another-tree/description/?envType=problem-list-v2&envId=depth-first-search">
 * 문제링크
 * </a>
 */
public class Soluction5 {

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
		TreeNode root1 = new TreeNode(
				1,
				new TreeNode(
						3,
						new TreeNode(5),
						null
				),
				new TreeNode(2)
		);
		TreeNode root2 = new TreeNode(
				2,
				new TreeNode(
						1,
						null,
						new TreeNode(4)
				),
				new TreeNode(
						1,
						null,
						new TreeNode(4)
				)
		);
		TreeNode result = mergeTrees(root1, root2); // [3,4,5,5,4,null,7]

		// 테스트 2
		root1 = new TreeNode(1);
		root2 = new TreeNode(
				1,
				new TreeNode(2),
				null
		);
		result = mergeTrees(root1, root2); // [2,2]

		// 테스트 2
		root1 = null;
		root2 = null;
		result = mergeTrees(root1, root2); // [2,2]
	}

	/* 좀 많이 길다.
	public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null) {
			return null;
		}
		TreeNode newNode = new TreeNode();
		helper(root1, root2, newNode);
		return newNode;
	}

	private static void helper(TreeNode node1, TreeNode node2, TreeNode newNode) {
		int val = 0;
		if (node1 != null) {
			val += node1.val;
		}

		if (node2 != null) {
			val += node2.val;
		}

		newNode.val = val;
		if (node1 != null && node1.left != null && node2 != null && node2.left != null) {
			newNode.left = new TreeNode();
			helper(node1.left, node2.left, newNode.left);
		} else if (node1 != null && node1.left != null) {
			newNode.left = new TreeNode();
			helper(node1.left, null, newNode.left);
		} else if (node2 != null && node2.left != null) {
			newNode.left = new TreeNode();
			helper(null, node2.left, newNode.left);
		}

		if (node1 != null && node1.right != null && node2 != null && node2.right != null) {
			newNode.right = new TreeNode();
			helper(node1.right, node2.right, newNode.right);
		} else if (node1 != null && node1.right != null) {
			newNode.right = new TreeNode();
			helper(node1.right, null, newNode.right);
		} else if (node2 != null && node2.right != null) {
			newNode.right = new TreeNode();
			helper(null, node2.right, newNode.right);
		}
	}
	*/

	public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
		if (root1 == null) {
			return root2;
		}
		if (root2 == null) {
			return root1;
		}
		root1.val += root2.val;
		root1.left = mergeTrees(root1.left, root2.left);
		root1.right = mergeTrees(root1.right, root2.right);
		return root1;
	}

}

