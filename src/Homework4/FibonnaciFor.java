package Homework4;

public class FibonnaciFor {

	public static void main(String[] args) {

		int nr = 9;
		int primul = 0;
		int doi = 1;
		
		System.out.println("Seria Fibonacci pt " + nr + " numere este:");
		for(int i=1; i<=nr; i++) {
			System.out.println(primul + ", ");
		int nrUrmator = primul + doi;
		primul = doi;
		doi = nrUrmator;

			
		}
		
		
		
	}

}
