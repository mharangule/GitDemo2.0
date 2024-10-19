import java.util.Scanner;

public class NumberPelindrome {
	private static void checkPelindrome(int number) {
		int reversedNumber=0;
		int originalNumber=number;
		while(number>0) {
			int remainder =number%10;
			number=number/10;
			reversedNumber=reversedNumber*10+remainder;
		}
		
		if(originalNumber==reversedNumber)
			System.out.println(originalNumber+" is a pelindrome number");
		else
			System.out.println(originalNumber+" is not a pelindrome number");
	}	
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the Number");
		int number =sc.nextInt();
		checkPelindrome(number);
	}
}
