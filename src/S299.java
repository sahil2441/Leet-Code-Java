public class S299 {
	public String getHint(String secret, String guess) {
		String ans = "";
		int bulls = 0, cows = 0;

		int[] numbers = new int[10];

		int i = 0;
		while (i < secret.length()) {

			int s = Character.getNumericValue(secret.charAt(i));
			int g = Character.getNumericValue(guess.charAt(i));

			if (s == g)
				bulls++;
			else {
				if (numbers[s] > 0)
					cows++;
				if (numbers[g] < 0)
					cows++;

				numbers[s]--;
				numbers[g]++;
			}
			i++;
		}

		ans += bulls + "A" + cows + "B";
		return ans;
	}
}