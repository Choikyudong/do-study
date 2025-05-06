package leetcode.pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/binary-tree-postorder-traversal/description/?envType=problem-list-v2&envId=depth-first-search">
 * 문제링크
 * </a>
 */
public class Soluction24 {

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
//		System.out.println(postorderTraversal(root)); // [3,2,1]

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
		System.out.println(postorderTraversal(root)); // [4,6,7,5,2,9,8,3,1]
	}

	public static List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		if (root == null) {
			return new ArrayList<>();
		}

		if (root.left != null) {
			List<Integer> leftList = postorderTraversal(root.left);
			list.addAll(leftList);
		}

		if (root.right != null) {
			List<Integer> rightList = postorderTraversal(root.right);
			list.addAll(rightList);
		}

		list.add(root.val);
		return list;
	}

	/*
	public static List<Integer> postorderTraversal(TreeNode root) {
		if (root == null) {
			return new ArrayList<>();
		}

		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		List<Integer> list = new ArrayList<>();
		while (!stack.isEmpty()) {
			TreeNode treeNode = stack.pop();
			if (treeNode.left != null) {
				stack.push(treeNode.left);
			}

			if (treeNode.right != null) {
				stack.push(treeNode.right);
			}

			list.add(treeNode.val);
		}

		Collections.reverse(list);
		return list;
	}
	*/

}

