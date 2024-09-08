package tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {                   //Try Block
			System.out.println("Numerator:");
			int m = sc.nextInt();
			System.out.println("Denominator:");
			int n = sc.nextInt();

			int q = m / n;
			System.out.println("Quotient: " + q);

			int r = m % n;
			System.out.println("Remainder: " + r);

		} catch (ArithmeticException e1) {                             //Catch Block
			System.out.println(e1);
		} catch (InputMismatchException e2) {
			System.out.println(e2);
		} finally {                                                    //Finally Block               
			System.out.println("All Exceptions must be resolved!");      
		}

	}
}
