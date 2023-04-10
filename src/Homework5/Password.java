package Homework5;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		String user;
		String parola2 = "1234"; 
		String parola;
		String user2 = "TestUser";
		Scanner scan = new Scanner(System.in);
		
		 do {

		       System.out.println("Please enter the user and the password");
		        user = scan.next();
		       parola = scan.next();

		       System.out.println("Login error");
		       user = scan.next();
		       parola = scan.next();
		       System.out.println("Login error");
		       user = scan.next();
		       parola = scan.next();
		       System.out.println("Maximum attempts reached. User blocked");
		       parola = scan.next();
		     } while(!parola.equals(parola2) && !user.equals(user2));
		 
		 System.out.println("Login succesful");
	}

}
