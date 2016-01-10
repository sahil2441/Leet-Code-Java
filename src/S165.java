public class S165 {
	public int compareVersion(String version1, String version2) {
		if (version1.equals(version2))
			return 0;
		String[] levels1 = version1.split("\\.");
		String[] levels2 = version2.split("\\.");

		int min = Math.max(levels1.length, levels2.length);
		for (int i = 0; i < min; i++) {
			Integer a = i < levels1.length ? Integer.valueOf(levels1[i]) : 0;
			int b = i < levels2.length ? Integer.valueOf(levels2[i]) : 0;

			if (a.compareTo(b) != 0)
				return a.compareTo(b);
		}
		return 0;
	}
}