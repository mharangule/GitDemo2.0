package oops;

public interface CentralTraffic {
	
	public default void say(){    
        System.out.println("Hello, this is default method");    
    }   
	
	public static void staticMethod() {
		System.out.println("Staic method in interface");
	}
	
	public static final int a=4;
	
	public abstract void greenGo();

	public void redStop();

	public void flashYellow();

}
