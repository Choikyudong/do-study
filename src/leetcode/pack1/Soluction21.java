package leetcode.pack1;

/**
 * <a href="https://leetcode.com/problems/minimum-depth-of-binary-tree/description/?envType=problem-list-v2&envId=depth-first-search">
 * 문제링크
 * </a>
 */
public class Soluction21 {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		TreeNode(int val) { this.val = val; }
		TreeNode(int val, TreeNode left, TreeNode right) {
		  this.val = val;
		  this.left = left;
		  this.right = right;
		}
	}

	public static void main(String[] args) {
		// 테스트 1
		TreeNode leftNode = new TreeNode(9, null, null);
		TreeNode rightNode = new TreeNode(
			20,
			new TreeNode(15, null, null),
			new TreeNode(7, null, null)
		);
		TreeNode root = new TreeNode(3, leftNode, rightNode);
		System.out.println(minDepth(root)); // 2

		// 테스트 2
		rightNode = new TreeNode(
				3,
				null,
				new TreeNode(
						4,
						null,
						new TreeNode(
								5,
								null,
								new TreeNode(
										6,
										null,
										null
								)
						)
				)
		);
		root = new TreeNode(2, null, rightNode);
		System.out.println(minDepth(root)); // 5

		// 테스트 3
		root = new TreeNode(1, null, null);
		System.out.println(minDepth(root)); // 1
	}

	public static int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}

		if (root.left == null) {
			return minDepth(root.right) + 1;
		}

		if (root.right == null) {
			return minDepth(root.left) + 1;
		}

		return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
	}

	/* 다른 사람들 코드 참고함
	public static int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int left = minDepth(root.left);
		int right = minDepth(root.right);
		return (left == 0 || right == 0) ? left + right + 1 :  Math.min(left, right) + 1;
	}
	*/

}

