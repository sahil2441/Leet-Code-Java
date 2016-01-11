import java.util.HashMap;
import java.util.Map;

public class S290 {
	public boolean wordPattern(String pattern, String str) {
		String[] words = str.split(" ");
		if (words.length != pattern.length())
			return false;
		Map index = new HashMap();
		for (Integer i = 0; i < pattern.length(); i++) {
			if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
				return false;
		}
		return true;
	}
}