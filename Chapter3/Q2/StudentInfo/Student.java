package StudentInfo;

public class Student {
		String name;
		int id;
		long fees;
		String address;
		
		Student(String name,int id,long fees,String address) {
	           this.name=name;
	           this.id=id;
	           this.fees=fees;
	           this.address=address;
		}
		
		@Override
		public String toString() {
			return "Student [name=" + name + ", id=" + id + ", fees=" + fees + ", address=" + address + "]";
		}

	    public void dispayInfo() {
	    System.out.println("Displaying Student Information");
	    System.out.println("Name:" + name);     
	    System.out.println("ID:" + id);    
	    System.out.println("Fees:" + fees);    
	    System.out.println("Address:" +address);    
	    }



		public static void main(String[] args) {
			Student s = new Student("JIM",01,20000,"Borivali");
		    s.dispayInfo();
			System.out.println(s);
		}

	}

