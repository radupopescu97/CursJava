package Homework2;

import java.util.Scanner;

public class Saptamana {


int zi;

public void askForDay () {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("What day is today?");
	zi = scan.nextInt();

}

public void showTheDay () {
	
	
if(zi == 0)	{
	System.out.println("Te rog sa introduci un numar mai mare ca 0");
}else if(zi == 1) {
	System.out.println("Astazi e luni");
}else if(zi == 2) {
	System.out.println("Astazi e marti");
}else if(zi == 3) {
	System.out.println("Astazi e miercuri");
}else if(zi == 4) {
	System.out.println("Astazi e joi");
}else if(zi == 5) {
	System.out.println("Astazi e vineri");
}else if(zi == 6) {
	System.out.println("Astazi e sambata");
}else if(zi == 7) {
	System.out.println("Astazi e duminica");
}else if(zi > 7) {
	System.out.println("Saptamana are doar 7 zile te rog sa introduci un nr valid");
}
	
	
	
	
}



}
