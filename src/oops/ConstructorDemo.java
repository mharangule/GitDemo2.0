package oops;

public class ConstructorDemo {
	int n;
	String s;
	//
	ConstructorDemo(){
		System.out.println("Constructor called");
	}
	
	ConstructorDemo( int a , String b){
		n=a;
		s=b;
	}
	
	public static void main(String args[]) {
		ConstructorDemo c1 =new ConstructorDemo();
		ConstructorDemo c2 =new ConstructorDemo(21,"Vakratunda");
		System.out.println(c2.n+ " "+c2.s);
		System.out.println(c1.n+ " "+c1.s);
	}
	
}
