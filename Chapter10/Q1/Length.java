package Q1;

import java.util.Scanner;

public class Length {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter A String:");
			String userInput = sc.nextLine();
			int len = userInput.length();           //The length() method returns the length of a String.
			System.out.println("The Entered String is " + len + " characters long!");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
