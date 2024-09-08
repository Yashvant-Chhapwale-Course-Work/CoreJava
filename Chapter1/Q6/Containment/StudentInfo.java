package Containment;

public class StudentInfo {
	String name; // Containment
	int id; // Containment
	String sports; // Aggregation
	String hobbies;// Aggregation

	public StudentInfo(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public StudentInfo(String name, int id, String sports, String hobbies) {
		this.name = name;
		this.id = id;
		this.sports = sports;
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "StudentInfo [Name=" + name + ", ID=" + id + ", Sports=" + sports + ", Hobbies=" + hobbies + "]";
	}

	public static void main(String[] args) {
		StudentInfo i = new StudentInfo("Yashvant", 01);
		System.out.println(i);
		
		StudentInfo i2 = new StudentInfo("Yash", 02, "Cricket", "Painting");
		System.out.println(i2);
	}
}
