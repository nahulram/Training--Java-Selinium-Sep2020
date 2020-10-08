package week1.day1;

public class Mobilevariables {
	
	long mobNumber = 9488085358L;
	String mobColour = "Red";
	double mobWeight = 17.52;
	boolean isRefurbished = true;

	
	private void mobNumber() {
		// TODO Auto-generated method stub
     
		int number = 20;
		System.out.println(number);
	}
	
	
	
	private void mobColour() {
		// TODO Auto-generated method stub

		char a = 'A';
		System.out.println(a);
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobilevariables myMobile = new Mobilevariables();
		
		//System.out.println(myMobile.mobNumber);
		long phone = myMobile.mobNumber;
		System.out.println(phone);
		String s = myMobile.mobColour;
		System.out.println(s);
		double v= myMobile.mobWeight;
		System.out.println(v);
		boolean m =myMobile.isRefurbished;
		System.out.println(m);
		myMobile.mobNumber();
		myMobile.mobColour();
		//System.out.println(myMobile.mobColour);
		//System.out.println(myMobile.mobWeight);
		//System.out.println(myMobile. isRefurbished);
	

	}

}








