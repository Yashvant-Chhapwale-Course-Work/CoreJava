package Iheritance;

class A {
	void show() {
		System.out.println("I am in Class A.");
	}
}

public class Simple extends A {

	public static void main(String[] args) {

		Simple s = new Simple();
		s.show();

	}

}
