package week3.assingnments;

public class CharOcuurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "welcome to chennai";
		
		int count=0;
		
		char[] nn = str.toCharArray();
		
		//System.out.println(nn.length);
		
		
		for(int i=0;i<nn.length;i++ ) {
			
			if(nn[1]==nn[i]) {
				
				count++;
			}
			
		}
		System.out.println("The number of occurance of e is"+" "+count);

	}

}
