package exceptionPropagation;

import java.util.Scanner;

class Exception1 {
	public void E1() throws Exception{
		int[] arr = new int [6];
		@SuppressWarnings(value = {"all"})
		 Scanner sc = new Scanner(System.in);
	     System.out.println("::Enter Array Index and Value::");
		 System.out.println("Enter Array Index:");
		 int i = sc.nextInt();
		 System.out.println("Enter Value:");
		 int v = sc.nextInt();
		 
		 arr[i]=v;
		 System.out.println("Array Index " + i + "contains " + arr[i]);
	}
	
	public void E2( ) throws Exception{
		E1();
	}
	
	public void E3() {
		try{
			E2();
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}

public class ExceptionMain {
       public static void main(String[] args) {
		Exception1 e = new Exception1();
		e.E3();                           //Enter Array Index >6 to throw 'ArrayIndexOutOfBoundsException'
	}
}
