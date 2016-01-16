public class S048 {
	public void rotate(int[][] matrix) {
		// reflection in X Axis

		int n = matrix.length;
		int m = matrix[0].length;

		int i = 0, j = n - 1, left, right;
		while (i < j) {
			for (int k = 0; k < m; k++) {
				int temp = matrix[i][k];
				matrix[i][k] = matrix[j][k];
				matrix[j][k] = temp;
			}
			i++;
			j--;
		}
		// transpose

		for (int x = 0; x < n; x++) {
			for (int y = x + 1; y < m; y++) {
				int temp = matrix[x][y];
				matrix[x][y] = matrix[y][x];
				matrix[y][x] = temp;
			}
		}

	}
}