package leetcode.pack1;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/invert-binary-tree/description/?envType=problem-list-v2&envId=depth-first-search">
 * 문제링크
 * </a>
 */
public class Soluction26 {

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
		System.out.println(binaryTreePaths(root)); // ["1->2->5","1->3"]

		// 테스트 2
		root = new TreeNode(1, null, null);
		System.out.println(binaryTreePaths(root)); // ["1"]
	}

	/*
	public static List<String> binaryTreePaths(TreeNode root) {
		if (root == null) {
			return new ArrayList<>();
		}

		Stack<NodeAndPath> stack = new Stack<>();
		List<String> paths = new ArrayList<>();
		paths.add(String.valueOf(root.val));
		stack.push(new NodeAndPath(root, paths));

		List<String> result = new ArrayList<>();
		while (!stack.isEmpty()) {
			NodeAndPath nodeAndPath = stack.pop();
			TreeNode node = nodeAndPath.node();
			paths = nodeAndPath.path();

			if (node.left == null && node.right == null) {
				result.add(String.join("->", paths));
			}

			if (node.right != null) {
				List<String> curPath = new ArrayList<>(paths);
				curPath.add(String.valueOf(node.right.val));
				stack.push(new NodeAndPath(node.right, curPath));
			}

			if (node.left != null) {
				List<String> curPath = new ArrayList<>(paths);
				curPath.add(String.valueOf(node.left.val));
				stack.push(new NodeAndPath(node.left, curPath));
			}

		}

		return result;
	}

	record NodeAndPath(TreeNode node, List<String> path) {}
	*/

	/*
	public static List<String> binaryTreePaths(TreeNode root) {
		List<String> result = new ArrayList<>();
		if (root != null) {
			List<String> curPath = new ArrayList<>();
			curPath.add(String.valueOf(root.val));
			dfs(root, curPath, result);
		}

		return result;
	}

	public static void dfs(TreeNode root, List<String> paths, List<String> result) {
		if (root.left == null && root.right == null) {
			result.add(String.join("->", paths));
			return;
		}
		if (root.left != null) {
			List<String> curPath = new ArrayList<>(paths);
			curPath.add(String.valueOf(root.left.val));
			dfs(root.left, curPath, result);
		}
		if (root.right != null) {
			List<String> curPath = new ArrayList<>(paths);
			curPath.add(String.valueOf(root.right.val));
			dfs(root.right, curPath, result);
		}
	}
	*/

	public static List<String> binaryTreePaths(TreeNode root) {
		List<String> result = new ArrayList<>();
		if (root == null) {
			return result;
		}

		dfs(root, result, new StringBuilder());
		return result;
	}

	public static void dfs(TreeNode root, List<String> result, StringBuilder path) {
		if (root == null) {
			return;
		}

		int length = path.length(); // for backtrack
		path.append(root.val);
		if (root.left == null && root.right == null) {
			result.add(path.toString());
		} else {
			path.append("->");
			dfs(root.left, result, path);
			dfs(root.right, result, path);
		}
		path.setLength(length); // reset for backtrack
	}

}

