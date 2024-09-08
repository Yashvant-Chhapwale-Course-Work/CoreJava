package Package1;

public class Access1 {
	int a = 10;
	public int b = 20;
	private int c = 30;
	protected int d = 40;

	public static void main(String[] args) {
		Access1 a1 = new Access1();
		System.out.println(a1.a);// Default Variable
		System.out.println(a1.b);// Public Variable
		System.out.println(a1.c);// Private Variable
		System.out.println(a1.d);// Protected Variable
	}

}
