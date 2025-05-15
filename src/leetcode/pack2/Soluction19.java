package leetcode.pack2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/path-sum-ii/description/?envType=problem-list-v2&envId=depth-first-search">
 * 문제링크
 * </a>
 */
public class Soluction19 {

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
				4,
				new TreeNode(
						11,
						new TreeNode(7),
						new TreeNode(2)
				),
				null
		);
		TreeNode right = new TreeNode(
				8,
				new TreeNode(13),
				new TreeNode(
						4,
						new TreeNode(5),
						new TreeNode(1)
				)
		);
		TreeNode root = new TreeNode(5, left, right);
		System.out.println(pathSum(root, 22)); // [[5,4,11,2],[5,8,4,5]]

		// 테스트 2
		left = new TreeNode(3);
		right = new TreeNode(2);
		root = new TreeNode(1, left, right);
		System.out.println(pathSum(root, 22)); // []]
	}

	/*
	private static class Helper {
		int sum;
		TreeNode node;
		List<Integer> list;

		public Helper(int sum, TreeNode node, List<Integer> list) {
			this.sum = sum;
			this.node = node;
			this.list = list;
		}
	}

	public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
		if (root == null) {
			return new ArrayList<>();
		}

		List<List<Integer>> result = new ArrayList<>();
		Stack<Helper> stack = new Stack<>();
		List<Integer> list = new ArrayList<>();
		list.add(root.val);
		stack.push(new Helper(root.val, root, list));
		while (!stack.isEmpty()) {
			Helper curHelper = stack.pop();
			int sum = curHelper.sum;
			TreeNode node = curHelper.node;
			List<Integer> curlist = curHelper.list;

			if (sum == targetSum && (node.left == null && node.right == null)) {
				result.add(curlist);
			}

			if (node.right != null) {
				List<Integer> rightList = new ArrayList<>(curlist);
				rightList.add(node.right.val);
				stack.push(new Helper(sum + node.right.val, node.right, rightList));
			}

			if (node.left != null) {
				List<Integer> leftList = new ArrayList<>(curlist);
				leftList.add(node.left.val);
				stack.push(new Helper(sum + node.left.val, node.left, leftList));
			}
		}

		return result;
	}
	*/

	public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
		List<List<Integer>> result = new ArrayList<>();
		if (root == null) {
			return result;
		}
		helper(root, result, new ArrayList<>(), 0, targetSum);
		return result;
	}

	private static void helper(TreeNode node, List<List<Integer>> result, List<Integer> list, int curSum, int targetSum) {
		if (node == null) {
			return;
		}

		curSum += node.val;
		list.add(node.val);
		if (node.left == null && node.right == null && curSum == targetSum) {
			result.add(new ArrayList<>(list));
			list.remove(list.size() - 1);
			return;
		}

		helper(node.left, result, list, curSum, targetSum);
		helper(node.right, result, list, curSum, targetSum);
		list.remove(list.size() - 1);
	}

}

