package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String comapanies[] = {"TCS","Wipro","Infosys","FIS","TCS","Wipro"};
		
		Set<String> values = new LinkedHashSet<String>();
		
		for(String  eachData  : comapanies) {
			
			values.add(eachData);
			
			
		}
		for (String newvalues : values) {
			
			System.out.println(newvalues);
			
		}
		

	}

}
