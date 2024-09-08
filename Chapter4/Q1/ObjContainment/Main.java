package ObjContainment;

class A {
	double pi = 3.14;
	public void display() {
		System.out.println("Hello Yashvant");
	}
}

class B{
	A ob = new A(); //Containment
	
}

public class Main {

	public static void main(String[] args) {
		B ob2 = new B();
		ob2.ob.display(); //Accessing class A object as a class B attribute.
        System.out.println("Value of Pi: " + ob2.ob.pi); //Accessing class A object as a class B attribute.
	}

}
