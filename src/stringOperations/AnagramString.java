package stringOperations;

public class AnagramString {
	public static void main(String[] args) {
		System.out.println(checkAnagram("ACT","TCA"));
		System.out.println(checkAnagram("mahesh","heasmH"));
		System.out.println(checkAnagram("PAT","cg"));
	}

	public static boolean checkAnagram(String s1, String s2) {
		char characters[] = s1.toLowerCase().toCharArray();
		StringBuilder sb = new StringBuilder(s2.toLowerCase());

		if (s1.length() != s2.length())
			return false;

		for(char ch:characters) {
			int index =sb.indexOf(""+ch);
			if(index!=-1) {
				sb.deleteCharAt(index);
			}
			else {
				return false;
			}
		}

		return sb.length() == 0 ? true : false;

	}
}
