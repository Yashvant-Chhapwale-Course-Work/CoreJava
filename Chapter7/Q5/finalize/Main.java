package finalize;

public class Main {

	String a = "Member";

	private void display() {
		System.out.println(a + "Accessed.");
	}

	@Override
	protected void finalize() throws Throwable {   //Overridden Finalize Method.
		System.out.println("Object Removed.");
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.display();
		m = null;
		System.gc();
	}
}
