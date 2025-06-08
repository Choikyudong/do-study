package leetcode.pack3;

/**
 * <a href="https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree/description/?envType=problem-list-v2&envId=depth-first-search">
 * 문제링크
 * </a>
 */
public class Soluction22 {

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
		TreeNode left = new TreeNode(
				8,
				new TreeNode(0),
				new TreeNode(1)
		);
		TreeNode right = new TreeNode(
				5,
				null,
				new TreeNode(6)
		);
		TreeNode root = new TreeNode(4, left, right);
		System.out.println(averageOfSubtree(root)); // 5

		// 테스트2
		root = new TreeNode(1, null, null);
		System.out.println(averageOfSubtree(root)); // 1
	}

	public static int averageOfSubtree(TreeNode root) {
		return helper(root)[2];
	}

	private static int[] helper(TreeNode node) {
		if (node == null) {
			return new int[]{0, 0, 0};
		}

		int[] left = helper(node.left);
		int leftSum = left[0];
		int leftSize = left[1];
		int leftCount = left[2];

		int[] right = helper(node.right);
		int rightSum = right[0];
		int rightSize = right[1];
		int rightCount = right[2];

		int sum = node.val + leftSum + rightSum;
		int totalSize = leftSize + rightSize + 1;
		int totalCount = leftCount + rightCount;
		if (sum / totalSize == node.val) {
			totalCount++;
		}

		return new int[]{sum, totalSize, totalCount};
	}

}
