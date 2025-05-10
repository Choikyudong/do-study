package leetcode.pack2;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/two-sum-iv-input-is-a-bst/description/?envType=problem-list-v2&envId=depth-first-search">
 * 문제링크
 * </a>
 */
public class Soluction7 {

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
		TreeNode leftRoot = new TreeNode(
				3,
				new TreeNode(2),
				new TreeNode(4)
		);
		TreeNode rightRoot = new TreeNode(
				6,
				null,
				new TreeNode(7)
		);
		TreeNode root = new TreeNode(5, leftRoot, rightRoot);
		System.out.println(findTarget(root, 9)); // true

		// 테스트 2
//		System.out.println(findTarget(root, 28)); // false

		// 테스트 3
		leftRoot = new TreeNode(1);
		rightRoot = new TreeNode(3);
		root = new TreeNode(2, leftRoot, rightRoot);
//		System.out.println(findTarget(root, 1)); // false

		rightRoot = new TreeNode(3);
		root = new TreeNode(2, null, rightRoot);
		System.out.println(findTarget(root, 6)); // false
	}

	/*
	진짜 개느림;
	public static boolean findTarget(TreeNode root, int k) {
		if (root == null) {
			return false;
		}

		Queue<TreeNode> queue = new ArrayDeque<>();
		queue.offer(root);
		List<Integer> list = new ArrayList<>();
		while (!queue.isEmpty()) {
			int length = queue.size();
			for (int i = 0; i < length; i++) {
				TreeNode node = queue.poll();
				if (node != null) {
					int val = node.val;
					list.add(val);
					if (node.left != null) {
						queue.offer(node.left);
					}
					if (node.right != null) {
						queue.offer(node.right);
					}
				}
			}
		}

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) + list.get(j) == k) {
					return true;
				}
			}
		}

		return false;
	}
	*/

	private static Set<Integer> set = new HashSet<>();
	public static boolean findTarget(TreeNode root, int k) {
		if (root == null) {
			return false;
		}

		if (set.contains(k - root.val)) { // 바이너리 트리이기 때문에
			return true;
		}
		set.add(root.val);

		return findTarget(root.left, k) || findTarget(root.right, k);
	}

}

