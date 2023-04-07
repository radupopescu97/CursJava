package Homework4;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
	
		String y = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog adauga un cuvant :");
		String text = scan.next();
	  
		for (int i = text.length() - 1; i>=0; i--) {
			
			 y = y + text.charAt(i);}
			if(text.equalsIgnoreCase(y)) {
				System.out.println("Cuvantul este palindrom");
			}else {
				System.out.println("cuvantul nu este palindrom");
			}
				
		}
		
		
		
	}


