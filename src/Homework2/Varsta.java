package Homework2;

import java.util.Scanner;

public class Varsta {

	int varsta;
	
	
	public void askForAge () {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the age: ");
		varsta = scan.nextInt();
		

	}
	
	public void compareTheAge () {
		
		if(varsta>=0 && varsta < 18) {
			
			System.out.println("Esti minor");
	
		}else if(varsta > 65) {
		
			System.out.println("Esti batran");

		}else if(varsta >= 18 && varsta <= 65){
			System.out.println("Esti adult");

		}else {
			
			System.out.println("Nr. Invalid");
		}
		
		
		
		
	}
	
}
