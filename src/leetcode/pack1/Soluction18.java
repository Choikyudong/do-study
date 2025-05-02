package leetcode.pack1;

import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/symmetric-tree/description/?envType=problem-list-v2&envId=depth-first-search">
 * 문제링크
 * </a>
 */
public class Soluction18 {

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
		TreeNode leftNode = new TreeNode(
				2, new TreeNode(3, null, null), new TreeNode(4, null, null)
		);
		TreeNode rightNode = new TreeNode(
				2, new TreeNode(4, null, null), new TreeNode(3, null, null)
		);
		TreeNode root = new TreeNode(1, leftNode, rightNode);
		System.out.println(isSymmetric(root));

		// 테스트 2
		leftNode = new TreeNode(
				2, null, new TreeNode(3, null, null)
		);
		rightNode = new TreeNode(
				2, null, new TreeNode(3, null, null)
		);
		root = new TreeNode(1, leftNode, rightNode);
		System.out.println(isSymmetric(root));

		// 테스트 3
		root = new TreeNode(1);
		System.out.println(isSymmetric(root));
	}

	public static boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return false;
		}

		Stack<TreeNode[]> stack = new Stack<>();
		stack.push(new TreeNode[]{root.left, root.right});
		while (!stack.isEmpty()) {
			TreeNode[] treeNodes = stack.pop();
			TreeNode leftNode = treeNodes[0];
			TreeNode rightNode = treeNodes[1];

			if (leftNode == null && rightNode == null) {
				continue;
			}

			if (leftNode == null || rightNode == null || leftNode.val != rightNode.val) {
				return false;
			}

			stack.push(new TreeNode[]{leftNode.left, rightNode.right});
			stack.push(new TreeNode[]{leftNode.right, rightNode.left});
		}

		return true;
	}

}

