package Q3;

import java.util.Scanner;

public class Concat {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			String s1 = "Hello! My name is ";
			String s2 = " and I am really excited to meet you. I work as ";
			String s3 = " and have a passion for ";
			String s4 = " . Outside of work, I love ";
			String s5 = " and am always looking for new experiences. I would love to hear more about what you do and what you are interested in. It is great to connect with new people and share stories!";

			System.out.println("Enter Your Name:");
			String name = sc.nextLine();
			System.out.println("Enter Your Profession:");
			String job = sc.nextLine();
			System.out.println("Enter Your Work-Oriented Hobby:");
			String hobby = sc.nextLine();
			System.out.println("Enter Another Hobby:");
			String hobby2 = sc.nextLine();

			System.out.println("::Generating Introductory Speech::");
			String res = s1.concat(name).concat(s2).concat(job).concat(s3).concat(hobby).concat(s4).concat(hobby2) //The concat() method combines specific String at the end of another String and returns a combined String.
					.concat(s5);
			System.out.println(res);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
