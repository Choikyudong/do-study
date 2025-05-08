package leetcode.pack1;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/find-mode-in-binary-search-tree/description/?envType=problem-list-v2&envId=depth-first-search">
 * 문제링크
 * </a>
 */
public class Soluction30 {

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
		TreeNode rightNode = new TreeNode(
				2,
				new TreeNode(
						2,
						null,
						null
				),
				null
		);
		TreeNode root = new TreeNode(1, null, rightNode);
//		System.out.println(Arrays.toString(findMode(root))); // [2]

		// 테스트 2
		root = new TreeNode(0, null, null);
//		System.out.println(Arrays.toString(findMode(root))); // [0]

		// 테스트 3
		TreeNode leftNode = new TreeNode(
				0,
				new TreeNode(
						0,
						new TreeNode(
								0,
								null,
								null
						),
						null
				),
				new TreeNode(
						0,
						null,
						null
				)
		);
		rightNode = new TreeNode(
				1,
				new TreeNode(
						1,
						null,
						null
				),
				new TreeNode(
						1,
						null,
						null
				)
		);
		root = new TreeNode(1, leftNode, rightNode);
		System.out.println(Arrays.toString(findMode(root))); // [1,0,1,0,0,1,1,0]
	}

	/* 너무 느림..
	public static int[] findMode(TreeNode root) {
		if (root == null) {
			return new int[0];
		}

		Map<Integer, Integer> counts = new HashMap<>();
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		int maxCount = 0;
		while (!stack.isEmpty()) {
			TreeNode treeNode = stack.pop();
			if (treeNode == null) {
				continue;
			}

			int count = counts.getOrDefault(treeNode.val, 0) + 1;
			counts.put(treeNode.val, count);
			maxCount = Math.max(count, maxCount);

			if (treeNode.left != null) {
				stack.push(treeNode.left);
			}

			if (treeNode.right != null) {
				stack.push(treeNode.right);
			}
		}

		List<Integer> list = new ArrayList<>();
		for (Map.Entry<Integer, Integer> count : counts.entrySet()) {
			if (count.getValue() == maxCount) {
				list.add(count.getKey());
			}
		}

		int[] result = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}
		Arrays.sort(result);
		return result;
	}
	*/

	// 좀 더 복잡하지만 이전 코드에 비해 10배 빨라짐
	public static int[] findMode(TreeNode root) {
		if (root == null) {
			return new int[0];
		}

		List<Integer> list = new ArrayList<>();
		helper(root, list, new Mode());

		int[] result = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}
		return result;
	}

	public static void helper(TreeNode node, List<Integer> list, Mode mode) {
		if (node == null) {
			return;
		}

		helper(node.left, list, mode);
		if (mode.prevNum != null && node.val == mode.prevNum) {
			mode.curCount++;
		} else {
			mode.curCount = 1;
			mode.prevNum = node.val;
		}

		if (mode.maxCount < mode.curCount) {
			mode.maxCount = mode.curCount;
			list.clear();
			list.add(node.val);
		} else if (mode.curCount == mode.maxCount) {
			list.add(node.val);
		}

		helper(node.right, list, mode);
	}

	private static class Mode {
		int maxCount = 0;
		int curCount = 1;
		Integer prevNum = null;
	}

}

