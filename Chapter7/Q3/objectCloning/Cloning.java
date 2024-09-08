package objectCloning;

class Clone implements Cloneable{                                //Implement Cloneable Interface
	
	String name;
	int age;
	
	Clone(String name,int age) {
	    this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return "AgeInfo [Name=" + name + ", Age=" + age + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException { //Override the clone method.
		return super.clone();
	}
}

public class Cloning {

	public static void main(String[] args) {
    try {
    	Clone c = new Clone("Cilian Murphy",47);
    	Clone c1 = (Clone) c.clone();                             //Call Clone Method //Do TypeCasting.
    	System.out.println(c1);                                   //Before Changing Info.
    	c1.age = 22;             
    	System.out.println(c1);                                   //Before Changing Info.
    } catch (CloneNotSupportedException e) {                      //Do Exception Handling.
		e.printStackTrace();
	}finally {
    	System.out.println("Have a nice day!");
    }
	}

}
