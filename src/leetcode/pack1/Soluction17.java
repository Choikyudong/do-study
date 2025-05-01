package leetcode.pack1;

import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/same-tree/description/?envType=problem-list-v2&envId=depth-first-search">
 * 문제링크
 * </a>
 */
public class Soluction17 {

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
		TreeNode pLeft = new TreeNode(2);
		TreeNode pRight = new TreeNode(3);
		TreeNode pRoot = new TreeNode(1, pLeft, pRight);
		TreeNode qLeft = new TreeNode(2);
		TreeNode qRight = new TreeNode(3);
		TreeNode qRoot = new TreeNode(1, qLeft, qRight);
		System.out.println(isSameTree(pRoot, qRoot));

		// 테스트 2
		pLeft = new TreeNode(2);
		pRoot = new TreeNode(1, pLeft, null);
		qRight = new TreeNode(3);
		qRoot = new TreeNode(1, null, qRight);
		System.out.println(isSameTree(pRoot, qRoot));

		// 테스트 3
		pLeft = new TreeNode(2);
		pRight = new TreeNode(1);
		pRoot = new TreeNode(1, pLeft, pRight);
		pLeft = new TreeNode(1);
		qRight = new TreeNode(2);
		qRoot = new TreeNode(1, pLeft, qRight);
		System.out.println(isSameTree(pRoot, qRoot));

		// 테스트 4
		pRoot = new TreeNode();
		qRoot = new TreeNode();
		System.out.println(isSameTree(pRoot, qRoot));
	}

	// 제출한 코드
	public static boolean isSameTree(TreeNode p, TreeNode q) {
		Stack<TreeNode> pStack = new Stack<>();
		pStack.push(p);

		Stack<TreeNode> qStack = new Stack<>();
		qStack.push(q);
		while (!pStack.isEmpty()) {
			TreeNode pNode = pStack.pop();
			TreeNode qNode = qStack.pop();

			if (pNode != null && qNode != null) {
				if (pNode.val != qNode.val) {
					return false;
				}
				pStack.add(pNode.left);
				pStack.add(pNode.right);
				qStack.add(qNode.left);
				qStack.add(qNode.right);
			} else if (
				(pNode == null && qNode != null) ||
				(pNode != null && qNode == null)) {
				return false;
			}
		}
		return true;
	}

	// 재귀로 풀어봄
//	public static boolean isSameTree(TreeNode p, TreeNode q) {
//		if (p == null && q == null) {
//			return true;
//		}
//
//		// p와 q가 하나라도 있으면 일치하지 않음, 값이 다르면 일치하지 않음
//		if (p == null || q == null || p.val != q.val) {
//			return false;
//		}
//
//		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
//	}

}

