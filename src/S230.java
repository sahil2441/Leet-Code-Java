import utilities.TreeNode;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
public class S230 {
	public int count = 1, val = -1;

	public int kthSmallest(TreeNode root, int k) {
		helper(root, k);
		return val;
	}

	void helper(TreeNode root, int k) {
		if (root == null || count > k)
			return;
		helper(root.left, k);
		if (k == count++) {
			val = root.val;
			return;
		}
		helper(root.right, k);
	}

}