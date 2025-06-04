package leetcode.pack3;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/balance-a-binary-search-tree/description/?envType=problem-list-v2&envId=greedy">
 * 문제링크
 * </a>
 */
public class Soluction19 {

	private static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
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
		// 테스트1
		TreeNode left = null;
		TreeNode right = new TreeNode(
				2,
				null,
				new TreeNode(
						3,
						null,
						new TreeNode(4)
				)
		);
		TreeNode root = new TreeNode(1, left, right);
		System.out.println(balanceBST(root)); // [2,1,3,null,null,null,4]

		// 테스트2
		left = new TreeNode(1);
		right = new TreeNode(3);
		root = new TreeNode(2, left, right);
		System.out.println(balanceBST(root)); // [2,1,3]
	}

	public static TreeNode balanceBST(TreeNode root) {
		List<TreeNode> list = new ArrayList<>();

		inOder(root, list);

		return makeBst(list, 0, list.size() - 1);
	}

	private static void inOder(TreeNode node, List<TreeNode> list) {
		if (node == null) {
			return;
		}

		inOder(node.left, list);
		list.add(node);
		inOder(node.right, list);
	}

	private static TreeNode makeBst(List<TreeNode> list, int left, int right) {
		if (left > right) {
			return null;
		}

		int mid = (left + right) / 2;
		TreeNode node = list.get(mid);
		node.left = makeBst(list, left, mid - 1);
		node.right = makeBst(list, mid + 1, right);
		return node;
	}

}
