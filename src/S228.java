import java.util.ArrayList;
import java.util.List;

public class S228 {
	public List<String> summaryRanges(int[] nums) {

		List list = new ArrayList();
		for (int i = 0; i < nums.length; i++) {

			int a = nums[i];
			while (i + 1 < nums.length && nums[i + 1] - nums[i] == 1) {
				i++;
			}

			if (a == nums[i])
				list.add("" + a);
			else
				list.add(a + "->" + nums[i]);
		}

		return list;
	}
}