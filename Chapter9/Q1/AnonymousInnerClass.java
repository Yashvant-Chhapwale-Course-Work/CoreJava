package Q1;

interface A {
	void meth1();
}

abstract class B {
	abstract void meth2();
}

class C {
	void meth3() {

	}
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		A a = new A() { // Anonymous Inner Class For An Interface.
			@Override
			public void meth1() {
				System.out.println("Hello User! I am Method-1 from Interface A!");
			}
		};
		a.meth1(); // Giving Call To Method From Anonymous Inner Class.

		B b = new B() { // Anonymous Inner Class For An Abstract Class.
			@Override
			public void meth2() {
				System.out.println("Hello User! I am Method-2 from Abstract-Class B!");
			}
		};
		b.meth2(); // Giving Call To Method From Anonymous Inner Class.

		C c = new C() { // Anonymous Inner Class For Any Simple Class.
			@Override
			public void meth3() {
				System.out.println("Hello User! I am Method-3 from Abstract-Class C!");
			}
		};
		c.meth3(); // Giving Call To Method From Anonymous Inner Class.

	}

}

//In this way ,Anonymous Inner Class helps us in providing implementations to Interfaces and Abstract Class without creating a separate Implementor class for the same purpose.