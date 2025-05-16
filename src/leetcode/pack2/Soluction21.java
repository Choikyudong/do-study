package leetcode.pack2;

/**
 * <a href="https://leetcode.com/problems/populating-next-right-pointers-in-each-node/description/?envType=problem-list-v2&envId=depth-first-search">
 * 문제링크
 * </a>
 */
public class Soluction21 {

	static class Node {
		public int val;
		public Node left;
		public Node right;
		public Node next;

		public Node() {}

		public Node(int _val) {
			val = _val;
		}

		public Node(int _val, Node _left, Node _right, Node _next) {
			val = _val;
			left = _left;
			right = _right;
			next = _next;
		}
	};

	public static void main(String[] args) {
		// 테스트 1
		Node left = new Node(2);
		Node right = new Node(3);
		Node root = new Node(1, left, right, null);
		connect(root); // [1,#,2,3,#]

		// 테스트 2
		left = new Node(
				2,
				new Node(4),
				new Node(5),
				null
		);
		right = new Node(
				3,
				new Node(6),
				new Node(7),
				null
		);
		root = new Node(1, left, right, null);
		connect(root); // [1,#,2,3,#,4,5,6,7,#]

		// 테스트 2
		connect(null); // []
	}

	/* bfs가 빠를줄 알고 썼는데 더 느림.. gc 과정에서 느려졌다고 판단
	public Node connect(Node root) {
		if (root == null) {
			return null;
		}

		Queue<Node> queue = new ArrayDeque<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			int length = queue.size();
			for (int i = 0; i < length; i++) {
				Node node = queue.poll();
				if (node == null) {
					continue;
				}
				if (i + 1 < length) {
					node.next = queue.peek();
				}
				if (node.left != null) {
					queue.offer(node.left);
				}
				if (node.right != null) {
					queue.offer(node.right);
				}
			}
		}

		return root;
	}
	*/
	
	public static Node connect(Node root) {
		if (root == null) {
			return null;
		}

		Node node = root;
		while (node.left != null) {
			Node curNode = node;
			while (curNode != null) {
				curNode.left.next = curNode.right;
				if (curNode.next != null) { // 다음 부모 노드 확인
					curNode.right.next = curNode.next.left;
				}
				curNode = curNode.next;
			}
			node = node.left;
		}

		return root;
	}

}

