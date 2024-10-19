package oops;

public class ParentClass {
	
	ParentClass(){
		System.out.println("Parent Class constructor called");
	}
	
	ParentClass(int n){
		this();
		System.out.println("Parent Class parameterised constructor called");
	}
	String s="From Parent class";
	public void engine() {
		System.out.println("Engine from parent class");
	}
	
	public void audio() {
		System.out.println("Audio from parent class");
	}
	
}
