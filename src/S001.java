import java.util.HashMap;
import java.util.Map;

public class S001 {
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap();

		for (int i = 0; i < nums.length; i++) {

			if (map.containsKey(target - nums[i])) {
				result[0] = map.get(target - nums[i]);
				result[1] = i + 1;
				break;
			}
			map.put(nums[i], i + 1);
		}
		return result;

	}
}