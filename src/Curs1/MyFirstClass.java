package Curs1;
//--one line comment
	// MyFirstClass ==> CamelCase (UpperCamelCase) --Conventie pt numele claselor
	// metodaMeaJava ==> LowerCamelCase --> pt numele metodelor sau variabile
	// pentru pachete folosim doar litere mici
	//com.google.numeaplicatie.orice
	
	
	//My_First_Class --> conventie python (snake case)
	
	/*multi
	 * line
	 * comment
	 */
public class MyFirstClass {

	String nume = "Oana"; // variabila de instanta
	int age = 22;
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyFirstClass obj = new MyFirstClass(); //instantierea clasei
		
		String prenume = "Ion"; //variabila locala
		
		System.out.println(prenume);
		
		System.out.println(obj.nume);
		
		System.out.println(obj.age);
	}

}
