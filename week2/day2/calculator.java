package week2.day2;

public class calculator {
	
	
	
	public int add() {
		// TODO Auto-generated method stub
		
		int a =1;
		int b =2;
		int result;
		
		result=a+b;
		
		return result;
		

	}
	
	
	
	public int subtract(int x,int y) {
		// TODO Auto-generated method stub
		
		return x-y;
		 
	}
	
	
	public double multiplication(double m ,double n) {
		// TODO Auto-generated method stub

		return m*n;
		
		
	}
	
	
	private void calculatortype(String name ,int model ) {
		// TODO Auto-generated method stub
		
		System.out.println( name+"    " + model+"      " +"calculator details");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The output is");
		calculator myAdd = new calculator();
		int add = myAdd.add(); 
		System.out.println(add);
		
		 int subtract = myAdd.subtract(50,30);
		 System.out.println(subtract);  
		double multiplication = myAdd.multiplication(23.54 , 12.50);
         System.out.println(multiplication);
		myAdd.calculatortype("zero", 424);
	}
	

}
