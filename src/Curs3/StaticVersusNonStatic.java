package Curs3;

public class StaticVersusNonStatic {

	public static String nume;
	public static String departament = "QA";
	
	public static void main(String[] args) {

		System.out.println(nume);
		System.out.println(departament);
		System.out.println("-------------------");
	
		StaticVersusNonStatic person = new StaticVersusNonStatic();
		person.nume = "Johnny";
		System.out.println(person.nume + departament);
	
		System.out.println("-------------------");
		
		StaticVersusNonStatic person2 = new StaticVersusNonStatic();
		person2.nume = "Ioana";
		System.out.println(person2.nume + departament);
		
System.out.println("-------------------");
		
		departament = "DEV";
		StaticVersusNonStatic person3 = new StaticVersusNonStatic();
		person3.nume = "Trei";
		System.out.println(person3.nume + departament);
		
		
		System.out.println("-------------------");
		System.out.println("-------------------");
		System.out.println("-------------------");

		System.out.println(person.nume + departament);
	}

}
