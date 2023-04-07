package Homework4;

import java.util.Scanner;

public class ParWhile {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Introduceti capetele intervalului de la nr mic la mare");
		int mic = scan.nextInt();
		int mare = scan.nextInt();
		int i = mic;
		
		
		while(i<=mare) {
			
			if(i%2==0) {
				System.out.println(i + " ");
			}
			i++;
		}
		
		
		
		
	}

}
