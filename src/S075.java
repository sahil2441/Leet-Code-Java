public class S075 {
	public void sortColors(int[] nums) {
		int second = nums.length - 1, zero = 0;
		for (int i = 0; i <= second; i++) {
			while (nums[i] == 2 && i <= second)
				swap(nums, i, second--);
			while (nums[i] == 0 && i >= zero)
				swap(nums, i, zero++);
		}
	}

	void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}