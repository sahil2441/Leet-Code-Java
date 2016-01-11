public class S058 {
	public int lengthOfLastWord(String s) {

		String[] strings = s.split(" ");

		if (strings.length < 1)
			return 0;
		return strings[strings.length - 1].length();

	}
}