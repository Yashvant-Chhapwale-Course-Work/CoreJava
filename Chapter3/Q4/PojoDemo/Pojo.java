package PojoDemo;

public class Pojo {

	private String name;
	private int age;
	private String address;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		System.out.println("Name:" + name);
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		System.out.println("Age:" + age);
		return age;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		System.out.println("Address:" + address);
		return address;
	}

	@Override
	public String toString() {
		return "Pojo [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	public static void main(String[] args) {
		Pojo ob = new Pojo();
		ob.setName("Miles Morales");
		ob.setAge(18);
		ob.setAddress("New York");
		System.out.println(ob);
		ob.getName();
		ob.getAge();
		ob.getAddress();
		
	}
	
}
