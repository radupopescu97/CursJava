package Homework2;

import java.util.Scanner;

public class Punctaj {

	
int punctaj;
	
	
	public void askForScore () {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the score: ");
		punctaj = scan.nextInt();
	
	}
	
	public void compareTheScore () {
		
		if(punctaj >= 0 && punctaj <= 65) {
			
			System.out.println("Ai picat. Mai incearca");
		} else if(punctaj > 65){
			System.out.println("Felicitari, Ai trecut");
		} else {
			
			System.out.println("Numar invalid");
		}
		
		
		
		
	}
	
}
