package Homework2;

public class TestCar {

	public static void main(String[] args) {

		Car obj = new Car("Opel", "Diesel");
		
		
		System.out.println(obj.carDetails());
		
	
Car obj2 = new Car("Audi", "Diesel");
	obj2.type = "sedan";	
		
		System.out.println(obj2.carDetails());
	
	
		
		
		System.out.println(obj.carDetails());
	
	
	}
	
	

}
