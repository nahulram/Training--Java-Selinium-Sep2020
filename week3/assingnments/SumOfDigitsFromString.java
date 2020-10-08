package week3.assingnments;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String text="Tes12Le79af65";
		int sum =0;
		String faf = text.replaceAll("T", "").replaceAll("e", "").replaceAll("s", "").replaceAll("L", "").replaceAll("e", "").replaceAll("a", "").replaceAll("f", "");
		
//System.out.println(faf);
   
		char[] vav = faf.toCharArray();
		
		//System.out.println(vav.length);
		
		
		  for (int i=0 ;i<vav.length;i++ ) {
		  
		  int cc = Character.getNumericValue(vav[i]);
		  
		//System.out.println(cc);
		  
		  
		 // System.out.println(vav[i]);
		  
		  
		  sum=sum+cc;
		  
		  
		  
		  
		 //System.out.println(sum);
		  
		  
		  }
		 
		System.out.println("The output is"+" "+sum);
	}

}
