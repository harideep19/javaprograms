package day16;

import java.util.HashSet;
import java.util.Set;

public class Hashsetdemo {

	public static void main(String[] args) {
		HashSet myset = new HashSet();
		//Set myset= new HashSet();
		//HashSet<Integer> myset = new HashSet();
		//myset.add(100)
		//HashSet<String> myset = new HashSet();
		//myset.add("Harideep");
		myset.add(100);
		myset.add("harideep");
		myset.add(10.5);
		myset.add(100); // Hashset wont allow duplicates
		myset.add(null);
		myset.add(null);// we can only store one null value
		System.out.println(myset);
		System.out.println(myset.size());	
		myset.remove(10.5);
		System.out.println(myset);
		// read a specific values is not possible
		//read data
		for(Object x:myset) {
			System.out.println(x);
		}
			
	
	
	} 

}
