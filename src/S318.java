public class S318 {
	public int maxProduct(String[] words) {
		if (words == null || words.length < 2)
			return 0;

		int[] bytes = new int[words.length];
		for (int i = 0; i < words.length; i++) {
			int val = 0;
			for (int j = 0; j < words[i].length(); j++) {
				val |= 1 << (words[i].charAt(j) - 'a');
			}
			bytes[i] = val;
		}

		int max = 0;
		for (int i = 0; i < bytes.length; i++) {
			for (int j = i + 1; j < bytes.length; j++) {
				if ((bytes[i] & bytes[j]) == 0) {
					int val = words[i].length() * words[j].length();
					if (val > max)
						max = val;
				}
			}
		}

		return max;
	}
}