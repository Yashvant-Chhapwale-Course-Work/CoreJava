package directAccessPackage;

public class Main2 extends com.Hospital.Staff.Doctor{ //Direct Access < Package Access To Specific Class Which Is Requesting For The Data. > 

public void show(){
System.out.println("Doctors Salary:" + calculatesalary(2500000));//Direct Access
}

	public static void main(String[] args) {

		Main2 m = new Main2();
		System.out.println("Doctor Salary: " + m.calculatesalary(250000, 2500));
		m.show();
	}

}

