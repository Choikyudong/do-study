package leetcode.pack1;

/**
 * <a href="https://leetcode.com/problems/sum-of-left-leaves/description/?envType=problem-list-v2&envId=depth-first-search">
 * 문제링크
 * </a>
 */
public class Soluction28 {

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
		TreeNode leftNode = new TreeNode(
				9,
				null,
				null
		);
		TreeNode rightNode = new TreeNode(
				20,
				new TreeNode(
						15,
						null,
						null
				),
				new TreeNode(
						7,
						null,
						null
				)
		);
		TreeNode root = new TreeNode(3, leftNode, rightNode);
		System.out.println(sumOfLeftLeaves(root)); // 24

		// 테스트 2
		root = new TreeNode(1, null, null);
		System.out.println(sumOfLeftLeaves(root)); // 0
	}

	public static int sumOfLeftLeaves(TreeNode root) {
		return helper(root, false);
	}

	// 기존에 isLeft를 int로 했으나 boolean이 더 직관적이라 변경함.
	public static int helper(TreeNode root, boolean isLeft) {
		if (root == null) {
			return 0;
		}
		if (isLeft && root.left == null && root.right == null) {
			return root.val;
		}
		return helper(root.left, true) + helper(root.right, false);
	}

	/* 다른 사람 코드를 참고해 만듬
	public static int sumOfLeftLeaves(TreeNode root) {
		if (root == null) {
			return 0;
		}

		int sum = 0;
		if (root.left != null) {
			if (root.left.left == null && root.left.right == null) {
				sum += root.left.val;
			} else {
				sum += sumOfLeftLeaves(root.left);
			}
		}
		sum += sumOfLeftLeaves(root.right);
		return sum;
	}
	*/

}

