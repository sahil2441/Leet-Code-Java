import java.util.HashMap;
import java.util.Map;

public class S205 {
	public boolean isIsomorphic(String s, String t) {
		Map map = new HashMap();

		for (int i = 0; i < s.length(); i++) {

			char a = s.charAt(i);
			char b = t.charAt(i);

			if (map.containsKey(a)) {
				if (map.get(a).equals(b))
					continue;
				else
					return false;
			} else {
				if (!map.containsValue(b))
					map.put(a, b);
				else
					return false;
			}
		}
		return true;
	}
}