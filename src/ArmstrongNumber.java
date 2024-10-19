
public class ArmstrongNumber {
	private static int checkArmstrong(int number) {
		
		int temp=number, armstrongNumber=0, digitcount=0;
		//Count the digit
		while(temp>0) {
			digitcount++;
			temp=temp/10;
		}
		
		temp=number;
		
		while(temp>0) {
			int remainder =temp%10;
			int multiply=1;
			for(int i=1; i<=digitcount; i++)
				multiply=multiply*remainder;
			    armstrongNumber=armstrongNumber+multiply;
			    temp=temp/10;
		}
		return armstrongNumber;
	}
	public static void main(String args[]) {
		System.out.println("Armstrong Numbers between 1 to 10000");
		for(int i=1; i<=10000;i++) {
		if(i==checkArmstrong(i))
			System.out.print(i+" ");
		}
	} 
}

// 1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1 + 1296 + 81 + 256 = 1634

// 153  = 1*1*1 + 5*5*5 + 3*3*3  

