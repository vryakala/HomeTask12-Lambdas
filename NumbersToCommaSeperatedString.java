package homeTask12;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class NumbersToCommaSeperatedString {

	static StringBuilder builder = new StringBuilder();

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(2, 3, 5, 7, 8, 11, 13, 17, 19, 23, 29);
		evaluate(num, (n) -> n % 2 == 0);
		System.out.println(builder);
	}

	public static void evaluate(List<Integer> list, Predicate<Integer> predicate) {

		for (Integer n : list) {
			if (predicate.test(n)) {
				builder.append('e');
				builder.append(n);
				if (list.indexOf(n) != list.size() - 1)
					builder.append(',');
			} else {
				builder.append('o');
				builder.append(n);
				if (list.indexOf(n) != list.size() - 1)
					builder.append(',');

			}
		}
	}
}