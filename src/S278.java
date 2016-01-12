/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class S278 {
	public int firstBadVersion(int n) {
		int start = 1, end = n, mid = n / 2;
		while (start < end) {
			mid = start + (end - start) / 2;
			if (!isBadVersion(mid))
				start = mid + 1;
			else
				end = mid;
		}
		return start;

	}

	private boolean isBadVersion(int mid) {
		// TODO Auto-generated method stub
		return false;
	}
}