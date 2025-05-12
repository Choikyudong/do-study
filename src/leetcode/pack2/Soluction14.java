package leetcode.pack2;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/leaf-similar-trees/description/?envType=problem-list-v2&envId=depth-first-search">
 * 문제링크
 * </a>
 */
public class Soluction14 {

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
		TreeNode leftNode1 = new TreeNode(
				5,
				new TreeNode(6),
				new TreeNode(
						2,
						new TreeNode(7),
						new TreeNode(4)
				)
		);
		TreeNode rightNode1 = new TreeNode(
				1,
				new TreeNode(9),
				new TreeNode(8)
		);
		TreeNode root1 = new TreeNode(3, leftNode1, rightNode1);

		TreeNode leftNode2 = new TreeNode(5, new TreeNode(6), new TreeNode(7));
		TreeNode rightNode2 = new TreeNode(
				1,
				new TreeNode(4),
				new TreeNode(
						2,
						new TreeNode(9),
						new TreeNode(8)
				)
		);
		TreeNode root2 = new TreeNode(3, leftNode2, rightNode2);
		System.out.println(leafSimilar(root1, root2)); // true

		// 테스트 2
		leftNode1 = new TreeNode(2);
		rightNode1 = new TreeNode(3);
		root1 = new TreeNode(1, leftNode1, rightNode1);

		leftNode2 = new TreeNode(3);
		rightNode2 = new TreeNode(2);
		root2 = new TreeNode(1, leftNode2, rightNode2);
		System.out.println(leafSimilar(root1, root2)); // 1
	}

	public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
		if (root1 == null || root2 == null) {
			return false;
		}

		List<Integer> root1List = new ArrayList<>();
		helper(root1, root1List);

		List<Integer> root2List = new ArrayList<>();
		helper(root2, root2List);

		return root1List.equals(root2List);
	}

	public static void helper(TreeNode node, List<Integer> list) {
		if (node == null) {
			return;
		}

		helper(node.left, list);
		if (node.left == null && node.right == null) {
			list.add(node.val);
		}
		helper(node.right, list);
	}

}

