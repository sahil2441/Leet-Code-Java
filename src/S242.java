public class S242 {

	public boolean isAnagram(String s, String t) {

		if (s.length() != t.length())
			return false;

		int[] array = new int[26];

		int x = 0, y = 0;

		for (int i = 0; i < s.length(); i++) {
			x += (1 << (s.charAt(i) - 'a'));
			y += (1 << (t.charAt(i) - 'a'));
		}
		return x == y;
	}
}