package Q5;

public class Replace {

	public static void main(String[] args) {
		String s1 = "Hello User! Welcome To Freaky's!";
		String sNew = s1.replace("Freaky's!", "Freaky's Github!"); //The replace() method returns a new string,replacing all the characters to a new character in the Old String.
		
		System.out.println("::Before::");
		System.out.println(s1);
		System.out.println("::After::");
		System.out.println(sNew);

	}

}
