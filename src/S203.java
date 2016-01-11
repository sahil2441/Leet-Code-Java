import utilities.ListNode;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
public class S203 {
	public ListNode removeElements(ListNode head, int x) {
		// Recursive Solution

		if (head == null)
			return null;
		head.next = removeElements(head.next, x);
		return head.val == x ? head.next : head;

	}
}