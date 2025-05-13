package leetcode.pack2;

/**
 * <a href="https://leetcode.com/problems/operations-on-tree/description/?envType=problem-list-v2&envId=depth-first-search">
 * 문제링크
 * </a>
 */
public class Soluction16 {

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
				5,
				new TreeNode(3),
				new TreeNode(7)
		);
		TreeNode right = new TreeNode(
				15,
				null,
				new TreeNode(18)
		);
		TreeNode root = new TreeNode(10, left, right);
		System.out.println(rangeSumBST(root, 7, 15)); // 32

		// 테스트 2
		left = new TreeNode(
				5,
				new TreeNode(
						3,
						new TreeNode(1),
						null
				),
				new TreeNode(
						7,
						new TreeNode(6),
						null
				)
		);
		right = new TreeNode(
				15,
				new TreeNode(13),
				new TreeNode(18)
		);
		root = new TreeNode(10, left, right);
		System.out.println(rangeSumBST(root, 6, 10)); // 23
	}

	public static int rangeSumBST(TreeNode root, int low, int high) {
		if (root == null) {
			return 0;
		}

		int sum = 0;
		if (root.val >= low && root.val <= high) {
			sum += root.val;
		}

		if (root.val > low) {
			sum += rangeSumBST(root.left, low, high);
		}
		if (root.val < high) {
			sum += rangeSumBST(root.right, low, high);
		}
		return sum;
	}

}

