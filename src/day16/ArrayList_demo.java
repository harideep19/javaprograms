package day16;


import java.util.ArrayList;
import java.util.List;

public class ArrayList_demo {

	public static void main(String[] args) {
		//decelearation
		ArrayList mylist = new ArrayList();
		//List mylist = new ArrayList();
		//ArrayList <Integer>mylist = new ArrayList();
		//ArrayList <String>mylist = new ArrayList();
		//mylist.add(100);
		//mylist.add("Harideep");
		//size of an array
		mylist.add (100);
		mylist.add("Harideep");
		mylist.add(10.2);
		mylist.add('a');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		System.out.println(mylist.size());
		System.out.println(mylist);
		mylist.remove(6);
		System.out.println(mylist);
		mylist.add(6, "java");
		System.out.println(mylist);
		System.out.println(mylist.get(6));
		//read data from array
		for(Object x:mylist) {
			System.out.println(x);
		}
		

	}

}
