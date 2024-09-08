package userDefinedException;

import java.util.Scanner;

//@SuppressWarnings(value = { "all" })
//class MyException extends Exception {
//	public MyException() {
//		System.out.println(" Error! I am an User Defined Exception!");
//	}
//}

@SuppressWarnings(value = { "all" })
class UserException extends Exception { // UserException created.
	public UserException() {
		System.out.println("Denominator Cannot Be Zero!");
	}
}

public class ExceptionMain {
	public void division() throws UserException { // Method division throws UserException.
		System.out.println("Enter Numerator and Denominator:");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Numerator:");
			int m = sc.nextInt();
			System.out.println("Denominator:");
			int n = sc.nextInt();

			if (n <= 0) {
				throw new UserException();
			} else {
				int q = m / n;
				System.out.println("Quotient: " + q);

				int r = m % n;
				System.out.println("Remainder: " + r);
			}
		}
	}

	public static void main(String[] args) {
//		try {
//			throw new MyException();
//
//		} catch (MyException ex) {
//			System.out.println("Exception Caught!");
//
//		}

		try {
			ExceptionMain e = new ExceptionMain();
			e.division();
		} catch (UserException u) { // Catches UserException thrown by the method division.

		}
	}
}
