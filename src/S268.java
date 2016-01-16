public class S268 {
	public int missingNumber(int[] nums) {
		/*
		 * int n=nums.length; int sum=n*(n+1)/2; int curr=0; for(int
		 * i=0;i<nums.length; i++){ curr+=nums[i]; } return sum-curr;
		 */
		// 2nd way

		int xor = 0;
		int i = 0;
		for (i = 0; i < nums.length; i++) {
			xor ^= i ^ nums[i];
		}
		return xor ^ i;

	}
}