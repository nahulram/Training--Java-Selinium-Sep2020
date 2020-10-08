package week2.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int[] values=new int[5] ;
		
		  
		  values[0]=30; 
		  values[1]=20; 
		  values[2]=10; 
		  values[3]=40; 
		  values[4]=50;
		  Arrays.sort(values);
		  
		
		  for(int i=1 ; i<values.length;i++) {
		  
		  
		  System.out.println(values[i]);
		  
		  
		  }
		 
		  //System.out.println(values[2]);
		 
	

	
	
		/*
		 * int[]values= {10,20,30,40,50,60,70,80,90,100};
		 * 
		 * int arraySize=values.length; System.out.println(values[arraySize-2]);
		 */
	
	
	 

	}
	
	
}

