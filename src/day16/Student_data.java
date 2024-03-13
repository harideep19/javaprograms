package day16;

import java.util.ArrayList;

public class Student_data {

	public static void main(String[] args) {
		int rollno;
		String empname="";
		String branch="";
		int mobile;
		ArrayList mylist = new ArrayList();
		mylist.add(rollno=22);
		mylist.add(empname="Harideep");
		mylist.add(branch="ECM");
		mylist.add(mobile=994950892);
		mylist.add(rollno=23);
		mylist.add(empname="Chintu");
		mylist.add(branch="ECE");
		mylist.add(mobile=72459358);
		mylist.add(rollno=24);
		mylist.add(empname="Sathwik");
		mylist.add(branch="CSE");
		mylist.add(mobile=769845824);
		mylist.add(rollno=25);
		mylist.add(empname="Vikas");
		mylist.add(branch="Civil");
		mylist.add(mobile=7321458);
		System.out.println(mylist.size());
		System.out.println("Student  data:"+ mylist);
	}

}
