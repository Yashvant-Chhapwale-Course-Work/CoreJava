package abstractInterfaceDemo;

interface A {
	abstract void meth1();
}

abstract class B {
	public void meth2() {
		System.out.println("Meth 2 : I am a Non-Abstract method in an Abstract Class.");
	}

	public static void meth3() {
		System.out.println("Meth 3 : I am a Static method in an Abstract Class.");
	}

	abstract void meth4();
}

class General extends B implements A {

	@Override
	public void meth1() {
		System.out.println("Meth 1 : I am an Abstract method in an Interface.");
	}

	@Override
	void meth4() {
		System.out.println("Meth 4 : I am an Abstract method in an Abstrract Class.");

	}
}

public class Main {

	public static void main(String[] args) {
          General g = new General();
          g.meth1();
          g.meth2();
          General.meth3();
          g.meth4();
	}

}
