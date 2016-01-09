import utilities.ListNode;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
public class S206 {
	public ListNode reverseList(ListNode head) {
		// recursive solution

		return helper(head, null);
	}

	ListNode helper(ListNode head, ListNode newHead) {
		if (head == null)
			return newHead;

		ListNode next = head.next;
		head.next = newHead;
		return helper(next, head);
	}
}
