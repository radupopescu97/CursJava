package Homework4;

import java.util.Scanner;

public class NrInversat {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Introduceti numarul");
		int numar = scan.nextInt();
		
		int invers = 0;
		
		while(numar!=0) {
			
		int rest = numar % 10;	
		invers = invers * 10 + rest;
		numar = numar/10;
		
			
		}
		
		System.out.println("Numarul inversat este :" + invers);
	}

}
