package leetcode.pack6;

/**
 * <a href="https://leetcode.com/problems/merge-two-sorted-lists/description/">
 * 문제링크
 * </a>
 */
public class Solution25 {

	public static void main(String[] args) {
		Solution25 solution = new Solution25();

		// 테스트1 : [1,1,2,3,4,4]
		ListNode list1 = new ListNode(
				1,
				new ListNode(
						2,
						new ListNode(
								4
						)
				)
		);

		ListNode list2 = new ListNode(
				1,
				new ListNode(
						3,
						new ListNode(
								4
						)
				)
		);
		System.out.println((solution.mergeTwoLists(list1, list2)));

		// 테스트2 : []
		list1 = new ListNode();
		list2 = new ListNode();
		System.out.println((solution.mergeTwoLists(list1, list2)));

		// 테스트3 : [0]
		list1 = new ListNode();
		list2 = new ListNode(0);
		System.out.println((solution.mergeTwoLists(list1, list2)));
	}

	static class ListNode {
		int val;
		ListNode next;

		ListNode() {}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if (list1 == null) {
			return list2;
		}
		if (list2 == null) {
			return list1;
		}

		if (list1.val <= list2.val) {
			list1.next = mergeTwoLists(list1.next, list2);
			return list1;
		} else {
			list2.next = mergeTwoLists(list1, list2.next);
			return list2;
		}
	}

}

