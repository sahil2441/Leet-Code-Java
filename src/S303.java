public class S303 {
	int[] nums;

	public S303(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			nums[i] += nums[i - 1];
		}
		this.nums = nums;
	}

	public int sumRange(int i, int j) {
		int sum = 0;
		if (i == 0)
			return nums[j];
		return nums[j] - nums[i - 1];
	}
}