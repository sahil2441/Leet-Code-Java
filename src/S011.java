import java.util.HashMap;

public class S011 {
	public int romanToInt(String s) {

		if (s == null || s.length() < 1)
			return 0;

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		int result = map.get(s.charAt(s.length() - 1));
		int i = s.length() - 2;
		while (i >= 0) {
			int val = map.get(s.charAt(i));
			if (val < map.get(s.charAt(i + 1)))
				result -= val;
			else
				result += val;
			i--;
		}
		return result;
	}
}