import java.util.ArrayList;
import java.util.List;

public class ElementOccurence {

	private static void checkElementOccurence(int arr[]) {
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			int elementCount = 0;
			if (!list.contains(arr[i])) {
				list.add(arr[i]);
				elementCount++;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j])
						elementCount++;
				}
				if(elementCount>1)
					System.out.println(arr[i]+" is repeated "+elementCount+" time.");
				else
					System.out.println(arr[i]+" is unique element in the array");
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 5, 3, 1, 54, 6, 7, 9, 7, 4, 3 };
		checkElementOccurence(arr);

	}

}
