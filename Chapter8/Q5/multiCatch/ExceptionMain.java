package multiCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Numerator:");
			int m = sc.nextInt();
			System.out.println("Denominator:");
			int n = sc.nextInt();

			int q = m / n;
			System.out.println("Quotient: " + q);

			int r = m % n;
			System.out.println("Remainder: " + r);

		}catch (ArithmeticException e1) {     //Specific Exception1     //MultiCatch
			System.out.println(e1);
		} catch (InputMismatchException e2) { //Specific Exception2 
			System.out.println(e2);
		} catch (Exception e3){               //General Exception
			System.out.println(e3);
		} finally {
			System.out.println("All Exceptions must be resolved!");
		}

	}
}
