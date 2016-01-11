public class S125 {
	public boolean isPalindrome(String s) {
		if (s == null)
			return true;
		int n = s.length();
		if (n == 0 || n == 1)
			return true;

		int head = 0, tail = s.length() - 1;
		int cHead, cTail;

		while (head < tail) {
			cHead = s.charAt(head);
			cTail = s.charAt(tail);

			if (!(Character.isLetterOrDigit(cHead)))
				head++;
			else if (!(Character.isLetterOrDigit(cTail)))
				tail--;
			else if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail))
				return false;
			else {
				head++;
				tail--;
			}
		}
		return true;
	}
}