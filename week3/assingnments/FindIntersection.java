package week3.assingnments;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>values =new ArrayList<String>();
	    
		
		values.add("3");
		values.add("2");
		values.add("11");
		values.add("4");
		values.add("6");
		values.add("7");
		
		/*
		 * for (String ss : values) {
		 * 
		 * System.out.println(ss);
		 * 
		 * }
		 */
		 
		  List<String>newValues=new ArrayList<String>(); 
		 
		  newValues.add("1"); 
		  newValues.add("2"); 
		  newValues.add("8");
		  newValues.add("4"); 
		  newValues.add("9");
		  newValues.add("7");
		  
		 
		  
		 newValues.retainAll(values);
		 
		 for (String vv : newValues) {
			 
			 System.out.println(vv);
			
		}
		
		 
		 
	}

}
