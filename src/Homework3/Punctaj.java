package Homework3;

import java.util.Scanner;

public class Punctaj {

	int punctaj;
	
	public void askTheScore() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the score :");
		punctaj = scan.nextInt();	
		
		
		
	}
	
	public void calculateScore() {
		
	askTheScore();
	
	 String y = (punctaj > 90 || punctaj == 90) ? "Ai primit: Foarte Bine" : (punctaj < 90 && punctaj > 80 || punctaj == 80) ? "Ai primit: Bine" : (punctaj < 80 && punctaj > 0 || punctaj == 0) ? "Ai primit: Suficient" : "Te rog introdu o valoare valida";
		
		System.out.println(y);
		
	}
	
	
	
	
	
	
}
