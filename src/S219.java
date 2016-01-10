import java.util.HashSet;
import java.util.Set;

public class S219 {
	public boolean containsNearbyDuplicate(int[] nums, int k) {

		Set set = new HashSet();
		for (int i = 0; i < nums.length; i++) {
			if (i > k)
				set.remove(nums[i - k - 1]);
			if (!set.add(nums[i]))
				return true;
		}
		return false;
	}
}