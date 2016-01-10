import java.util.ArrayList;
import java.util.List;

import utilities.TreeNode;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
public class S102 {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		helper(root, 0, result);
		return result;
	}

	void helper(TreeNode root, int level, List<List<Integer>> result) {
		if (root == null)
			return;
		if (result.size() <= level)
			result.add(new ArrayList<Integer>());
		result.get(level).add(root.val);

		helper(root.left, level + 1, result);
		helper(root.right, level + 1, result);
	}
}