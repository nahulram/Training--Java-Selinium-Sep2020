package week1.day1.assingments;

public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int original=153;
		int input =153;
		int reminder;
		int calculated=0;
		
		while (input>0) {
			
			reminder=input%10;
			input = input/10;
			
			calculated= calculated + (reminder*reminder*reminder);	
			
		}
		if(original==calculated) {
			System.out.println("The armstrong number");
		
		}
		else {
			System.out.println("Not an armstrong number");
		}

	}

}
