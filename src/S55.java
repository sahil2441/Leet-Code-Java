public class S55 {
	public boolean canJump(int[] nums) {

		int n = nums.length, last = n - 1;
		for (int i = n - 2; i > -1; i--) {
			if (nums[i] + i >= last)
				last = i;
		}
		return last <= 0;

	}
}