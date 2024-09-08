package Hospital;

interface Hospital { // CONTRACT
	abstract int calSal(int sal);

	abstract int calSal(int sal, int tax);

	abstract int calFees(int fees);

	abstract int calFees(int fees, int tax);
}

class Accounts implements Hospital { // IMPLEMENTER
	@Override
	public int calSal(int sal) {
		return sal;
	}

	@Override
	public int calSal(int sal, int tax) {
		return sal - tax;
	}

	@Override
	public int calFees(int fees) {
		return fees;
	}

	@Override
	public int calFees(int fees, int tax) {
		return fees + tax;
	}
}

class Doctors extends Accounts { // CONSUMER_1
	int id;
	String name;
	int age;
	int sal = 250000;
	int tax = 2500;

	public void setDoc(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		if (age < 40) {
			return "Doctors [ID=" + this.id + ", Name=" + this.name + ", Age=" + this.age + ", Salary=" + this.sal
					+ ", Tax=" + this.tax + "]";
		} else {
			return "Doctors [ID=" + this.id + ", Name=" + this.name + ", Age=" + this.age + ", Salary=" + this.sal
					+ "]";
		}
	}

	public void salInfo() {

		System.out.println(" ::Displaying Doctor Details:: ");
		System.out.println(this);
		if (age < 40) {
			System.out.println("Calculated Salary:" + calSal(this.sal, this.tax));
		} else {
			System.out.println("Calculated Salary:" + calSal(this.sal));
		}

	}
}

class Nurses extends Accounts { // CONSUMER_2
	int id;
	String name;
	int age;
	int sal = 25000;
	int tax = 250;

	public void setNurse(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		if (age < 40) {
			return "Nurses [ID=" + this.id + ", Name=" + this.name + ", Age=" + this.age + ", Salary=" + this.sal
					+ ", Tax=" + this.tax + "]";
		} else {
			return "Nurses [ID=" + this.id + ", Name=" + this.name + ", Age=" + this.age + ", Salary=" + this.sal + "]";
		}
	}

	public void salInfo() {

		System.out.println(" ::Displaying Nurse Details:: ");
		System.out.println(this);
		if (age < 40) {
			System.out.println("Calculated Salary:" + calSal(this.sal, this.tax));
		} else {
			System.out.println("Calculated Salary:" + calSal(this.sal));
		}

	}
}

class Patients extends Accounts { // CONSUMER_3
	int id;
	String name;
	int age;
	String disorder;
	int fees;
	int tax = 3200;

	public void setPat(int id, String name, int age, String disorder, int fees) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.disorder = disorder;
		this.fees = fees;
	}

	@Override
	public String toString() {
		if (age < 60) {
			return "Patients [ID=" + this.id + ", Name=" + this.name + ", Age=" + this.age + ", Disease Contracted="
					+ disorder + ", Fee=" + this.fees + ", Tax=" + this.tax + "]";
		} else {
			return "Patients [ID=" + this.id + ", Name=" + this.name + ", Age=" + this.age + ", Disease Contracted="
					+ disorder + ", Fee=" + this.fees + "]";
		}
	}

	public void feeInfo() {

		System.out.println(" ::Displaying Patient Details:: ");
		System.out.println(this);
		if (age < 60) {
			System.out.println("Total Bill:" + calFees(this.fees, this.tax));
		} else {
			System.out.println("Total Bill:" + calFees(this.fees));
		}

	}
}

public class Main {

	public static void main(String[] args) {

		Doctors d = new Doctors();
		d.setDoc(01, "Yashvant", 23);
		d.salInfo();
		d.setDoc(02, "Joseph", 44);
		d.salInfo();

		Nurses n = new Nurses();
		n.setNurse(01, "Jennifer", 32);
		n.salInfo();
		n.setNurse(02, "Margot", 28);
		n.salInfo();

		Patients p = new Patients();
		p.setPat(01, "Elizabeth", 96, "Heart Attack", 300000);
		p.feeInfo();
		p.setPat(02, "Technoblade", 23, "Metastatic Sarcoma", 225000);
		p.feeInfo();

	}

}
