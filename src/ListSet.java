import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListSet {
	public static void main(String args[]) {

		int[] a = new int[5];
		a[0] = 6;
		a[3] = 7;
		for (int b : a) {
			if (b == 6)
				System.out.println("number found");
			System.out.println(b + " ");
			// System.out.println(a.length);
		}

		List<String> number = new ArrayList<String>();
		number.add("Vivek");
		number.add("Mahesh");
		for (int i = 0; i < number.size(); i++) {
			if (number.get(i).equalsIgnoreCase("vivek"))
				System.out.println("name found");

		}

		int i = 5;
		List<Integer> listNumbers = new ArrayList<Integer>();
		listNumbers.add(2);
		listNumbers.add(3);
		listNumbers.add(5);
		listNumbers.add(5);
		listNumbers.add(2);
		listNumbers.add(3);
		listNumbers.add(5);

		System.out.println(listNumbers);

		if (i == listNumbers.get(1)) {
			System.out.println("Found");
		} else
			System.out.println(" not Found");

		Set<Integer> setNumbers = new LinkedHashSet<Integer>();
		setNumbers.add(2);
		setNumbers.add(10);
		setNumbers.add(3);
		setNumbers.add(5);

		System.out.println(setNumbers);

	}
}
