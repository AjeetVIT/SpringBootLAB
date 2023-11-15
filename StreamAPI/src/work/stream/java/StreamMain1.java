package work.stream.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamMain1 {
	public static void main(String[] args) {
		//Q>create a List and filter all even number from list
		
		List<Integer> list1 = List.of(2,4,50,21,22,34,67);
		//list1.add(45);
		System.out.println(list1);
		List<Integer>list2=new ArrayList<>();
		list2.add(12);
		list2.add(13);
		list2.add(14);
		list2.add(15);
		list2.add(16);
		System.out.println(list2);
		List<Integer> list3 = Arrays.asList(23,345,45,21,655,90,34);
	System.out.println(list3);	
	}

}
