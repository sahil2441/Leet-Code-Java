public class S153 {
	public int findMin(int[] nums) {

		int lo = 0, hi = nums.length - 1, mid = 0;
		while (lo <= hi) {
			if (nums[lo] <= nums[hi])
				return nums[lo];
			mid = (lo + hi) / 2;
			if (nums[mid] >= nums[lo])
				lo = mid + 1;
			else
				hi = mid;
		}
		return nums[mid];
	}
}