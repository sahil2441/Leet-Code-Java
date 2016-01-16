import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S039 {
	List<List<Integer>> result = new ArrayList();
	List<Integer> list = new ArrayList();

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		Arrays.sort(candidates);
		helper(candidates, target, 0);
		return result;
	}

	void helper(int[] candidates, int target, int index) {
		if (target == 0) {
			result.add(new ArrayList(list));
			return;
		}
		if (target < 0 || index == candidates.length)
			return;
		helper(candidates, target, index + 1);
		list.add(candidates[index]);
		helper(candidates, target - candidates[index], index);
		list.remove(list.size() - 1);
	}
}