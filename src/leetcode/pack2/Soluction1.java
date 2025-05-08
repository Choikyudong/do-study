package leetcode.pack2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/minimum-absolute-difference-in-bst/?envType=problem-list-v2&envId=depth-first-search">
 * 문제링크
 * </a>
 */
public class Soluction1 {

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
		TreeNode rightNode = new TreeNode(
				6,
				null,
				null
		);
		TreeNode root = new TreeNode(4, leftNode, rightNode);
//		System.out.println(getMinimumDifference(root)); // 1

		// 테스트 2
		leftNode = new TreeNode(
				0,
				null,
				null
		);
		rightNode = new TreeNode(
				48,
				new TreeNode(
						12,
						null,
						null
				),
				new TreeNode(
						49,
						null,
						null
				)
		);
		root = new TreeNode(1, leftNode, rightNode);
		System.out.println(getMinimumDifference(root)); // 1

		// 테스트 3
		leftNode = new TreeNode(
				4,
				null,
				null
		);
		rightNode = new TreeNode(
				7,
				null,
				null
		);
		root = new TreeNode(5, leftNode, rightNode);
//		System.out.println(getMinimumDifference(root)); // 1

		// 테스트 3
		leftNode = new TreeNode(
				104,
				null,
				new TreeNode(
						227,
						null,
						null
				)
		);
		rightNode = new TreeNode(
				701,
				null,
				new TreeNode(
						911,
						null,
						null
				)
		);
		root = new TreeNode(236, leftNode, rightNode);
//		System.out.println(getMinimumDifference(root)); // 9
	}

	/* 왜케 느림!
	public static int getMinimumDifference(TreeNode root) {
		if (root == null) {
			return 0;
		}

		Stack<TreeNode> stack = new Stack<>();
		List<Integer> list = new ArrayList<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			list.add(node.val);

			if (node.left != null) {
				stack.push(node.left);
			}

			if (node.right != null) {
				stack.push(node.right);
			}
		}

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				int diff = list.get(i) - list.get(j);
				min = Math.min(min, Math.abs(diff));
			}
		}
		return min;
	}
	*/

	private static Integer min = Integer.MAX_VALUE;
	public static int getMinimumDifference(TreeNode root) {
		if (root == null) {
			return 0;
		}
		helper(root);
		return min;
	}

	private static Integer prev = null; // 필수임
	private static void helper(TreeNode node){
		if (node == null) {
			return;
		}
		helper(node.left);
		if (prev != null) {
			min = Math.min(min, node.val - prev);
		}
		prev = node.val;
		helper(node.right);
	}


}

