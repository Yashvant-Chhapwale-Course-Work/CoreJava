package Final;

final class A {
	final String a = "Initialized";

	final String meth() {
		return "Member " + this.a  ;
	}
}

//class B extends A{

// @Override
// String meth() {
// return "Method Overridden." ;
// }

//}

public class Final {

	public static void main(String[] args) {
      A ob=new A();
     // ob.a="Reinitialized";
      System.out.println(ob.meth());
	}

}
