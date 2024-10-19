package stringOperations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReverseStringList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseStringList("Mahesh");
	}

	public static void reverseStringList(String s) {
		char characters[]=s.toCharArray();
		List<Character> charList = new ArrayList<Character>();
		
		for(char c:characters)
			charList.add(c);
		
		Collections.reverse(charList);
		
		Iterator<Character> itr=charList.iterator();
		while(itr.hasNext())
			System.out.print(itr.next());
	}

}
