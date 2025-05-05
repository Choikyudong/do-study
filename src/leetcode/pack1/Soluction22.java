package leetcode.pack1;

/**
 * <a href="https://leetcode.com/problems/path-sum/description/?envType=problem-list-v2&envId=depth-first-search">
 * 문제링크
 * </a>
 */
public class Soluction22 {

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
		TreeNode leftNode = new TreeNode(
				4,
				new TreeNode(
						11,
						new TreeNode(
								7,
								null,
								null
						),
						new TreeNode(
								2,
								null,
								null
						)
				),
				null
		);
		TreeNode rightNode = new TreeNode(
				8,
				new TreeNode(13,
						null,
						null
				),
				new TreeNode(4,
						null,
						new TreeNode(
								1,
								null,
								null
						)
				)
		);
		TreeNode root = new TreeNode(5, leftNode, rightNode);
		System.out.println(hasPathSum(root, 22)); // true

		// 테스트 2
		leftNode = new TreeNode(2, null, null);
		rightNode = new TreeNode(3, null, null);
		root = new TreeNode(1, leftNode, rightNode);
		System.out.println(hasPathSum(root, 5)); // false
	}

	/*
	public static boolean hasPathSum(TreeNode root, int targetSum) {
		if (root == null) {
			return false;
		}

		Queue<Object[]> queue = new ArrayDeque<>();
		queue.offer(new Object[]{root, root.val});
		while (!queue.isEmpty()) {
			Object[] objects = queue.poll();
			TreeNode treeNode = (TreeNode) objects[0];
			int sum = (int) objects[1];
			if (treeNode.left == null && treeNode.right == null && sum == targetSum) {
				return true;
			}

			if (treeNode.left != null) {
				queue.offer(new Object[]{treeNode.left, sum + treeNode.left.val});
			}

			if (treeNode.right != null) {
				queue.offer(new Object[]{treeNode.right, sum + treeNode.right.val});
			}
		}

		return false;
	*/

	public static boolean hasPathSum(TreeNode root, int targetSum) {
		if (root == null) {
			return false;
		}

		if (root.left == null && root.right == null) {
			return (targetSum - root.val) == 0;
		}

		return hasPathSum(root.left, targetSum - root.val)
				|| hasPathSum(root.right, targetSum - root.val);
	}

}

