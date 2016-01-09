
//Moore's Voting Algorithms
public class S169 {
	public int majorityElement(int[] nums) {

		int count = 1, maj = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (count == 0) {
				count++;
				maj = nums[i];
			} else if (maj == nums[i]) {
				count++;
			} else
				count--;
		}
		return maj;
	}
}
