package day9;

public class Class1 {
	
	//variables
	int eid;
	int esal;
	static String job="trainee";
	String ename;	
	
	//constructor
	Class1(int id,int sal,String jobs,String name){
		
	
	    eid=id;
		esal=sal;
		job=jobs;
		ename=name;
	}	
		
	
	//methods
	
	void display()
	{
		System.out.println(eid);
		System.out.println(esal);
		System.out.println(job);
		System.out.println(ename);
	}

}
