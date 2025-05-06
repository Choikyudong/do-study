package leetcode.pack1;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/binary-tree-preorder-traversal/description/?envType=problem-list-v2&envId=depth-first-search">
 * 문제링크
 * </a>
 */
public class Soluction23 {

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
		TreeNode leftNode = null;
		TreeNode rightNode = new TreeNode(
				2,
				new TreeNode(3,
						null,
						null
				),
				null
		);
		TreeNode root = new TreeNode(1, null, rightNode);
		System.out.println(preorderTraversal(root)); // [1,2,3]

		// 테스트 2
		leftNode = new TreeNode(
				2,
				new TreeNode(
						4,
						null,
						null
				),
				new TreeNode(
						5,
						new TreeNode(
								6,
								null,
								null
						),
						new TreeNode(
								7,
								null,
								null
						)
				)
		);
		rightNode = new TreeNode(
				3,
				null,
				new TreeNode(
						8,
						new TreeNode(
								9,
								null,
								null
						),
						null
				)
		);
		root = new TreeNode(1, leftNode, rightNode);
		System.out.println(preorderTraversal(root)); // [1,2,4,5,6,7,3,8,9]
	}

	public static List<Integer> preorderTraversal(TreeNode root) {
		if (root == null) {
			return new ArrayList<>();
		}

		List<Integer> result = new ArrayList<>();
		Stack<TreeNode> treeNodes = new Stack<>();
		treeNodes.push(root);
		while (!treeNodes.isEmpty()) {
			TreeNode treeNode = treeNodes.pop();
			if (treeNode != null) {
				result.add(treeNode.val);
				treeNodes.push(treeNode.right);
				treeNodes.push(treeNode.left);
			}
		}

		return result;
	}

}

