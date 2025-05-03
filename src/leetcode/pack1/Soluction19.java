package leetcode.pack1;

/**
 * <a href="https://leetcode.com/problems/maximum-depth-of-binary-tree/description/?envType=problem-list-v2&envId=depth-first-search">
 * 문제링크
 * </a>
 */
public class Soluction19 {

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
			20, new TreeNode(15, null, null), new TreeNode(7, null, null)
		);
		TreeNode root = new TreeNode(3, leftNode, rightNode);
		System.out.println(maxDepth(root)); // 3


		// 테스트2
		rightNode = new TreeNode(2, null, null);
		root = new TreeNode(1, null, rightNode);
		System.out.println(maxDepth(root)); // 2
	}

	public static int maxDepth(TreeNode root) {
		return dfs(root, 0);
	}

	public static int dfs(TreeNode root, int depth) {
		if (root == null) {
			return depth;
		}

		return Math.max(dfs(root.left, depth + 1), dfs(root.right, depth + 1));
	}

	/* 조금 더 단순한 방식
	public static int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}

		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	}
	*/

}

