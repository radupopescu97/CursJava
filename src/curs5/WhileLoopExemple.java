package curs5;

import java.util.Scanner;

/*
 * facem un program care calculeaza salariul pe o saptamana
 * intrebam user ul cate ore a lucrat
 * calculam doar daca nr de ore este intre 1 si 40
 * daca nr de ore este invalid il rugam sa mai introduca o data pana va introduce un nr valid
 * 
 */




public class WhileLoopExemple {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Cate ore ai lucrat saptamana aceasta ?");
		int oreLucrate = scan.nextInt();	
		int ratePerHour = 15;
		
		
		while(oreLucrate <1 || oreLucrate > 40) {
			System.out.println("Nr de ore invalid, te rog sa mai introduci o data:");
			oreLucrate = scan.nextInt();
		}
		System.out.println("Salariul de platit este :" + oreLucrate*ratePerHour);
	}

}
