package Homework4;

public class FibonacciWhile {

	public static void main(String[] args) {

	int i = 1;
	int nr = 9;
	int primul = 0;
	int doi = 1;
	
	System.out.println("Seria Fibonacci pt " + nr + " numere este:");
	
	
	while (i<=nr) {
		
		System.out.println(primul + ", ");
		
		int nrUrmator = primul + doi;
		primul = doi;
		doi = nrUrmator;
		
		i++;
		
	}
	
	
	
	
	
	
	
	
		
	}

}
