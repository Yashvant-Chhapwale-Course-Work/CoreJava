package getClass;

import java.lang.reflect.*;

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
	public String toString() { 
		return "Student [Name=" + name + ", ID=" + id + ", Fees=" + fees + ", Address=" + address + "]";
	}
}

public class GetClass  { 
	public static void main(String[] args) throws NoSuchFieldException,SecurityException {
		Student s1 = new Student("Yashvant",01,25000,"Bhayander");
		Class c1 = s1.getClass();              //Get Class Method returns the class type for instance 's1'.	 
		System.out.println(c1);
	
	}
}