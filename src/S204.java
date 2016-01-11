public class S204 {
	public int countPrimes(int n) {

		boolean[] map = new boolean[n];
		for (Integer i = 2; i < n; i++) {
			map[i] = true;
		}

		for (Integer i = 2; i * i < n; i++) {
			if (map[i]) {
				for (Integer j = i * i; j < n; j += i) {
					if (!map[j])
						continue;
					map[j] = false;
				}
			}
		}

		int count = 0;

		for (Integer i = 2; i < n; i++) {
			if (map[i])
				count++;
		}
		return count;
	}
}