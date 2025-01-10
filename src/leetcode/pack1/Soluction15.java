package leetcode.pack1;

public class Soluction15 {

	public static void main(String[] args) {
		/*
		ListNode ln1_3 = new ListNode(2);
		ListNode ln1_2 = new ListNode(4, ln1_3);
		ListNode ln1_1 = new ListNode(3, ln1_2);

		ListNode ln2_3 = new ListNode(5);
		ListNode ln2_2 = new ListNode(6, ln2_3);
		ListNode ln2_1 = new ListNode(4, ln2_2);
		ListNode result = addTwoNumbers(ln1_1, ln2_1);
		System.out.println(result);
		*/

		ListNode ln1_2 = new ListNode(9);
		ListNode ln1_1 = new ListNode(9, ln1_2);

		ListNode ln2_1 = new ListNode(1);
		ListNode result = addTwoNumbers(ln1_1, ln2_1);
		System.out.println(result);
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		return makeListNode(l1, l2, 0);
	}

	public static ListNode makeListNode(ListNode l1, ListNode l2, int carry) {
		if (l1 == null && l2 == null && carry == 0) { // carry == 0을 꼭 해야 자리 올림값도 반영이 된다.
			return null;
		}

		int sum = carry;
		if (l1 != null) {
			sum += l1.val;
			l1 = l1.next;
		}

		if (l2 != null) {
			sum += l2.val;
			l2 = l2.next;
		}

		ListNode result = new ListNode(sum % 10); // 한자리씩 저장하기 위해서
		result.next = makeListNode(l1, l2, sum / 10); // 10을 나눠 자리올림한다.
		return result;
	}

	// 문제에서 제공함
	static class ListNode {
		int val;
		ListNode next;

		ListNode() {

		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
}

