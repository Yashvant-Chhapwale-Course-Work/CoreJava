package superKeyword;

class A {

	int i = 10;

	public void meth() {
		System.out.println("I am a Parent Class Method .");

	}

	public A() {
		System.out.println("I am a Parent Class Constructor.");
	}
}

public class Super extends A {

	int i = 20;

	@Override
	public void meth() {
		super.meth(); // Super keyword used for accesing Parent Class Method.
	}

	public void show(int i) {
		System.out.println(super.i); // Super keyword used for accesing Parent Class Variable.
		System.out.println(this.i); // This keyword used for accesing Current Class variable.
		System.out.println(i);
	}

	Super() {
		super(); // Super keyword used for invoking Parent Class Constructor.
	}

	public static void main(String[] args) {
		Super s = new Super();// Constructor accessed.
		s.meth(); // Method accessed.
		s.show(30); // Variable accessed through method.
	}

}
