package leetcode.pack2;

/**
 * <a href="https://leetcode.com/problems/sum-root-to-leaf-numbers/description/?envType=problem-list-v2&envId=depth-first-search">
 * 문제링크
 * </a>
 */
public class Soluction22 {

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
		TreeNode left = new TreeNode(2);
		TreeNode right = new TreeNode(3);
		TreeNode root = new TreeNode(1, left, right);
		System.out.println(sumNumbers(root)); // 25

		// 테스트 2
		left = new TreeNode(
				9,
				new TreeNode(5),
				new TreeNode(1)
		);
		right = new TreeNode(0);
		root = new TreeNode(4, left, right);
		System.out.println(sumNumbers(root)); // 1026
	}


	private static int sum = 0;
	public static int sumNumbers(TreeNode root) {
		if (root == null) {
			return 0;
		}

		helper(root, new StringBuilder());
		return sum;
	}

	private static void helper(TreeNode node, StringBuilder sb) {
		if (node == null) {
			return;
		}

		int length = sb.length();
		sb.append(node.val);
		if (node.left == null && node.right == null) {
			sum += Integer.parseInt(sb.toString());
			sb.setLength(length);
			return;
		}

		helper(node.left, sb);
		helper(node.right, sb);
		sb.setLength(length);
	}

}

