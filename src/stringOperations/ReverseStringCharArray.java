package stringOperations;

public class ReverseStringCharArray {
	public static void main(String args[]){
		reverseStringCharArray("Mahesh");
	}

	public static void reverseStringCharArray(String s) {
		char characters[]=s.toCharArray();
		for(int i=characters.length-1; i>=0; i--)
			System.out.print(characters[i]);
	}
}
