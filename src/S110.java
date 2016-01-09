import utilities.TreeNode;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
public class S110 {
	public boolean isBalanced(TreeNode root) {
		return height(root) != -1;
	}

	int height(TreeNode root) {
		if (root == null)
			return 0;
		int hl = height(root.left);
		int hr = height(root.right);
		if (hl == -1 || hr == -1 || Math.abs(hl - hr) > 1)
			return -1;

		return Math.max(hl, hr) + 1;
	}

}