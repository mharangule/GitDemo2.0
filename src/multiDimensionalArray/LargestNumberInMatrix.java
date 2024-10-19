package multiDimensionalArray;

public class LargestNumberInMatrix {
	public static void main(String args[]) {
		int a[][]={{4,2,0},{1,7,6},{3,5,8}};
		finLargest(a);
	}

	public static void finLargest(int[][] a) {
		int smallest =a[0][0];
		int column=0;
		for(int i=0; i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
				if(a[i][j]<smallest) {
					smallest=a[i][j];
					column=j;
				}		
			}
			System.out.println();
		}
		
		System.out.println("Smallest Number in the matrix is "+smallest);
		
		int largest=a[0][column];
		for(int row=0;row<a.length;row++) {
			if(a[row][column]>largest)
				largest=a[row][column];			
		}
		
		System.out.println("Largest Number "+largest+" found at "+column+" column");
		
	}
}
/*
 * 1)find the smallest number in the matrix
 * 2)Find the largest number from same column where smallest number is found
 * 
 * 4 2 0 
 * 1 7 6 
 * 3 5 8
 * 
 * Smallest Number in the matrix is 0 
 * Largest Number 8 found at 2 column
 */
