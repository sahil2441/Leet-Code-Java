import utilities.ListNode;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; next = null; } }
 */
public class S160 {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		ListNode p = headA, q = headB;
		if (p == null || q == null)
			return null;
		while (p != null && q != null && p != q) {
			p = p.next;
			q = q.next;
			if (p == q)
				return p;

			if (p == null)
				p = headB;
			if (q == null)
				q = headA;
		}
		return p;
	}
}