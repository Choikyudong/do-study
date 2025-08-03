package leetcode.pack6;

/**
 * <a href="https://leetcode.com/problems/merge-nodes-in-between-zeros/description/">
 * 문제링크
 * </a>
 */
public class Solution3 {

	public static void main(String[] args) {
		Solution3 solution = new Solution3();

		// 테스트1 : [10,1,13,1000000,1000001,1000002,5]
		ListNode list1 = new ListNode(10, new ListNode(1, new ListNode(13, new ListNode(6, new ListNode(9, new ListNode(5))))));
		ListNode list2 = new ListNode(1000000, new ListNode(1000001, new ListNode(1000002)));
		System.out.println(solution.mergeInBetween(list1, 3, 4, list2));

		// 테스트1 : [0,1,2,1000000,1000001,1000002,1000003,1000004,1000005,1000006,6,7,8,9]
		list1 = new ListNode(0, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7, new ListNode(8, new ListNode(9))))))))));
		list2 = new ListNode(1000000, new ListNode(1000001, new ListNode(1000002, new ListNode(1000003, new ListNode(1000004, new ListNode(1000005, new ListNode(1000006)))))));
		System.out.println(solution.mergeInBetween(list1, 3, 4, list2));
	}

	private static class ListNode {
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

	public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
		int index = 0;
		ListNode cur = list1;
		ListNode temp = null;
		while (cur != null) {
			if (index == a - 1) {
				temp = cur.next;
				cur.next = list2;
				break;
			}
			index++;
			cur = cur.next;
		}

		int length = b - a + 1;
		for (int i = 0; i < length; i++) {
			temp = temp.next;
		}

		while (cur != null) {
			if (cur.next == null) {
				cur.next = temp;
				break;
			}
			cur = cur.next;
		}

		return list1;
	}

}
