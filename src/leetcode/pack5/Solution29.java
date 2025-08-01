package leetcode.pack5;

/**
 * <a href="https://leetcode.com/problems/delete-node-in-a-linked-list/">
 * 문제링크
 * </a>
 */
public class Solution29 {

	public static void main(String[] args) {
		Solution29 solution = new Solution29();

		// 테스트1 : [4,1,9]
		ListNode head = new ListNode(4);
		head.next = new ListNode(5);
		head.next.next = new ListNode(1);
		head.next.next.next = new ListNode(9);
		solution.deleteNode(head.next);

		// 테스트2 : [4,5,9]
		head = new ListNode(4);
		head.next = new ListNode(5);
		head.next.next = new ListNode(1);
		head.next.next.next = new ListNode(9);
		solution.deleteNode(head.next.next);
	}

	 public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
		}
	 }

	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}

}
