public class S028 {
	public int strStr(String haystack, String needle) {
		if (haystack == null || needle == null)
			return -1;
		int l1 = haystack.length(), l2 = needle.length();
		if (l1 < l2)
			return -1;
		if (l2 == 0)
			return 0;
		for (int i = 0; i <= l1 - l2; i++) {
			if (haystack.substring(i, i + l2).equals(needle))
				return i;
		}
		return -1;

	}
}