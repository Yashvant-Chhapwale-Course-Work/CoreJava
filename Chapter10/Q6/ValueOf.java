package Q6;

import java.util.Scanner;

public class ValueOf {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Employee Information:");
			System.out.println("Name:");
			String name = sc.nextLine();     //1.Taking String Inputs which  are immutable!

			System.out.println("Age:");
			String age = sc.nextLine();

			if (Integer.valueOf(age) <= 0) { //2.Using 'valueOf()' Function For Converting String Values To Integer and Double To Perform Operations.
				System.out.println("!!Age Cannot Be Zero Or Negative :/ !!");
			} else if (Integer.valueOf(age) < 18) {
				System.out.println("!!Underage Candidate Alert :/ !!");
			} else {
				System.out.println("Salary:");
				String salary = sc.nextLine();
				Double sal = Double.valueOf(salary);
				if (sal < 0) {
					System.out.println("!!Salary Cannot Be Negative :/ !!");
				} else {
					Double bonus = sal * 0.05;
					Double newSal = sal + bonus;
					System.out.println("Employee Name: " + name);
					System.out.println("Age: " + age);
					System.out.println("Calculated Bonus: " + String.valueOf(bonus));//3.Converting Operation Results To String Format Before Displaying Them To User.
					System.out.println("Incremented Salary: " + String.valueOf(newSal));
				}
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}

//The valueOf() Function is a static method that is used to convert a value from one type to another, typically from a string to a different data type or vice versa.
