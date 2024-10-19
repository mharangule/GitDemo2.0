package stringOperations;

public class ReverseWordsInString {
	public static void main(String[] args) {
		String s = "Mahesh Suresh Harangule";
		stringOperations(s);
	}

	public static void stringOperations(String s) {
		String[] spilttedString = s.split(" ");
		for (int i = 0; i < spilttedString.length; i++) {
			String string = spilttedString[i];
			for (int j = string.length() - 1; j >= 0; j--) {
				System.out.print(string.charAt(j));
			}
			System.out.print(" ");
		}
	}
}
