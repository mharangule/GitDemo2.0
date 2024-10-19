package oops;

public class StaticVariables {
	String name; //instance Variable
	String address;
	static String city; //Static variable or Class Variable
	
	static {
		city="Pune"; 
	}
	
	StaticVariables(String name, String address){
		this.name=name;
		this.address=address;
	}
	
	public void getdata() {
		System.out.println(name+" "+address+" "+city);
	}
	
	public static void getCity() {
		System.out.println(city);
	}
	
	public static void main(String args[]) {
		StaticVariables s1= new StaticVariables("Vakratunda","City");
		StaticVariables s2= new StaticVariables("Gajanan","City");
		s1.getdata();
		s2.getdata();
		StaticVariables.getCity();
	}
}
