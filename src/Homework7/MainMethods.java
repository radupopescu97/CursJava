package Homework7;

public class MainMethods {

	public static void main(String[] args) {

		
		Teacher Dragos = new Qualification("C#", 2, "Morning");
		Teacher Radu = new Qualification("Java", 13, "Afternoon");
		
		System.out.println("---------------------------------------");
		
		System.out.println("Dragos: ");
		Dragos.Verify();
		System.out.println("Radu: ");
		Radu.Verify();
		
		
		Teacher teacher_de_baza = new Teacher();
		System.out.println("teacher_de_baza: ");
		teacher_de_baza.Verify();	
		
		
	}

}
