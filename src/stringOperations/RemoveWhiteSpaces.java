package stringOperations;

public class RemoveWhiteSpaces {

	private static void removeWhiteSpaces(String s) {
		String removed="";
		char arr[]=s.toCharArray();
		for(char ch:arr) {
			if((ch!=' ')&&(ch!='\t'))
				removed=removed+ch;
		}		
		System.out.println(removed);
	}
	
	
	public static void remove(String s) {
		String r=s;
		r=r.replaceAll(" ","");
		r=r.replaceAll("\t","");
		System.out.println(r);
	}
	
	public static void main(String args[]) {
		removeWhiteSpaces("     Mahesh    Sureh   	 Harangule  	");
		remove("     Mahesh    Sureh   	 Harangule  	");
	}

}
