import java.util.HashMap;
import java.util.Map;

public class S003 {
	public int lengthOfLongestSubstring(String s) {
		int max = 0, curr = 0, left = 0;
		Map<Character, Integer> map = new HashMap();

		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				left = Math.max(map.get(s.charAt(i)) + 1, left);
			}

			curr = i - left + 1;
			max = Math.max(max, curr);
			map.put(s.charAt(i), i);
		}
		return max;
	}
}