import java.util.ArrayList;
import java.util.List;

import utilities.TreeNode;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
public class S257 {
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> list = new ArrayList();
		String ans = "";
		if (root != null)
			paths(root, list, ans + root.val);
		return list;
	}

	public void paths(TreeNode root, List<String> list, String s) {

		if (root.left == null && root.right == null) {
			list.add(s);
			return;
		}
		if (root.left != null) {
			paths(root.left, list, s + "->" + root.left.val);
		}

		if (root.right != null) {
			paths(root.right, list, s + "->" + root.right.val);
		}
	}
}