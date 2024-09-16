package Q4;

import java.util.Vector;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Enumeration;

public class ObjectIteration {

	public static void main(String[] args) {
		// Vector: -------------------------------------------------------------------//
		Vector<String> v = new Vector<String>();
		v.add("Apple");
		v.add("Banana");
		v.add("Orange");
		v.add("Peach");

		// Iteration Using For-Each Loop:
		System.out.println("::Vector Iteration Using For-Each Loop::");
		for (String fruit : v) {
			System.out.println(fruit);
		}

		// Iteration Using Enumerator:
		System.out.println("::Vector Iteration Using Enumerator::");
		Enumeration<String> e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		// Array List: ----------------------------------------------------------------//
		ArrayList<String> a = new ArrayList<String>();
		a.add("Ajay");       
		a.add("Maxwell");
		a.add("Rodriguez");
		a.add("Estella");

		// Iteration Using For-Each Loop:
		System.out.println("::Array List Iteration Using For-Each Loop::");
		for (String fruit : a) {
			System.out.println(fruit);
		}

		// Iteration Using Iterator:
		System.out.println("::Array List Iteration Using Iterator::");
		Iterator<String> i = a.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		// Iteration Using List-Iterator:
		System.out.println("::Array List Iteration Using List Iterator::");
		ListIterator<String> li = a.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		
		// Linked List: ----------------------------------------------------------------//
		LinkedList<String> l = new LinkedList<String>();
		l.add("Software Developer");       
		l.add("Finance");
		l.add("HR");
		l.add("R&D");

		// Iteration Using For-Each Loop:
		System.out.println("::Linked List Iteration Using For-Each Loop::");
		for (String fruit : l) {
			System.out.println(fruit);
		}

		// Iteration Using Iterator:
		System.out.println("::Linked List Iteration Using Iterator::");
		Iterator<String> i2 = l.iterator();
		while (i2.hasNext()) {
			System.out.println(i2.next());
		}

		// Iteration Using List-Iterator:
		System.out.println("::Linked List Iteration Using List Iterator::");
		ListIterator<String> li2 = l.listIterator();
		while (li2.hasNext()) {
			System.out.println(li2.next());
		}
		
		// Map: ------------------------------------------------------------------------//
		HashMap<String,Integer> empMap = new HashMap<String,Integer>();
		empMap.put("Alice",25000);
		empMap.put("Brian",22000);
		empMap.put("Richard",19000);
		empMap.put("Abigail",25000);

		// Iteration Using For-Each Loop:
		System.out.println("::Map Iteration Using For-Each Loop::");
		for (Map.Entry<String,Integer> entry : empMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		// Iteration Using Iterator:
		System.out.println("::Map Iteration Using Iterator::");
		Iterator<Map.Entry<String,Integer>> i3 = empMap.entrySet().iterator();
		while (i3.hasNext()) {
			Map.Entry<String, Integer> entry = i3.next();
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

}
