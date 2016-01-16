import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class S047 {
	public List<List<Integer>> permuteUnique(int[] nums) {
		Arrays.sort(nums);
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
		Set<String> cache = new HashSet();

		for (List<Integer> list : prev) {
			for (int i = 0; i <= list.size(); i++) {
				List<Integer> newList = new ArrayList(list);
				newList.add(i, nums[index]);
				if (cache.add(newList.toString()))
					result.add(newList);
			}
		}
		return result;
	}

}