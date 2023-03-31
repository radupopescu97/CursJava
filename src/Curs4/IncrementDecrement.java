package Curs4;

public class IncrementDecrement {
public static void main(String[] args) {
	
	
	//increment
	//nr++ --> nr = nr + 1 --> nr += 1
	
	//nr++ --> Post increment
	//++nr --> pre increment
	
	
	//decrement
	//nr-- Post decrement
	//--nr Pre decrement
	
	System.out.println("---------post-------");
	int num = 10;
	System.out.println("Valoarea lui num inainte de increment :" +num);
	System.out.println("Valoarea lui num in post increment :" + num++); //dupa executie face increment
	System.out.println("Valoarea lui num dupa increment :" + num);

	System.out.println("---------pre-------");
	int num2 = 10;
	System.out.println("Valoarea lui num2 inainte de increment :" +num2);
	System.out.println("Valoarea lui num2 in pre increment :" + ++num2); //inainte de executie face increment
	System.out.println("Valoarea lui num2 dupa increment :" + num2);

	
	//decrement
	
	int num3 = 3;
	
	System.out.println(num3--); //post
	System.out.println(num3);
	
	System.out.println(--num3);  //pre
	
	
	
}
}
