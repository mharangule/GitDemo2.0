
public class Factorial {
	public static void main(String args[]) {
		for(int i=1;i<=10;i++) 
		 System.out.println("Factorial of "+i+" = "+getFactorial(i));
	}
	
	public static int getFactorial(int number) {
		int n=number, factorial=1;
		for(int i=1;i<=n;i++) {
			factorial=factorial*i;
		}
		return factorial;
	}
}
