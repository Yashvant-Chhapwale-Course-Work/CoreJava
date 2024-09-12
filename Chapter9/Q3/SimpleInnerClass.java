package Q3;

public class SimpleInnerClass {
	private int empCount = 50;
	
	class EmpCounter{                    //Simple Inner Class
		public void displayEmpCount() {
			System.out.println("Total Number Of Employees:: " + empCount);
		}
	}

	public static void main(String[] args) {
		
		SimpleInnerClass s = new SimpleInnerClass(); //Creating Outer Class Reference
		SimpleInnerClass.EmpCounter e = s.new EmpCounter(); //Creating Inner Class Reference using Outer Class Reference
		e.displayEmpCount();//Giving Call To Inner Class Method!
	}

}
