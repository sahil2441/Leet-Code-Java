import utilities.TreeNode;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
public class S124 {

	int max;

	public int maxPathSum(TreeNode root) {

		max = Integer.MIN_VALUE;
		helper(root);
		return max;
	}

	int helper(TreeNode root) {
		if (root == null) // check null
			return 0;
		int left = Math.max(0, helper(root.left));
		int right = Math.max(0, helper(root.right));

		int value = left + right + root.val;
		if (value > max)
			max = value;

		return Math.max(left, right) + root.val;
	}
}