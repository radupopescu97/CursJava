package Curs3;

import java.util.Scanner;

/*
 * Program care verifica un numar daca este par sau impar
 * Numarul il citim de la tastatura
 * Daca este par, atunci printam : "numarul este par"
 * Daca este impar, atunci printam: "numarul este impar" 
 * 
 */


public class ParSauImpar {

	public int number;
	
	public void askTheNumber() {
		System.out.println("Please enter a number :");
		
	Scanner scan = new Scanner(System.in);		

	number = scan.nextInt();
	
	}

public void checkNumber() {
	
// % -modulo	
// == operator de egalitate	
	if(number % 2 == 0) {
		System.out.println("Nr este par");
		
	}else {
		System.out.println("Nr este impar");
		
	}
	
}


}
