public class S283 {

	public static void moveZeroes(int[] nums) {

		int zeroPosition = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[zeroPosition++] = nums[i];
			}
		}
		while (zeroPosition < nums.length) {
			nums[zeroPosition++] = 0;
		}
	}

}