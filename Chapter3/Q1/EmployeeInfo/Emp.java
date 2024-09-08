package EmployeeInfo;

public class Emp {
	String ename = "Tom";
    int id = 00;
    static int sal = 20000;
    static String dept = "IT";
    
    public void getInfo(String ename,int id) {
    this.ename = ename;
    this.id = id;
	}
    
    public void displayInfo() {
    System.out.println("Displaying Employee Details");
    System.out.println("Employee Name:" + ename);
    System.out.println("Employee ID:" + id);
    System.out.println("Employee Salary:" + Emp.sal);
    System.out.println("Employee Department:" + Emp.dept);
	}
  
    static void displayStaticInfo() {
    	System.out.println("Displaying Department Details");
		System.out.println("Department Salary:" + sal);
		System.out.println("Department Name:" + dept);
	}

	public static void main(String[] args) {
     Emp e = new Emp();
    e.getInfo("Jim",01); 
    e.displayInfo();
    Emp.displayStaticInfo();
	}

}
