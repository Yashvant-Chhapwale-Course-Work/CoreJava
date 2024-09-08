package staticImport;

import java.util.Scanner;
import static java.lang.Math.*; //Static Importing Math Class (now the methods can be called directly without Class Name).

public class StaticImport {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a Number:");
			double n = sc.nextDouble();

			System.out.println("Enter a choice:");
			System.out.println("1.Square Root");
			System.out.println("2.Square");
			System.out.println("3.Cube");
			System.out.println("4.Cube Root");
			System.out.println("5.Round To");
			System.out.println("6.Natural Log");
			System.out.println("7.Common Log");
			System.out.println("8.Sine");
			System.out.println("9.Cosine");
			System.out.println("10.Tangent");

			int c = sc.nextInt();

			switch (c) { // Here methods from Math class will be used for multiple times, hence after
							// static import the methods will be called directly without using class name
							// which makes it more efficient.
			case 1:
				System.out.printf("Square Root:%.2f%n", sqrt(n));
				break;

			case 2:
				System.out.printf("Square:%.2f%n", pow(n, 2));
				break;

			case 3:
				System.out.printf("Square:%.2f%n", pow(n, 3));
				break;
				
			case 4:
				System.out.printf("Cube Root:%.2f%n",cbrt(n));
				break;
				
			case 5:
				System.out.printf( n + "Rounded to %f%n",round(n));
				break;
				
			case 6:
				System.out.printf("Natural Log of " + n + " :%.2f%n",log(n));
				break;
				
			case 7:
				System.out.printf("Common Log of " + n + " :%.2f%n",log10(n));
				break;
				
			case 8:
				System.out.printf("Sin " + n + " :%.2f%n",sin(n));
				break;
				
			case 9:
				System.out.printf("Cos " + n + " :%.2f%n",cos(n));
				break;
				
			case 10:
				System.out.printf("Tan " + n + " :%.2f%n",tan(n));
				break;
			
			default:
				System.out.println("Choice not available!");
				break;
			}
		}
	}

}
