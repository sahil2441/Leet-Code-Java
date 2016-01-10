import java.util.ArrayList;
import java.util.List;

public class S119 {
	public List<Integer> getRow(int rowIndex) {

		List<Integer> row = new ArrayList<Integer>();
		if (rowIndex < 0)
			return row;

		for (int i = 0; i < rowIndex + 1; i++) {
			row.add(0, 1);
			for (int j = 1; j < row.size() - 1; j++)
				row.set(j, row.get(j) + row.get(j + 1));
		}
		return row;

	}
}