package week1.day1.assingments;

public class SwitchOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=2;
		int b=3;
		String operations="add Operation";

		switch (operations) {
		case "add Operation": System.out.println("The output is"+" "+(a+b));
		break;
		case "sub Operation": System.out.println("The output is"+" "+(b-a));
		break;
		case "mul Operation": System.out.println("The output is"+" "+(a*b));
		break;
		case "div Operation": System.out.println("The output is"+" "+(b/a));
		break;
		
		default:System.out.println("To handle other operations");
		break;
		}
	}

}
