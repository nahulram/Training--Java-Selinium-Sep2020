package week3.assingnments;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] companies = {"Google","Microsoft","TestLeaf","Maverick"};
		
		System.out.println(companies.length);
		
		
		
		List<String>values = new LinkedList<String>();

		for (String vv : companies) {
			  
			
			values.add(vv);
			
		}
		
		
		Collections.sort(values);
		
		for (String nw : values) {
			
			System.out.println(nw);
			
		}
		
		
		
	}
	


	}


