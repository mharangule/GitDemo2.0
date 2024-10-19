package stringOperations;

public class WordCount {
	public static int WordCounter(String s) {
		int wordCount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (  ((i>0)&&(s.charAt(i)!=' ') && (s.charAt(i-1)==' '))   ||   ((s.charAt(i)!=' ')&&(i==0))  )
				
				wordCount++;
		}
		return wordCount;
	}

	public static void main(String[] args) {
		String string=" Mahesh  ss fg      Suresh Harangule  ";
		int count = WordCounter(string);
		System.out.println(count + " words");
	}
}
