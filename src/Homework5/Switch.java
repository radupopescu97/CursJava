package Homework5;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog sa introduci anul de vechime :");
		int vechime = scan.nextInt();
		System.out.println("Te rog sa introduci valoarea vanzarilor :");
		int vanzari = scan.nextInt();
		System.out.println("Te rog sa introduci luna in care s-au efectuat vanzarile:");
		int luna = scan.nextInt();
		
		
		switch (vechime) {
		
		case 1 :
			System.out.println("Bonusul este de 100");
		case 2:
			System.out.println("Bonusul este de 200");
		case 3:
			if(vanzari<=500) {
				System.out.println("Bonusul este 600");
				
			}else if(vanzari<=10000 && luna >= 1 && luna <=6) {
				System.out.println("Bonusul este 800");
			}else if(vanzari<=10000 && luna >= 7 && luna <=11) {
				System.out.println("Bonusul este 1000");
			}else if(vanzari<=10000 && luna == 12) {
				
				System.out.println("Bonusul este de 900. In Decembrie se vand singure!");
			}else if(vanzari>10000) {
				System.out.println("Bonusul este de 1200");
			}
		
		
		
		
		
		
		
		}
	}

}
