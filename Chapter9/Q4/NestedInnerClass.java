package Q4;

public class NestedInnerClass {
	static private int empCount = 50;

	static class EmpCounter { // Nested Inner Class/ Static Inner Class
		public void display1() { // Non Static Method In Nested Inner Class can access only Static Variables from Outer Class.
			System.out.println("Total Number Of Employees using Non-Static Method:: " + empCount);
		}

		static public void display2() { // Static Method In Nested Inner Class can also access only Static Variables from Outer Class.
			System.out.println("Total Number Of Employees using Static Method:: " + empCount);
		}
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		NestedInnerClass.EmpCounter e = new NestedInnerClass.EmpCounter(); // Creating Inner Class Reference
		e.display1(); // Method-I For Giving Call To Inner Class Method(Non Static)!
		e.display2(); // Method-I For Giving Call To Inner Class Method(Static)!

		// Method-II For Giving Call To Inner Class Method(Static)[Calling Static Method Directly Using Class Name!]
		NestedInnerClass.EmpCounter.display2();
		// OR
		EmpCounter.display2();
	}

}
