package Q2;

import java.util.Scanner;

public class ClassAsParameter {                                  //Outer Class.

	class EmpCount {                                             //Inner Class.
		Scanner sc = new Scanner(System.in);

		private int getEmpCount() {
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

		public void displayCount() {
			int res = getEmpCount();
			System.out.println("Total No. Of Employees: " + res);
		}

	}

	public void useCounter(EmpCount e) {                           //Method To Take Inner Class As A Parameter.
		e.displayCount();

	}

	public static void main(String[] args) {
		ClassAsParameter c = new ClassAsParameter();               //Creating Instance Of Outer Class.
		ClassAsParameter.EmpCount e = c.new EmpCount();            //Creating Instance Of Inner Class.
		c.useCounter(e);                                           //Using Outer Class Reference To Call The Method Which Uses Inner Class Reference As A Parameter.
	}

}
