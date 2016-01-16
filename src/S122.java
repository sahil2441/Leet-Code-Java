public class S122 {
	public int maxProfit(int[] prices) {
		if (prices.length < 2)
			return 0;
		int total = 0, diff = 0;

		for (int i = 1; i < prices.length; i++) {
			diff = prices[i] - prices[i - 1];
			if (diff > 0)
				total += diff;
		}
		return total;
	}
}