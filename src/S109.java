import utilities.ListNode;
import utilities.TreeNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
public class S109 {

	ListNode node;

	public TreeNode sortedListToBST(ListNode head) {
		if (head == null)
			return null;
		node = head;
		int size = 0;
		while (head != null) {
			size++;
			head = head.next;
		}
		return helper(0, size - 1);
	}

	public TreeNode helper(int i, int j) {
		if (i > j)
			return null;
		int mid = i + (j - i) / 2;

		TreeNode left = helper(i, mid - 1);
		;
		TreeNode root = new TreeNode(node.val);
		root.left = left;
		node = node.next;

		root.right = helper(mid + 1, j);
		return root;
	}

	/*
	 * public TreeNode inorderHelper(int start, int end){ if(start > end){
	 * return null; }
	 * 
	 * int mid = start + (end - start) / 2; TreeNode left = inorderHelper(start,
	 * mid - 1);
	 * 
	 * TreeNode treenode = new TreeNode(node.val); treenode.left = left; node =
	 * node.next;
	 * 
	 * TreeNode right = inorderHelper(mid + 1, end); treenode.right = right;
	 * 
	 * return treenode; }
	 */
}