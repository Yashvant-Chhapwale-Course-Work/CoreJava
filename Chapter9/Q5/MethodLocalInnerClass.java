package Q5;

import java.util.Scanner;

public class MethodLocalInnerClass {  

	void empCounter() {                                                 //Outer Class Method.
		class InnerClass {                                              //Method Local Inner Class/Local Inner Class.
			
			Scanner sc = new Scanner(System.in);

			private int getCount() {
				System.out.println("::Enter Number Of Employees::");
				System.out.println("Dept. 1:");
				int d1 = sc.nextInt();
				System.out.println("Dept. 2:");
				int d2 = sc.nextInt();
				System.out.println("Dept. 3:");
				int d3 = sc.nextInt();
				System.out.println("Dept. 4:");
				int d4 = sc.nextInt();
				return d1 + d2 + d3 + d4;
			}
			
			void displayEmpCount() {                                   //Local Inner Class Method.
			  int empCount = getCount();
              System.out.println("Total Number Of Employees:: " + empCount);
			}
		}
		InnerClass inner = new InnerClass();     //Creating Local Inner Class Reference To Access Local Inner Class Method.
		inner.displayEmpCount();
	}

	public static void main(String[] args) {
		MethodLocalInnerClass m = new MethodLocalInnerClass();
		m.empCounter(); //Calling Outer Class Method Which Calls Local Inner Class Method.
	}

}
