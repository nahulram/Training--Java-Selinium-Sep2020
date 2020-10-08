package week3.assingnments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text ="we learn java basics as part of java sessions in java week1 ";

        String[] splitword = text.split(" ");		
        	
		//System.out.println(splitword.length);
		
		  Set<String>values= new LinkedHashSet<String>();
		  
		 for (String ss : splitword) {
			 
			 values.add(ss);
			 
			 
		}
		 
		  for (String newvalues : values) {
			  
			  System.out.println(newvalues);
			
		}
		  
		  }
		 
		
		  
			  
			
		}
		
	
	
	


