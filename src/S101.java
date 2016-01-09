import utilities.TreeNode;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
public class S101 {
	public boolean isSymmetric(TreeNode root) {
		return (root == null || isSymmetricHelper(root.left, root.right));
	}

	public boolean isSymmetricHelper(TreeNode left, TreeNode right) {
		if (left == null || right == null) {
			return left == right;
		}
		return left.val == right.val && isSymmetricHelper(left.left, right.right)
				&& isSymmetricHelper(left.right, right.left);
	}
}