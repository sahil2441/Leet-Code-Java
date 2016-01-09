import java.util.ArrayList;
import java.util.List;

import utilities.TreeNode;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
public class S107 {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {

		// using DFS and then reverse the list

		List<List<Integer>> result = new ArrayList();
		helper(root, 0, result);

		// reverse the list
		int i = 0, j = result.size() - 1;
		while (i < j) {
			List<Integer> temp = result.get(i);
			result.add(i, result.get(j));
			result.remove(i + 1);
			result.remove(j);
			result.add(j, temp);
			i++;
			j--;
		}
		return result;
	}

	void helper(TreeNode root, int level, List<List<Integer>> result) {
		if (root == null)
			return;

		if (result.size() <= level)
			result.add(level, new ArrayList());

		result.get(level).add(root.val);
		helper(root.left, level + 1, result);
		helper(root.right, level + 1, result);
	}

}