package oops;

public class ChildClass extends ParentClass {
	String s="From child class";
	int a= 5;
	
	ChildClass(){
		super(3);
		System.out.println("Child Class constructor called");
	}
		
	public void getData() {
		System.out.println(s);
		System.out.println(super.s);
		System.out.println(this.s);
	}
	
	public void color(int a) {
		System.out.println("Color from child class");
		int c=a+this.a;
		System.out.println(c);
	}
	
	//Method Overriding
	@Override
	public void audio() {
		System.out.println("Enhanced Audio from child class");
	}
	
	public void printData(int a) {
		System.out.println(a);
	}
	
	public void printData(String a) {
		System.out.println(a);
	}
	
	
	public static void main(String args[]) {
		ChildClass c= new ChildClass();
		ParentClass p= new ParentClass();
		ParentClass pc = new ChildClass();
		c.audio();
		p.audio();
		pc.audio();
		
		c.printData(21);
		c.printData("Vakratunda");
		c.getData();
		c.color(5);
	}
	
	
}
