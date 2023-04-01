package Homework3;

import java.util.Scanner;

public class Factura {

	
	int factura;
	public void askTheUser() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the original sum :");
		factura = scan.nextInt();
	}

public void calculateDisc () {
	askTheUser();
	
	double y = (factura > 100) ? (factura - (0.1 * factura)) : (factura - (0.05 * factura));
	
	System.out.println("The Sum after the discount is " +y);
	
}
		
		
		
	

}
