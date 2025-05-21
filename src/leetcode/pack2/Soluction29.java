package leetcode.pack2;

/**
 * <a href="https://leetcode.com/problems/reverse-odd-levels-of-binary-tree/description/?envType=problem-list-v2&envId=depth-first-search">
 * 문제링크
 * </a>
 */
public class Soluction29 {

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
		TreeNode left = new TreeNode(2, new TreeNode(8), new TreeNode(13));
		TreeNode right = new TreeNode(5, new TreeNode(21), new TreeNode(34));
		TreeNode root = new TreeNode(3, left, right);
		System.out.println(reverseOddLevels(root)); // [2,5,3,8,13,21,34]

		// 테스트 2
		left = new TreeNode(7);
		right = new TreeNode(11);
		root = new TreeNode(13, left, right);
		System.out.println(reverseOddLevels(root)); // [7,11,13]

		// 테스트 2
		left = new TreeNode(
				1,
				new TreeNode(0, new TreeNode(1), new TreeNode(1)),
				new TreeNode(0, new TreeNode(1), new TreeNode(1))
		);
		right = new TreeNode(
				2,
				new TreeNode(0, new TreeNode(2), new TreeNode(2)),
				new TreeNode(0, new TreeNode(2), new TreeNode(2))
		);
		root = new TreeNode(0, left, right);
		System.out.println(reverseOddLevels(root)); // [7,11,13]
	}

	/* 넘 느림
	public static TreeNode reverseOddLevels(TreeNode root) {
		if (root == null) {
			return null;
		}

		Queue<TreeNode> queue = new ArrayDeque<>();
		queue.offer(root);
		int level = 1;
		while (!queue.isEmpty()) {
			int length = queue.size();
			List<TreeNode> list = new ArrayList<>();
			for (int i = 0; i < length; i++) {
				TreeNode node = queue.poll();
				list.add(node);
				if (node.right != null) {
					queue.offer(node.right);
				}
				if (node.left != null) {
					queue.offer(node.left);
				}
			}

			if (level % 2 != 1) {
				int left = 0;
				int right = list.size() - 1;
				while (left < right) {
					int temp = list.get(left).val;
					list.get(left).val = list.get(right).val;
					list.get(right).val = temp;
					left++;
					right--;
				}
			}
			level++;
		}

		return root;
	}
	*/

	public static TreeNode reverseOddLevels(TreeNode root) {
		helper(root.left, root.right, 1);
		return root;
	}

	public static void helper(TreeNode node1, TreeNode node2, int depth) {
		if (node1 == null || node2 == null) {
			return;
		}

		if (depth % 2 == 1) {
			int temp = node1.val;
			node1.val = node2.val;
			node2.val = temp;
		}

		helper(node1.left, node2.right, depth + 1);
		helper(node1.right, node2.left, depth + 1);
	}

}
