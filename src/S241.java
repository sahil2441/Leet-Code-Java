import java.util.ArrayList;
import java.util.List;

public class S241 {
	public List<Integer> diffWaysToCompute(String input) {
		List<Integer> answer = new ArrayList();
		if (input.length() < 1)
			return answer;

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch != '+' && ch != '-' && ch != '*')
				continue;

			String part1 = input.substring(0, index);
			String part2 = input.substring(index + 1);

			List<Integer> list1 = diffWaysToCompute(part1);
			List<Integer> list2 = diffWaysToCompute(part2);

			for (int i : list1) {
				for (int j : list2) {
					int c = 0;
					switch (ch) {
					case '+':
						c = i + j;
						break;
					case '-':
						c = i - j;
						break;
					case '*':
						c = i * j;
					}
					answer.add(c);
				}
			}
		}
		if (answer.size() == 0)
			answer.add(Integer.valueOf(input));
		return answer;

	}
}