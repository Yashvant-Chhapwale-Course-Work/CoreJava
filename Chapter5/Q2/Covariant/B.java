package Covariant;

class A {

	int a = 10;

	public A Object() { //Parent method with return type A
		return this;
	}

	public void message() {
		System.out.println("First Class Accessed");
	}

}

public class B extends A {

	int b = 20;

	@Override
	public B Object() { //Overriden method with return type B (Covariant return type)
		return this;
	}

	@Override
	public void message() {
		System.out.println("Second Class First Method Accessed");
	}

	public String display() {
		return "Second Class Second Method Accessed";
	}

	public static void main(String[] args) {

		System.out.println(new A().Object().a);
		new A().message();
		System.out.println(new B().Object().b);
		new B().message();
		System.out.println(new B().display());
		
		A ob = new A();
		ob.message();
		
		A ob2 = new B(); //Covariant Access using Upcasting
		ob2.message(); //Overriden method in CLass B
		
	}
}
