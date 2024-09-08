package School;

public class Teach {
	static String Principal = "Jennifer Lawrence"; // Static Variable Declared
	String Teacher; // Global Variable Declared
	String Section; // Global Variable Declared

	public void setTeachInfo(String name, String div) { // Local Variable Declared
		this.Teacher = name;
		this.Section = div;
	}

	public void getTeachInfo() {
		
		System.out.println(" ::Displaying Teacher Details:: ");
		System.out.println("Principal Name: " + Teach.Principal);
		System.out.println("Teacher Name: " + this.Teacher);
		System.out.println("Section: " + this.Section);
	}

	public static void main(String[] args) {
        Teach t = new Teach();
        t.setTeachInfo("Margot Robbie", "10th");//Local Variables Accessed
        System.out.println("Principal :" + Teach.Principal);//Static Variables Accessed
        System.out.println("Teacher :" + t.Teacher);//Global Variables Accessed
        System.out.println("Section Assigned :" + t.Section);//Global Variables Accessed
        t.getTeachInfo();
        
	}
}
