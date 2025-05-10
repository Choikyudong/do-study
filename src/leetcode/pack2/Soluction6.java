package leetcode.pack2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * <a href="https://leetcode.com/problems/average-of-levels-in-binary-tree/description/?envType=problem-list-v2&envId=depth-first-search">
 * 문제링크
 * </a>
 */
public class Soluction6 {

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
		TreeNode leftRoot = new TreeNode(9);
		TreeNode rightRoot = new TreeNode(
				20,
				new TreeNode(15),
				new TreeNode(7)
		);
		TreeNode root = new TreeNode(3, leftRoot, rightRoot);
		System.out.println(averageOfLevels(root)); // [3.00000,14.50000,11.00000]

		// 테스트 2
		leftRoot = new TreeNode(
				9,
				new TreeNode(15),
				new TreeNode(7)
		);
		rightRoot = new TreeNode(
				20,
				new TreeNode(32),
				new TreeNode(10)
		);
		root = new TreeNode(3, leftRoot, rightRoot);
		System.out.println(averageOfLevels(root)); // [3.00000,14.50000,16.00000]

		// 테스트3
		root = new TreeNode(0);
		System.out.println(averageOfLevels(root)); // [0]

		// 테스트 4
		leftRoot = new TreeNode(
				14,
				new TreeNode(1),
				null
		);
		root = new TreeNode(5, leftRoot, null);
		System.out.println(averageOfLevels(root)); // [5.00000,14.00000,1.00000]
	}

	public static List<Double> averageOfLevels(TreeNode root) {
		if (root == null) {
			return new ArrayList<>();
		}

		Queue<TreeNode> queue = new ArrayDeque<>();
		queue.offer(root);
		List<Double> result = new ArrayList<>();
		while (!queue.isEmpty()) {
			double sum = 0;
			int validNode = queue.size();
			for (int i = 0; i < validNode; i++) {
				TreeNode curNode = queue.poll();
				if (curNode != null) {
					sum += curNode.val;
					if (curNode.left != null) {
						queue.add(curNode.left);
					}
					if (curNode.right != null) {
						queue.add(curNode.right);
					}
				}
			}
			result.add(sum / validNode);
		}

		return result;
	}

}

