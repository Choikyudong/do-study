package leetcode.pack2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * <a href="https://leetcode.com/problems/binary-tree-right-side-view/description/?envType=problem-list-v2&envId=depth-first-search">
 * 문제링크
 * </a>
 */
public class Soluction24 {

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
				2,
				null,
				new TreeNode(5)
		);
		TreeNode right = new TreeNode(
				3,
				null,
				new TreeNode(4)
		);
		TreeNode root = new TreeNode(1, left, right);
		System.out.println(rightSideView(root)); // 2

		// 테스트 2
		left = new TreeNode(
				2,
				new TreeNode(
						4,
						new TreeNode(5),
						null
				),
				null
		);
		right = new TreeNode(3);
		root = new TreeNode(1, left, right);
		System.out.println(rightSideView(root)); // 3
	}

	public static List<Integer> rightSideView(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		if (root == null) {
			return result;
		}

		Queue<TreeNode> queue = new ArrayDeque<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			int length = queue.size();
			boolean isInsert = true;
			for (int i = 0; i < length; i++) {
				TreeNode curNode = queue.poll();
				if (isInsert) {
					result.add(curNode.val);
					isInsert = false;
				}
				if (curNode.right != null) {
					queue.offer(curNode.right);
				}
				if (curNode.left != null) {
					queue.offer(curNode.left);
				}
			}
		}

		return result;
	}


}

