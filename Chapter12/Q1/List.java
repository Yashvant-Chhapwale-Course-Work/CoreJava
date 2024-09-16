package Q1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class List {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			//Vector
			Vector<String> v = new Vector<String>();
			v.add("Apple");       //Add Element
			v.add("Banana");
			v.add("Orange");
			v.add("Peach");
			
			v.set(1, "Mango");    //Update Element
			
			v.remove(2);          //Delete Element
			
			System.out.println("::Search For Your Fruit Here::");         //Search For An Element
			String search = sc.nextLine();
			if(v.contains(search)) { //The contains() Function Returns A Boolean Value For Whether An Element Is Present In The Collection. 
				System.out.println("Element Found at Index " + v.indexOf(search)); //The indexOf() Function Returns Index Of The Element.
			}else {
				System.out.println("Element Not Found :/");
			}
			
			
			//ArrayList
			LinkedList<String> a = new LinkedList<String>();
			a.add("Ajay");        //Add Element
			a.add("Maxwell");
			a.add("Rodriguez");
			a.add("Estella");
			
			a.set(1, "Andrew");   //Update Element
			
			a.remove(2);          //Delete Element
			
			System.out.println("::Search For Employee Here::");         //Search For An Element
			String searchArray = sc.nextLine();
			if(a.contains(searchArray)) { //The contains() Function Returns A Boolean Value For Whether An Element Is Present In The Collection. 
				System.out.println("Element Found at Index " + a.indexOf(searchArray)); //The indexOf() Function Returns Index Of The Element.
			}else {
				System.out.println("Element Not Found :/");
			}
			
			
			//LinkedList
			ArrayList<String> l = new ArrayList<String>();
			l.add("Software Developer");        //Add Element
			l.add("Economy");
			l.add("HR");
			l.add("R&D");
		
			l.set(1, "Finance");   //Update Element
		
			l.remove(2);          //Delete Element
			
			System.out.println("::Search For Department Here::");         //Search For An Element
			String searchList = sc.nextLine();
			if(l.contains(searchList)) { //The contains() Function Returns A Boolean Value For Whether An Element Is Present In The Collection. 
				System.out.println("Element Found at Index " + l.indexOf(searchList)); //The indexOf() Function Returns Index Of The Element.
			}else {
				System.out.println("Element Not Found :/");
			}
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
