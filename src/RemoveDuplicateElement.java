import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateElement {
	public static void main(String args[]) {
		int a[]= {1,4,4,8,8,3,2,5,7,7};
		removeDuplicateElement(a);
	}
	
	public static void removeDuplicateElement(int arr[]) {
		List<Integer> uniquelist = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length-1;i++) {
			if(!uniquelist.contains(arr[i])) {
				uniquelist.add(arr[i]);
			}
		}
		System.out.println(uniquelist);
	}
}
