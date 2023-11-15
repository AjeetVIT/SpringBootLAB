package work.stream.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>arl=new ArrayList<String>(5);
		arl.add("apple");
		arl.add("mango");
		arl.add("Banana");
		arl.add("grapes");
		arl.add("orange");
		arl.add("apple");
		arl.add(2,"Kiwi");
		//System.out.println(arl);
		//arl.forEach(l->System.out.println(l.toUpperCase()));
		
		arl.forEach(System.out::println);
		System.out.println("------------------------");
		ListIterator<String> it = arl.listIterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s.toUpperCase());
		
		}
//	
//for(String s:arl) System.out.println(s);
//		 
	}

}
