package day16;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		
		//HashMap mymap = new HashMap();
		//Map mymap = new HashMap();
		HashMap<Integer,String> mymap = new HashMap<Integer,String>();
		mymap.put(101, "Harideep");
		mymap.put(102, "Hemanth");
		mymap.put(103, "Shiva");
		mymap.put(101, "mani");
		mymap.put(105, "mani");
		
		System.out.println(mymap);
		System.out.println(mymap.size());
		mymap.get(102);
		System.out.println(mymap);
		
		for(int x: mymap.keySet())
		{
			System.out.println(x+""+mymap.get(x));
			
		}	 
			 mymap.get(102);
			 System.out.println(mymap);
			 
			 mymap.clear();
			 System.out.println(mymap);
			 
		
	}

}
