package homeTask12;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Avarage {
	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

		// ****Method1****
		int sum = 0;
		for (int i : num) {
			sum += i;
		}
		System.out.println("Average is " + sum / (float) num.size());

		// ****Method2****
		IntSummaryStatistics stats = num.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println("Average is " + stats.getAverage());
	}
}
