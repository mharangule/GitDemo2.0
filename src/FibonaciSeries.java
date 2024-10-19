
public class FibonaciSeries {

	private static void printFibonaci(int length) {
		int num1 = 0, num2 = 1;
		for(int i=0;i<length;i++) {
			System.out.print(num1 + " ");
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
		}
	}
	
	public static void main(String[] args) {
		int a = 10;
		printFibonaci(a);
	}
}
