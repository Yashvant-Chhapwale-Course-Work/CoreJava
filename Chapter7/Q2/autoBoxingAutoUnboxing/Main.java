package autoBoxingAutoUnboxing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	int a = 10;
	double b = 20.5;

	@SuppressWarnings(value = "removal")
	Integer aa = new Integer(a); // Format when Boxing (Before Java5)
	Double bb = b; // AutoBoxing
	Integer cc = 40;

	int d = aa.intValue(); // Format when UnBoxing (Before Java5)
	double e = bb.doubleValue();
	int f = cc; // AutoUnboxing

	//Demo Of AutoBoxing N AutoUnboxing
	private List<Integer> li = new ArrayList<Integer>(); 
	public List<Integer> Set10List() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter 10 List Values:");

			for (int i = 0; i < 10; i++) {
				li.add(sc.nextInt());// AutoBoxing //li.add(new Integer(sc.nextInt()));//Format when Boxing (Before
									 // Java5)
			}
			
		return li;
		}
	}
	
	public void GetList() {
		System.out.print("Listing Values: [ " );
		for (int i = 0; i < 10; i++) {
			 System.out.print(li.get(i) + " ");// AutoUnboxing // System.out.println(li.get(i).intValue());//Format when Unboxing (Before
								 // Java5)
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		Main ob = new Main();
		System.out.println(ob.aa);
		System.out.println(ob.bb);
		System.out.println(ob.cc);
		System.out.println(ob.d);
		System.out.println(ob.e);
		System.out.println(ob.f);
		System.out.println(" ");
		System.out.println("::Live Demo of AutoBoxing and AutoUnboxing::");
		ob.Set10List();
		ob.GetList();

	}
}
