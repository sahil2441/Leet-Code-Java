import utilities.ListNode;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
public class S019 {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode newHead = new ListNode(0);
		newHead.next = head;

		ListNode slow = newHead, fast = newHead.next;
		while (n > 0) {
			fast = fast.next;
			n--;
		}

		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		slow.next = slow.next.next;
		return newHead.next;
	}
}