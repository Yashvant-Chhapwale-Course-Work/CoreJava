package Q2;

import java.util.HashMap;
import java.util.Scanner;
public class Map {

	public static void main(String[] args) {
		//Map(HashMap)
		HashMap<String,Integer> empMap = new HashMap<String,Integer>();
		
		//Add Employees:
		empMap.put("Alice",25000);
		empMap.put("Brian",22000);
		empMap.put("Richard",19000);
		empMap.put("Abigail",25000);
		
		//Update Employees:
		empMap.put("Alice", 26000);
		
		//Delete Employees:
		empMap.remove("Brian");
		
		System.out.println("Employee-Salary Map: " + empMap);
		
		//Search For An Employee using Key:
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("::Search Employee Here::");
			String emp = sc.nextLine();
			if(empMap.containsKey(emp)) {
				System.out.println("Employee Records Found!");
				System.out.println("The Salary Of Requested Employee is:" + empMap.get(emp));
			}else {
				System.out.println("Employee Records Not Found :/");
			}
			}catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
