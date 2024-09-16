package Q11;
import java.lang.reflect.*;

class EmpInfo{
	private String name;
	private int id;
	private double salary;
	
	public EmpInfo(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public String getName() {
		System.out.println("Employee Name: " + name);
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		System.out.println("Employee ID: " + id);
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		System.out.println("Employee Salary: " + salary);
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}	
}

public class Reflection {

	public static void main(String[] args) {
		try {
			//Load and Print Class Name:
			Class<EmpInfo> emp = EmpInfo.class;
			System.out.println("Class Name: " + emp.getName());
			
			//Load and Print Constructors:
			@SuppressWarnings("unchecked")
			Constructor<EmpInfo>[] constructors = (Constructor<EmpInfo>[]) emp.getConstructors();
			System.out.print("Constructors:");
			for(Constructor<EmpInfo> c : constructors) {
				System.out.println(" " + c);
			}
			
			//Load and Print Fields:
			Field[] fields = emp.getDeclaredFields();
			System.out.println("Fields:");
			for(Field f : fields) {
				System.out.println(" " + f);
			}
			
			//Load and Print Methods:
			Method[] methods = emp.getDeclaredMethods();
			System.out.println("Methods:");
			for(Method m : methods) {
				System.out.println(" " + m);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
