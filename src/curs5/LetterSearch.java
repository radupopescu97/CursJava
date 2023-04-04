package curs5;

/*
 * cerem un string de la tastatura
 * cautam in string ul respectiv daca contine litera A
 * daca o gasim, printam: "Litera A exista in text"
 * Daca nu o gasim, printam : "Litera A nu exista in text"
 * si mai printam si de cate ori apare
 */
import java.util.Scanner;

public class LetterSearch {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a text:");
		String text = scan.next();
		
		//masina --> masina.lenght()
		//012345
		int counter = 0;
		
		
		for(int i=0; i<text.length(); i++) {
		
		if(text.charAt(i) == 'A') {
			
			counter++;
		}
	}
		String result = counter>0 ? "Litera A a fost gasita de " + counter : "Litera A nu a fost gasita";
		System.out.println(result);
	}
}