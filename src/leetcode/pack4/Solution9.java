package leetcode.pack4;

/**
 * <a href="https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/description/">
 * 문제링크
 * </a>
 */
public class Solution9 {

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public static void main(String[] args) {
		Solution9 solution = new Solution9();

		// 테스트1
		ListNode ln1_4 = new ListNode(3);
		ListNode ln1_3 = new ListNode(10, ln1_4);
		ListNode ln1_2 = new ListNode(6, ln1_3);
		ListNode ln1_1 = new ListNode(18, ln1_2);
		System.out.println(solution.insertGreatestCommonDivisors(ln1_1)); // [18,6,6,2,10,1,3]

		// 테스트2
		ln1_1 = new ListNode(7);
		System.out.println(solution.insertGreatestCommonDivisors(ln1_1)); // [7]
	}

	public ListNode insertGreatestCommonDivisors(ListNode head) {
		helper(head);
		return head;
	}

	private void helper(ListNode node) {
		if (node.next == null) {
			return;
		}

		// 기존의 다음 노드
		ListNode nextNode = node.next;

		// gcd 계산
		int m = node.val;
		int n = nextNode.val;
		while (m != 0) {
			int temp = m;
			m = n % m;
			n = temp;
		}

		node.next = new ListNode(n, nextNode);
		helper(nextNode);
	}
	
}
