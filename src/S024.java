import utilities.ListNode;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
public class S024 {
	public ListNode swapPairs(ListNode head) {
		return helper(head);
	}

	ListNode helper(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode next = head.next;
		head.next = helper(head.next.next);
		next.next = head;
		return next;
	}
}