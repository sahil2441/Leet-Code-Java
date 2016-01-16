import java.util.ArrayList;
import java.util.List;

public class S022 {
	public List<String> generateParenthesis(int n) {
		List<String> result = new ArrayList();
		helper(result, "", 0, 0, n);
		return result;
	}

	void helper(List<String> result, String str, int open, int close, int max) {
		if (str.length() == 2 * max) {
			result.add(str);
			return;
		}

		if (open < max)
			helper(result, str + "(", open + 1, close, max);
		if (close < open)
			helper(result, str + ")", open, close + 1, max);
	}
}