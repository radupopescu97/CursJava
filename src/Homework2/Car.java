package Homework2;

public class Car {

 static String brand;
 static String type = "Suv";
 static String engine;


public Car(String brand, String engine) {
	
	Car.brand = brand;
	Car.engine = engine;
	
	
}



 static String carDetails() {
	
	return "All " + brand + " cars are " + engine +" and are of type " + type;
	
	
}


}
