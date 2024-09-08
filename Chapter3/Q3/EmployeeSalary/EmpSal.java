package EmployeeSalary;

class Accounts {
	int CalSal(int sal) { //Method Overloading
		return 0;
	}

	int CalSal(int sal , int bonus) { //Method Overloading
		return 0;
	}

	int CalSal(int sal , int bonus , int tax) { //Method Overloading
		return 0;
	}

}

public class EmpSal extends Accounts {

	@Override
	int CalSal(int sal) { //Method Overriding
		return sal;
	}
	
	@Override
	int CalSal(int sal, int bonus) { //Method Overriding
		return CalSal(sal + bonus); 
	}
	
	@Override
	int CalSal(int sal, int bonus, int tax) { //Method Overriding
		return CalSal(sal + bonus - tax);
	}

	public static void main(String[] args) {
      EmpSal e = new EmpSal();
      System.out.println("Salary is:" + e.CalSal(15000));
      System.out.println("Salary is:" + e.CalSal(15000, 2500));
      System.out.println("Salary is:" + e.CalSal(150000, 25000, 1200));
	}

}
