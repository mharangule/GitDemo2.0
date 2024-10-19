package oops;

public class ChildEmiritiesAbstract extends ParentAirCraftAbstarct{
	
	public static void main(String args[]) {
		ChildEmiritiesAbstract c=new ChildEmiritiesAbstract();
		c.bodyColor();
		c.engine();
		c.safetyGudeLines();
		c.a=6;
		System.out.println(c.a);
		
		
		ParentAirCraftAbstarct p =new ChildEmiritiesAbstract();
		p.bodyColor();
		p.engine();
		p.safetyGudeLines();
		p.a=9;
		System.out.println(p.a);
		
	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("Implement Body color");
	}

}
