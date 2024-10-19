package oops;

public class IndianTrafficInterface implements CentralTraffic, ContinentTrafic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CentralTraffic c= new IndianTrafficInterface();
		c.flashYellow();
		c.greenGo();
		c.redStop();
		
		ContinentTrafic ct= new IndianTrafficInterface();
		ct.trainSymbol();
		
		IndianTrafficInterface i =new IndianTrafficInterface();
		i.walkSymbol();
		i.flashYellow();
		System.out.println(c.a);
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("greenGo implementation from CentralTraffic interface");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("redStop implementation from CentralTraffic interface");
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("flashYellow implementation from CentralTraffic interface");
	}

	public void walkSymbol() {
		System.out.println("walkSymbol implementation from IndianTraffic Class");
	}

	@Override
	public void trainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("trainSymbol implementation from ContinentTrafic interface");
	}
}
