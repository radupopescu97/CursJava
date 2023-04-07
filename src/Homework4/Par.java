package Homework4;

import java.util.Scanner;

public class Par {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Introduceti capetele intervalului de la nr mic la mare");
		int mic = scan.nextInt();
		int mare = scan.nextInt();
		
		for(int i = mic; i<=mare; i++) {
			
			if(i%2==0) {
				System.out.println(i + " ");
			}
			
		}
		
	}

}
