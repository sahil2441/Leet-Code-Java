public class S154 {
	public int findMin(int[] nums) {

		int start = 0, end = nums.length - 1, mid = 0;
		while (start < end) {
			mid = start + (end - start) / 2;
			if (nums[mid] > nums[end])
				start = mid + 1;
			else if (nums[mid] < nums[end])
				end = mid;
			else // case when both are same.
				end--;
		}
		return nums[start];
	}
}