public class S053 {
	public int maxSubArray(int[] nums) {

		// kadane's algo

		if (nums == null || nums.length < 1)
			return 0;
		int max = nums[0], curr = nums[0];

		for (int i = 1; i < nums.length; i++) {
			if (curr < 0)
				curr = 0;
			curr += nums[i];
			max = Math.max(curr, max);
		}
		return max;
	}
}