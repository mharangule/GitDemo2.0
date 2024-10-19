import java.util.Scanner;

public class Cashier {
	private static void getCurrency(int amount){
		int note[]= {2000,500,200,100,50,20,10,5,2,1};
		
		int notecounter[]=new int[note.length];
		
		//Count the notes
		for(int i=0;i<note.length;i++) {
			if(amount>=note[i]) {
				notecounter[i]=amount/note[i];
				amount=amount%note[i];
			}			
		}
		
		//Print the note count
		for(int i=0;i<note.length;i++) {
			System.out.println(note[i]+" : "+notecounter[i]);
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the ammonut");
		Scanner sc =new Scanner(System.in);
		getCurrency(sc.nextInt());
	}	
}
