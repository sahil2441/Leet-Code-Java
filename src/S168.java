public class S168 {
	public String convertToTitle(int n) {
		String res = "";

		while (n != 0) {
			n--;
			Character ch = (char) (n % 26 + 'A');
			res += ch;
			n /= 26;
		}

		return new StringBuilder(res).reverse().toString();
	}
}