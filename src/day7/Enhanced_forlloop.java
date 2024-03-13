package day7;

import java.lang.reflect.Array;


public class Enhanced_forlloop {

	public static void main(String[] args) {
		int a[] = {10, 20, 30, 40, 50};
        int Element = 30;
        boolean flag =true;
        for(int i=0;i<=5;i++) {
        	if(i==Element) {
        		flag = true;
        		break;
        	}
        }
        	if(flag=true) {
        		System.out.println("Element found:"+Element);
        	}else {
        		System.out.println("not found:"+Element);
        	}
        }
       
	}
	
