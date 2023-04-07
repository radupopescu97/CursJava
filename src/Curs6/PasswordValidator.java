package Curs6;

import java.util.Scanner;

/*
 * Facem un program care valideaza o parola pe baza unor reguli :
 * Regulile:
 * 1. Parola trebuie sa contina cel putin 10 caractere
 * 2. parola trebuie sa contina o litera upper case
 * 3. Parola nu trebuie sa fie la fel ca username
 * 
 * intrebam userul username si parola
 * informam userul care sunt regulile parolei
 * 
 * validam parola
 * daca parola respecta regulile printam : Parola valida
 * 
 * spargem programul in cat mai multe metode
 * folosim un do-while pt logica de validare
 * 
 * metode -> intrebam username si parola
 * metoda -> printam regulile
 * metoda -> validam parola
 * 
 */





public class PasswordValidator {
	
	String username;
	//String password;
	boolean valid;
	Scanner scan = new Scanner(System.in);

	public void printPasswordRules() {
		
		System.out.println("Reguli parola:");
		System.out.println("Parola trebuie sa contina cel putin 10 caractere");
		System.out.println("Parola trebuie sa contina o litera upper case");
		System.out.println("Parola nu trebuie sa fie la fel ca username");
	}
	
	public void askCredentials() {
		
		System.out.println("Te rog introdu un username:");
		username = scan.next();
		
	}
	
	public String getPassword() {
		System.out.println("Te rog sa introduci o parola:");
		String password = scan.next();	
		return password;
	}
	
	public void checkPasswordRules(String password) {
		valid = true;
		
		
		if(password.length() < 10) {
			valid = false;
			System.out.println("Parola trebuie sa contina cel putin 10 caractere");
		}
		if(password.equals(password.toLowerCase())) {
			valid = false;
			System.out.println("Parola trebuie sa contina o litera upper case!");
		}
		if(password.equals(username)) {
			valid = false;
			
			System.out.println("Parola nu trebuie sa fie la fel ca username!");
			
		}
	}
	
	
	
	public static void main(String[] args) {

		PasswordValidator obj = new PasswordValidator();
		obj.printPasswordRules();
		obj.askCredentials();
		
		do {
			obj.checkPasswordRules(obj.getPassword());
		}while(!obj.valid);
		
		System.out.println("Parola valida!");
		
	}

}
