package Curs2;

public class TestRectangle {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle();
		rectangle.setLenght(5);
		rectangle.setWidth(3);
		System.out.println(rectangle.calculateArea());
	
		Rectangle rectangle2 = new Rectangle(5, 5);
		System.out.println(rectangle.calculateArea());
		
	}

}
