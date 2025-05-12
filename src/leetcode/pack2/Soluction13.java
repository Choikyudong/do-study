package leetcode.pack2;

/**
 * <a href="https://leetcode.com/problems/minimum-distance-between-bst-nodes/description/?envType=problem-list-v2&envId=depth-first-search">
 * 문제링크
 * </a>
 */
public class Soluction13 {

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
		TreeNode leftNode = new TreeNode(2, new TreeNode(1), new TreeNode(3));
		TreeNode rightNode = new TreeNode(6);
		TreeNode root = new TreeNode(4, leftNode, rightNode);
		System.out.println(minDiffInBST(root)); // 1

		// 테스트 2
		leftNode = new TreeNode(0);
		rightNode = new TreeNode(48, new TreeNode(12), new TreeNode(49));
		root = new TreeNode(1, leftNode, rightNode);
		System.out.println(minDiffInBST(root)); // 1

		// 테스트 3
		rightNode = new TreeNode(
				34,
				null,
				new TreeNode(
						58,
						new TreeNode(50, new TreeNode(44), null),
						null
				)
		);
		root = new TreeNode(27, null, rightNode);
		System.out.println(minDiffInBST(root)); // 6

		// 테스트 4
		leftNode = new TreeNode(
				69,
				new TreeNode(49, null, new TreeNode(52)),
				new TreeNode(89)
		);
		root = new TreeNode(90, leftNode, null);
		System.out.println(minDiffInBST(root)); // 1
	}

	private static class Mode {
		int min;
		Integer prev;
		public Mode() {
			this.min = Integer.MAX_VALUE;
			this.prev = null;
		}
	}

	public static int minDiffInBST(TreeNode root) {
		if (root == null) {
			return 0;
		}
		Mode mode = new Mode();
		helper(root, mode);
		return mode.min;
	}

	private static void helper(TreeNode node, Mode mode) {
		if (node == null) {
			return;
		}

		int val = node.val;
		helper(node.left, mode);
		if (mode.prev != null) {
			mode.min = Math.min(Math.abs(val - mode.prev), mode.min);
		}
		mode.prev = val;

		helper(node.right, mode);
	}

}

