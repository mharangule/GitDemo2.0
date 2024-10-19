package stringOperations;

public class StringComparison {
	public static void main(String args[]) {
		stringComparison();
	}

	public static void stringComparison() {
		String s1="Mahesh";
		String s2="Mahesh";
		String s3=s2;
		
		String s4 =new String("Mahesh");
		String s5 =new String("Mahesh");
		String s6 ="Maheshhghd";
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1==s4);
		System.out.println(s4==s5);
		
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s5));
		
		System.out.println(s6.compareTo(s1));
		System.out.println(s1.compareTo(s6));
		System.out.println(s2.compareTo(s5));
		
		String z=s2.concat(s6);
		System.out.println(z);		
	}
}
