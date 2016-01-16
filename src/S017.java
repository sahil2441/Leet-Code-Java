import java.util.ArrayList;
import java.util.List;

public class S017 {
	public List<String> letterCombinations(String digits) {
		List<String> result = new ArrayList();
		if (digits.length() < 1)
			return result;
		String[] arr = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		List<String> list = new ArrayList();
		for (int i = 0; i < digits.length(); i++) {
			int x = Character.getNumericValue(digits.charAt(i));
			if (arr[x] != "")
				list.add(arr[x]);
		}
		helper(result, list, "", digits.length());
		return result;
	}

	void helper(List<String> result, List<String> list, String s, int n) {
		if (s.length() == n) {
			result.add(s);
			return;
		}
		for (int i = 0; i < list.get(s.length()).length(); i++) {
			s += list.get(s.length()).charAt(i);
			helper(result, list, s, n);
			s = s.substring(0, s.length() - 1);
		}

	}
}