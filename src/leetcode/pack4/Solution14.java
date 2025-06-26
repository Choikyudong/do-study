package leetcode.pack4;

/**
 * <a href="https://leetcode.com/problems/merge-nodes-in-between-zeros/description/">
 * 문제링크
 * </a>
 */
public class Solution14 {

	public static void main(String[] args) {
		Solution14 solution = new Solution14();

		// 테스트1
		ListNode ln8 = new ListNode(0);
		ListNode ln7 = new ListNode(2, ln8);
		ListNode ln6 = new ListNode(5, ln7);
		ListNode ln5 = new ListNode(4, ln6);
		ListNode ln4 = new ListNode(0, ln5);
		ListNode ln3 = new ListNode(1, ln4);
		ListNode ln2 = new ListNode(3, ln3);
		ListNode ln1 = new ListNode(0, ln2);
		System.out.println(solution.mergeNodes(ln1)); // [4, 11]
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

	public ListNode mergeNodes(ListNode head) {
		ListNode ans = new ListNode();
		ListNode curNode = ans;
		while (head != null) {
			if (head.val == 0 && curNode.val != 0) {

				if (head.next != null) {
					curNode.next = new ListNode();
				}
				curNode = curNode.next;
			} else if (head.val != 0) {
				curNode.val += head.val;
			}

			head = head.next;
		}

		return ans;
	}
	
}
