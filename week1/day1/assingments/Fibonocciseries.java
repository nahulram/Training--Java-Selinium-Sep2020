package week1.day1.assingments;

public class Fibonocciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 8;
		int firstNum =0;
		int secNum =1;
		int sum;
		

		System.out.println("fibonocci numbers are");

		System.out.print(firstNum);

		System.out.print(","+secNum);
		
		
		for( input=3; input<=8;input++ ) {
		
			sum= firstNum + secNum;
			
			System.out.print(","+sum);
			
			firstNum=secNum;
			secNum=sum;
	
			
			
			 
		}

	}

}
