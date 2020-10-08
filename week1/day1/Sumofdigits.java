package week1.day1;

public class Sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 123;
		int r ;
		int sum=0;
	
		while (i>0) {
			r= i % 10;	
			sum=sum +r;
			i= i/10;
	
		}
System.out.println("The output is");
		System.out.println(sum);

}

}