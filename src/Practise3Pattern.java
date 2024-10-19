
public class Practise3Pattern {

	public static void main(String[] args) {
		printPyramid();
	}

	public static void printPyramid() {
		int counter=1;
		for(int i=1;i<5;i++) {
			
			for(int j=1;j<=5-i;j++) {
				
				System.out.print(counter+"\t");
				counter++;
			}
			System.out.println();
		}
	}

}
