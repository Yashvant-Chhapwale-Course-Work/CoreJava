package Iheritance;

class B {
	void show() {
		System.out.println("I am in Class B.");
	}
}

class C extends B {
//	void show() {
//		System.out.println("I am in Class C.");
//	}

	void Inherited() {
		super.show();
	}
}

public class MultiLevel extends C {

	public static void main(String[] args) {

		MultiLevel m = new MultiLevel();
		m.show();
		m.Inherited();

	}

}
