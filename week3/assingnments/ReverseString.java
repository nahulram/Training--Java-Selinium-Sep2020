package week3.assingnments;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test ="feeling good";
		
		char[] te = test.toCharArray();
		
		//System.out.println(te.length);
		
		for(int i=te.length-1;i>0;i--) {
			
			
			System.out.print(te[i]);
		}
		
		

	}

}
