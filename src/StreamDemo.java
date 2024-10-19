import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class StreamDemo {
	public static void main(String args[]) {
		List<String> list =new ArrayList<String>();
		list.add("Vakrtunda");
		list.add("Gajanan");
		list.add("Ganesh");
		list.add("Moreshwar");
		list.add("Ganpati");
		
		performStream(list);
	}

	public static void performStream(List<String> list) {
		
		
		long count=list.stream().filter(p->p.startsWith("G")).count();
		System.out.println(count);
		
		list.stream().filter(s->s.length()>5).forEach(s->System.out.println(s));
		
		list.stream().filter(s->s.length()>5).limit(1).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		List<String> newList=list.stream().filter(s->s.startsWith("G")).map(s->s.toUpperCase()).sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(newList);
		
		boolean flag=list.stream().anyMatch(s->s.equalsIgnoreCase("Vakrtunda"));
		
		System.out.println(flag);
		
		Assert.assertTrue(flag);
		
		int a[]= {3,4,6,8,2,1,3,4,20,8,5};
		
		List<Integer> intList=Arrays.asList(3,4,6,8,2,1,3,4,20,8,5);
		
		List<Integer> sortedIntList=intList.stream().distinct().sorted().collect(Collectors.toList());
		
		System.out.println(sortedIntList);
		
		System.out.println(sortedIntList.get(sortedIntList.size()-2));
		

	}
}
