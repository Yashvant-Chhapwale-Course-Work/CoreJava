package Package2;

import Package1.Access1;

public class Access3 extends Access1{

	public static void main(String[] args) {

		Access3 a3 = new Access3();
		//System.out.println(a3.a);// Default Variable
		  System.out.println(a3.b);// Public Variable
		//System.out.println(a3.c);// Private Variable
		  System.out.println(a3.d);// Protected Variable

		Access1 a1 = new Access1();
		// System.out.println(a1.a);// Default Variable
		   System.out.println(a1.b);// Public Variable
		// System.out.println(a1.c);// Private Variable
		// System.out.println(a1.d);// Protected Variable

	}

}
