public class S121 {
	public int maxProfit(int[] nums) {

		if (nums.length < 2)
			return 0;
		int n = nums.length;

		// Kadane's Algorithm
		int curr = 0, max = 0;
		for (int i = 1; i < n; i++) {
			curr += nums[i] - nums[i - 1];
			if (curr > max)
				max = curr;
			if (curr < 0)
				curr = 0;
		}
		return max;

	}
}