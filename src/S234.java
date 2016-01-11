import utilities.ListNode;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
public class S234 {
	public boolean isPalindrome(ListNode head) {

		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		if (fast != null)
			slow = slow.next;

		slow = reverse(slow);

		while (slow != null && head.val == slow.val) {
			head = head.next;
			slow = slow.next;
		}

		return slow == null;
	}

	public ListNode reverse(ListNode head) {

		ListNode prev = null;
		while (head != null) {
			ListNode next = head.next;
			head.next = prev;
			prev = head;
			head = next;
		}

		return prev;
	}
}