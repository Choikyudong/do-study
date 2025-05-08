package leetcode.pack2;

/**
 * <a href="https://leetcode.com/problems/diameter-of-binary-tree/description/?envType=problem-list-v2&envId=depth-first-search">
 * 문제링크
 * </a>
 */
public class Soluction2 {

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
				2,
				new TreeNode(
						4,
						null,
						null
				),
				new TreeNode(
						5,
						null,
						null
				)
		);
		TreeNode rightNode = new TreeNode(
				3,
				null,
				null
		);
		TreeNode root = new TreeNode(1, leftNode, rightNode);
		System.out.println(diameterOfBinaryTree(root)); // 3

		// 테스트 2
		leftNode = new TreeNode(
				2,
				null,
				null
		);
		root = new TreeNode(1, leftNode, null);
		System.out.println(diameterOfBinaryTree(root)); // 1

		// 테스트 3
		leftNode = new TreeNode(
				-7,
				null,
				null
		);
		rightNode = new TreeNode(
				-3,
				new TreeNode(
						-9,
						new TreeNode(
								9,
								new TreeNode(
										6,
										new TreeNode(
												0,
												null,
												new TreeNode(
														-1,
														null,
														null
												)
										),
										new TreeNode(
												6,
												new TreeNode(
														-4,
														null,
														null
												),
												null
										)
								),
								null
						),
						new TreeNode(
								-7,
								new TreeNode(
										-6,
										new TreeNode(
												5,
												null,
												null
										),
										null
								),
								new TreeNode(
										-6,
										new TreeNode(
												9,
												new TreeNode(
														-2,
														null,
														null
												),
												null
										),
										null
								)
						)
				),
				new TreeNode(
						-3,
						new TreeNode(
								-4,
								null,
								null
						),
						null
				)
		);
		root = new TreeNode(4, leftNode, rightNode);
		System.out.println(diameterOfBinaryTree(root)); // 8
	}

	private static int length = 0;
	public static int diameterOfBinaryTree(TreeNode root) {
		if (root == null) {
			return 0;
		}
		dfs(root);
		return length;
	}

	private static int dfs(TreeNode node) {
		if (node == null) {
			return 0;
		}

		int left = dfs(node.left);
		int right = dfs(node.right);

		length = Math.max(length, left + right);
		return Math.max(left, right) + 1;
	}

}

