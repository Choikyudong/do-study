package leetcode.pack2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/n-ary-tree-postorder-traversal/description/?envType=problem-list-v2&envId=depth-first-search">
 * 문제링크
 * </a>
 */
public class Soluction12 {

	private static class Node {
		public int val;
		public List<Node> children;

		public Node() {}

		public Node(int _val) {
			val = _val;
		}

		public Node(int _val, List<Node> _children) {
			val = _val;
			children = _children;
		}
	};

	public static void main(String[] args) {
		// 테스트 1
		Node node1 = new Node(
				3,
				List.of(
						new Node(5),
						new Node(6)
				)
		);
		Node node2 = new Node(2);
		Node node3 = new Node(4);
		Node root = new Node(1, List.of(node1, node2, node3));
		System.out.println(postorder(root));

		// 테스트 2
		node1 = new Node(2);
		node2 = new Node(
				3,
				List.of(
						new Node(6),
						new Node(
								7,
								List.of(
										new Node(
												11,
												List.of(
														new Node(14)
												)
										)
								)
						)
				)
		);
		node3 = new Node(
				4,
				List.of(
						new Node(
								8,
								List.of(
										new Node(12)
								)
						)
				)
		);
		Node node4 = new Node(
				5,
				List.of(
						new Node(
								9,
								List.of(
										new Node(13)
								)
						),
						new Node(10)
				)
		);
		root = new Node(1, List.of(node1, node2, node3, node4));
		System.out.println(postorder(root));

		// 테스트 3
		root = new Node(1);
		System.out.println(postorder(root));

		// 테스트 4
		System.out.println(postorder(null));
	}

	public static List<Integer> postorder(Node root) {
		if (root == null) {
			return Collections.emptyList();
		}

		List<Integer> list = new ArrayList<>();
		helper(root, list);
		return list;
	}

	private static void helper(Node node, List<Integer> list) {
		if (node.children == null || node.children.isEmpty()) {
			list.add(node.val);
			return;
		}
		for (Node childern : node.children) {
			helper(childern, list);
		}
		list.add(node.val);
	}

}

