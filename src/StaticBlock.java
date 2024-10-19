
public class StaticBlock {
	
	static {
		System.out.println("Static Block");
	}
	{
		System.out.println("Instance Block");
	}
	StaticBlock(){
		System.out.println("Constructor");
	}
	
	public static void main(String args []) {
		StaticBlock s =new StaticBlock();
	}
}
