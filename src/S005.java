public class S005 {
	int lo, max;

	public String longestPalindrome(String s) {
		if (s == null || s.length() < 2)
			return s;

		for (int i = 0; i < s.length(); i++) {
			check(s, i, i);
			check(s, i, i + 1);
		}

		return s.substring(lo, lo + max);
	}

	void check(String s, int j, int k) {
		while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
			j--;
			k++;
		}
		j++;
		k--;
		int len = k - j + 1;
		if (len > max) {
			max = len;
			lo = j;
		}
	}

}