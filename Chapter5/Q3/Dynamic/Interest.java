package Dynamic;

class Bank {
	public float getRateOfInterest() {
		return 0;
	}
}

class SBI extends Bank {

	String bname = "SBI";

	@Override
	public float getRateOfInterest() {
		return 2.5f;
	}
}

class HDFC extends Bank {

	String bname = "HDFC";

	@Override
	public float getRateOfInterest() {
		return 1.5f;
	}
}

class Axis extends Bank {

	String bname = "Axis";

	@Override
	public float getRateOfInterest() {
		return 2f;
	}
}

public class Interest {

	public static void main(String[] args) {
		Bank b;
		b = new SBI();
		System.out.println("Rate Of Interest for " + new SBI().bname + ": " + b.getRateOfInterest());
		b = new HDFC();
		System.out.println("Rate Of Interest for " + new HDFC().bname + ": " + b.getRateOfInterest());
		b = new Axis();
		System.out.println("Rate Of Interest for " + new Axis().bname + ": " + b.getRateOfInterest());

	}

}
