import java.util.ArrayList;
import java.util.List;

public class S046 {
	public List<List<Integer>> permute(int[] nums) {
		return helper(nums, 0);
	}

	List<List<Integer>> helper(int[] nums, int index) {
		List<List<Integer>> result = new ArrayList();
		if (index == nums.length) {
			List<Integer> curr = new ArrayList();
			result.add(curr);
			return result;
		}

		List<List<Integer>> prev = helper(nums, index + 1);
		for (List<Integer> list : prev) {
			for (int i = 0; i <= list.size(); i++) {
				List<Integer> listNew = new ArrayList(list);
				listNew.add(i, nums[index]);
				result.add(listNew);
			}
		}

		return result;
	}
}