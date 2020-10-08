package week3.assingnments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * String test ="changeme";
		 * 
		 * //String vv = test.replaceAll("hnee", "HNEE");
		 * 
		 * System.out.println(test.replace("h", "H").replace("n", "N").replace("e",
		 * "E").replace("e", "E"));
		 * 
		 */
		
		String test= "changeme";
		
		int len = test.length();
		
		System.out.println(len);
		
		System.out.println("CHANGED VALUE");
		
		for(int i=0;i<len;i++ ) {
			
			char cha = test.charAt(i);
			
			if(i%2==0) {
				
				System.out.print(Character.toLowerCase(cha));
				
				
			}
			
			else {
				
				System.out.print(Character.toUpperCase(cha));
			}
			
		}
		
	

}

}