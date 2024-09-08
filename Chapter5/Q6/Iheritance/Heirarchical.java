package Iheritance;

class D {
	String show() {
		return "I am in class D.";
	}
}

class E extends D {

}

public class Heirarchical extends D {

	public static void main(String[] args) {

		E e = new E();
		System.out.println("Message from Class E : " + e.show());

		Heirarchical h = new Heirarchical();
		System.out.println("Message from Class Heirarchical : " + h.show());
	}

}
