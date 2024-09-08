package toString;

class Teacher {
	String name;
	int id;
	long salary;
	String address;

	Teacher(String name, int id, long salary, String address) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.address = address;
	}

	@Override
	public String toString() { // Give String representation for Object of Class 'Teachers'.
		return "TeachersInfo [Name=" + name + ", ID=" + id + ", Salary=" + salary + ", Address=" + address + "]";
	}

}

class Student {
	String name;
	int id;
	long fees;
	String address;

	Student(String name, int id, long fees, String address) {
		this.name = name;
		this.id = id;
		this.fees = fees;
		this.address = address;
	}

	@Override
	public String toString() { // Give String representation for Object of Class 'Student'.
		return "Student [Name=" + name + ", ID=" + id + ", Fees=" + fees + ", Address=" + address + "]";
	}
}

public class ToString {

	public static void main(String[] args) {

		Teacher t = new Teacher("Robert Downey Jr.", 01, 15000, "New York");
		System.out.println(t);

		Student s = new Student("Tom Holland", 01, 20000, "London");
		System.out.println(s);
	}

}
