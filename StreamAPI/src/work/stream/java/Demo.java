package work.stream.java;

import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> items = Arrays.asList(200,300,400,500,600,9000);
System.out.println(items.stream().sorted((x,y)-> y-x).skip(1).findFirst());
	
	}

}
