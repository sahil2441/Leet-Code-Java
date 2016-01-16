import java.util.ArrayDeque;
import java.util.Queue;

import utilities.TreeLinkNode;

/**
 * Definition for binary tree with next pointer. public class TreeLinkNode { int
 * val; TreeLinkNode left, right, next; TreeLinkNode(int x) { val = x; } }
 */
public class S116 {
	public void connect(TreeLinkNode root) {
		Queue<TreeLinkNode> queue = new ArrayDeque();
		if (root != null)
			queue.add(root);

		while (!queue.isEmpty()) {
			Queue<TreeLinkNode> temp = new ArrayDeque();

			while (!queue.isEmpty()) {
				TreeLinkNode curr = queue.poll();
				if (curr.left != null) {
					curr.left.next = curr.right;
					temp.add(curr.left);
				}
				if (curr.right != null) {
					if (queue.peek() != null)
						curr.right.next = queue.peek().left;
					else
						curr.right.next = null;
					temp.add(curr.right);
				}
			}
			queue = temp;
		}

	}
}