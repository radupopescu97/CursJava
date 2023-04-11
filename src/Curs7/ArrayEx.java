package Curs7;

public class ArrayEx {

	public static void main(String[] args) {

		String[] textArray = new String[5];

		//	String[] textArray = {null, null, null, null, null}
		// index					0	 1		2	 3		4
		
		
		System.out.println(textArray[2]);
		textArray[0] = "This";
		//	String[] textArray = {"This", null, null, null, null}
		//	index					0		1	2		3	 4
		
		textArray[1] = " is";
		textArray[2] = " an";
		
	System.out.println(textArray[2]);
//	String[] textArray = {"This", is, an, null, null}
		//	index			0		1	2		3	 4
	
	textArray[3] = " array";
	textArray[4] = "!";
	
	try {
		System.out.println(textArray[5]);	
	}catch(ArrayIndexOutOfBoundsException obj) {
		System.out.println(obj.getMessage());
	}
	

	
	for(int i = 0; i < textArray.length; i++) {
		System.out.print(textArray[i]);
		
		System.out.println("------------");
		
		for(String obj : textArray) {
			
			System.out.println(obj);
		}
		
	}
	
	
	
	
	
	}

}
