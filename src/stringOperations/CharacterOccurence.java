package stringOperations;

import java.util.ArrayList;
import java.util.List;

public class CharacterOccurence {
public static void getCharacterOccurence(String string) {
		
		List<Character> charList=new ArrayList<Character>();
		
		for(int i=0;i<string.length();i++) {
			int characterCount=0;			
			if(!charList.contains(string.charAt(i))) {
				charList.add(string.charAt(i));
				characterCount++;
				for(int j=i+1; j<string.length();j++) {
					if(string.charAt(i)==string.charAt(j)) {
						characterCount++;
					}
				}
				System.out.println("The "+string.charAt(i)+ " is repeated "+characterCount+ " time." );
			}		
		}
	}

	public static void main(String args[]) {
		String str = " Maheshhhh    ";
		getCharacterOccurence(str);
	}
}
