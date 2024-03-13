package Day20;

public class Autoboxing_unboxing {

	public static void main(String[] args) {
		byte b=20;
		int i=40;
		long l=44;
		short s=70;
		float f=1.5f;
		double d=502.5;
		boolean B=true;
		char c='c';
		
		
		Byte byteobj=b;
		System.out.println("Autobox value:"+byteobj);
		Integer inobj=i;
		System.out.println("Autobox value:"+inobj);
		Long lobj=l;
		System.out.println("Autobox value:"+lobj);
		Short sobj=s;
		System.out.println("Autobox value:"+sobj);
		Float fobj=f;
		System.out.println("Autobox value:"+fobj);
		Double dobj =d;
		System.out.println("Autobox value:"+dobj);
		Boolean bobj=B;
		System.out.println("Autobox value:"+bobj);
		Character cobj = c;
		System.out.println("Autobox value:"+cobj);
		
		
		
		byte bv = byteobj;
		System.out.println("Unbox value:"+bv);
		int in = inobj;
		System.out.println("Unbox value:"+in);
		long lo = lobj;
		System.out.println("Unbox value:"+lo);
		short sh =sobj;
		System.out.println("Unbox value:"+sh);
		float fo = fobj;
		System.out.println("Unbox value:"+fo);
		double dd =dobj;
		System.out.println("Unbox value:"+dd);
		boolean bo= bobj;
		System.out.println("Unbox value:"+bo);
		char ch1 = cobj;
		System.out.println("Unbox value:"+ch1);
		
		

	}

}
