package importAcessPackage;

import com.Hospital.Staff.Doctor; // Import Access < Package Access To All The Classes Within The Requesting Package. >

public class Main1 extends Doctor{

public void show(){
System.out.println("Doctors Salary:" + calculatesalary(2500000));//Direct Access
}

	public static void main(String[] args) {

		Main1 m = new Main1();
		System.out.println("Doctor Salary: " + m.calculatesalary(250000, 2500));
		m.show();
	}

}
