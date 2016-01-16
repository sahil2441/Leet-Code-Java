public class S260 {
	public int[] singleNumber(int[] nums) {
		int[] result = new int[2];
		int x = 0;
		for (int i = 0; i < nums.length; i++) {
			x ^= nums[i];
		}

		int a = x & -x;

		int first = 0, second = 0;
		for (int i = 0; i < nums.length; i++) {
			if ((nums[i] & a) != 0)
				first ^= nums[i];
			else
				second ^= nums[i];
		}
		result[0] = first;
		result[1] = second;

		return result;
	}
}