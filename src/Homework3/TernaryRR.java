package Homework3;

public class TernaryRR {

	public static void main(String[] args) {

		int comision;
		int vanzari = 3500;
		comision = (vanzari>2500) ? vanzari*5/100:0;
		
		System.out.println("Comisionul tau este :" + comision);
		
		
		//am scris si metoda din exercitiu sa o am in fata mea
		
		if(vanzari>2500) {
			
			System.out.println("Comisionul tau este :" + vanzari*5/100);
		
		}else {
			
			System.out.println("Comisionul tau este: 0");
		}
		
		
		
		
		
	}

}
