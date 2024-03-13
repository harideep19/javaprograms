package day16;

import java.util.HashMap;

public class Hashmapdemo {

	public static void main(String[] args) {
		HashMap mymap= new HashMap();
		mymap.put("cmp name", "W3 Softech");
		mymap.put("empid",101 );
		mymap.put("name", "Harideep");
		mymap.put("mobile", 994950892);
		mymap.put("salary", 18360.25);
		mymap.put("acc no", 372550705);
		mymap.put("performance", true);
		mymap.put("intial", 'A');
		
		System.out.println(mymap);
		mymap.remove("acc no");
		System.out.println(mymap);
		mymap.get("name");
		System.out.println(mymap);
		System.out.println(mymap.size());
		
		for(Object x:mymap.keySet()) {
			System.out.println(x);
			//System.out.println(x+""+mymap.get(x));
		}
			mymap.get("name");
			System.out.println();
			
			mymap.clear();
			System.out.println(mymap);
		
	
		
		
	
	}

}
