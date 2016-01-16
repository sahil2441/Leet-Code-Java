public class S238 {
	public int[] productExceptSelf(int[] nums) {

		int[] result = new int[nums.length];
		if (nums.length < 1)
			return result;
		result[0] = 1;
		int left = 1;
		result[result.length - 1] = 1;

		for (int i = 1; i < nums.length; i++) {
			left *= nums[i - 1];
			result[i] = left;
		}

		int right = 1;
		for (int i = nums.length - 2; i >= 0; i--) {
			right *= nums[i + 1];
			result[i] *= right;
		}
		return result;
	}
}