package leetcode.pack1;

import java.util.ArrayList;
import java.util.List;

/**
 * Question : Binary Tree Inorder Traversal
 * Writer : Kyudong
 * Date : 2023-01-10
 * Time : 오후 9:41
 */
public class Soluction2 {

	public static void main(String[] args) {
		long start = System.nanoTime();

		// 예시1
		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(3);
		root1.left.left = new TreeNode(4);
		root1.left.left.left = new TreeNode(5);
		root1.right = new TreeNode(2);
		System.out.println(inorderTraversal(root1));

		long end = System.nanoTime();
		System.out.println(end - start);

		// 예시2
		TreeNode root2 = new TreeNode(1);
		root2.left = new TreeNode(2);
		root2.right = new TreeNode(3);
		root2.right.right = new TreeNode(4);
		root2.right.right.right = new TreeNode(5);
		System.out.println(inorderTraversal(root2));
	}

	/**
	 * 전달받은 이진트리를 중위순회한 결과값을 반환한다.
	 * 재귀호출과 트리노드를 잘 몰라서 어려웠던 문제
	 * @param root 이진트리
	 * @return 방문순서를 담은 값
	 */
	public static List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		inorder(root, result);
		return result;
	}

	public static void inorder(TreeNode tree, List<Integer> result) {
		if (tree != null) {
			inorder(tree.left, result);
			result.add(tree.val);
			inorder(tree.right, result);
		}
	}

	// 이진트리 객체
	public static class TreeNode {
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

}
