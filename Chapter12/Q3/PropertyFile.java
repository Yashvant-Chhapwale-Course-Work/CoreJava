package Q3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyFile {

	public static void main(String[] args) throws IOException {
		// Create A New Properties Object
		Properties p = new Properties();

		// Add Key-Value Pairs To The Properties Object
		p.setProperty("Username", "admin2003");
		p.setProperty("Password", "2003");

		// Save Properties To A File
		try (FileOutputStream o = new FileOutputStream("dataConfig.properties")) {
			p.store(o, "User Credentials");
			System.out.println("Properties File Created!!");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Load Properties From A File
		try (FileInputStream i = new FileInputStream("dataConfig.properties")) {
			p.load(i);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		// Access The Properties Using Keys
		String Username = p.getProperty("Username");
		String Password = p.getProperty("Password");
		
		//Display The Property Values
		System.out.println("Username: " + Username);
		System.out.println("Password: " + Password);

	}

}
