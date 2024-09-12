package Q4;

import java.util.Scanner;

public class Trim {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Your Name:");
			String name = sc.nextLine();
			String s1 = "Hello ";
			String s2 = "! How Are You?";
			
			String res = s1.concat(name.trim()).concat(s2); //The trim() method removes the leading and trailing spaces from the input String.
			System.out.println(res);
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
