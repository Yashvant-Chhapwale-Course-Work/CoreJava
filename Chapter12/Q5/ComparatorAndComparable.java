package Q5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ComparatorLogic implements Comparator<String> {          //Implementing Comparator Interface for 'String' Type
	public int compare(String s1, String s2) {                 //Overriding 'compare()' method to redefine comparison logic.
		if (s1.length() > s2.length()) {
			return 1;
		} else {
			return -1;
		}
	}

}

class Student implements Comparable<Student>{                  //Implementing Comparable Interface for 'Student' Type
	private String name;
	private int id;
	
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student InfoDex [Name=" + name + ", ID=" + id + "]";
	}

	public int compareTo(Student that) {                       //Overriding 'compareTo()' method to redefine comparison logic.
		if(this.id > that.id){
			return 1;
		}else {
			return -1;
		}
	}
	
}

public class ComparatorAndComparable {
	public static void main(String[] args) {
		//Comparison Using Comparator:
		List<String> li = new ArrayList<String>();
		li.add("Oppenheimer");
		li.add("Szilard");
		li.add("Seaborg");
		li.add("Fuchs");
		li.add("Lawrence");

		ComparatorLogic c1 = new ComparatorLogic();            //Create Instance Of Class With Overridden 'compare()' Method. 
		Collections.sort(li, c1);                              //Use Instance To Invoke Comparator With Overriden 'compare()' Method Logic For 'sort()' Method.
		
		System.out.println("Scientists In Ascending Order Of Length Of Their Names:");
		System.out.println(li);
		System.out.println("Fun Fact: Above Personnel are key figures involved in the Manhattan Project, the top-secret endeavor that developed the Atomic Bomb during World War II!");
		System.out.println(" ");
		
		//Comparison Using Comparable:
		List<Student> s = new ArrayList<Student>();            //Create Instance Of 'Student' Type Collection  Which Implements 'Comparable' Interface.
		s.add(new Student("Richard",22));
		s.add(new Student("Elena",25));
		s.add(new Student("Tyler",30));
		s.add(new Student("Betheny",24));
		s.add(new Student("Harris",26));
		
		Collections.sort(s);                                   //Invoke 'sort()' Method For 'Student' Type Collection.
		System.out.println("Students In Ascending Order Of Their IDs:");
		for(Student student:s) {
			System.out.println(student);
		}
		
	}
}
