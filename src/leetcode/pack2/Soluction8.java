package leetcode.pack2;

/**
 * <a href="https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/description/?envType=problem-list-v2&envId=depth-first-search">
 * 문제링크
 * </a>
 */
public class Soluction8 {

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
		TreeNode leftRoot = new TreeNode(2);
		TreeNode rightRoot = new TreeNode(
				5,
				new TreeNode(5),
				new TreeNode(7)
		);
		TreeNode root = new TreeNode(2, leftRoot, rightRoot);
		System.out.println(findSecondMinimumValue(root)); // 5

		leftRoot = new TreeNode(2);
		rightRoot = new TreeNode(2);
		root = new TreeNode(2, leftRoot, rightRoot);
		System.out.println(findSecondMinimumValue(root)); // -1

		leftRoot = new TreeNode(2);
		rightRoot = new TreeNode(
				5,
				new TreeNode(5),
				new TreeNode(5)
		);
		root = new TreeNode(2, leftRoot, rightRoot);
		System.out.println(findSecondMinimumValue(root)); // 5
	}


	public static int findSecondMinimumValue(TreeNode node) {
		if (node == null) {
			return -1;
		}

		if (node.left == null && node.right == null) {
			return -1;
		}

		int left = node.left == null ? -1 : node.left.val;
		if (node.val == node.left.val) {
			left = findSecondMinimumValue(node.left);
		}

		int right = node.right == null ? -1 : node.right.val;
		if (node.val == node.right.val) {
			right = findSecondMinimumValue(node.right);
		}

		if (left != -1 && right != -1) {
			return Math.min(left, right);
		} else if (left != -1) {
			return left;
		} else {
			return right;
		}
	}

}

