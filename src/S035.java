public class S035 {
	public int searchInsert(int[] nums, int target) {

		// O(n)
		/*
		 * int i=0; for(; i<nums.length; i++){ if(nums[i]==target) return i;
		 * else if(nums[i]>target) return i; } return i;
		 */

		int lo = 0, hi = nums.length - 1, mid = (lo + hi) / 2;

		while (lo <= hi) {
			mid = (lo + hi) / 2;
			if (nums[mid] == target)
				return mid;
			else if (nums[mid] > target)
				hi = mid - 1;
			else
				lo = mid + 1;
		}
		if (nums[mid] < target)
			return mid + 1;
		else
			return mid;

	}
}