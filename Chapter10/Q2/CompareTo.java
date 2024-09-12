package Q2;

import java.util.Scanner;

public class CompareTo {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter String-1:");
			String s1 = sc.nextLine();
			System.out.println("Enter String-2:");
			String s2 = sc.nextLine();
			int res = s1.compareTo(s2);   //The compareTo() method compares two Strings and returns 0 if both Strings are Equal 
			                              //or returns a Negative Value if the mismatched character in s1 comes before character in s2 on the Alphabetical Scale
			                              //or returns a Positive Value if the mismatched character in s1 comes after character in s2 on the Alphabetical Scale.
			if (res == 0) {
				System.out.println("Strings are Equal!");
				System.out.println("s1.compareTo(s2):" + res);
			} else {
				System.out.println("Strings are not Equal!");
				System.out.println("s1.compareTo(s2):" + res);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
