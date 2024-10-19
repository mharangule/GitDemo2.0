import java.util.Scanner;

public class StringPelindrome {
	public static void main(String args[]) {
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
//		String s="madam";
		if(checkPelindrome(s))
			System.out.println("Pelindrome");
		else
			System.out.println("Not Pelindrome");
		}

	private static boolean checkPelindrome(String s) {
		String original=s.toLowerCase();
		String reversed="";
		for(int i=original.length()-1;i>=0;i--)
			reversed=reversed+original.charAt(i);
		if(original.equals(reversed))
			return true;
		else
			return false;
	}
}
