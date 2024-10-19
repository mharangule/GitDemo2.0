package stringOperations;

public class ReverseStringStringBuilder {
	public static void main(String args[]) {
		reverseStringStringBuilder("Mahesh");
	}

	public static void reverseStringStringBuilder(String p) {
		StringBuilder s =new StringBuilder(p);
		System.out.println(s.reverse());
		
	}
}
