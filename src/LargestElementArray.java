
public class LargestElementArray {
	public static int largestElementArray(int [] arr) {
		int largest=arr[0];
		for(int number:arr) {
			if((number>largest))
				largest=number;
		}
		return largest;
	}
	
	public static void main(String arr[]) {
		int [] array= {2,3,4,5,35,6,8,4,4,10,1,34};
		System.out.println(largestElementArray(array));
	}
}
