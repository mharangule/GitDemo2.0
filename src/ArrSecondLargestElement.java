import java.util.ArrayList;
import java.util.List;
public class ArrSecondLargestElement {
	private static int getSecondLargestElement(int []arr) {
	
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		List<Integer> uniqueList=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(!uniqueList.contains(arr[i])) {
				uniqueList.add(arr[i]);
			}
		}
		return uniqueList.get(uniqueList.size()-2);
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,4,3,4,5,8,4,3,4,3,4,5,4,4,4,6,3,4,5,7,9,6,4};
		System.out.println(getSecondLargestElement(arr));
	}
}
