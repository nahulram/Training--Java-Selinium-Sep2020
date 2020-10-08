package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] companies = {"HCL","Wipro","Aspiresystems","CTS"};
		
		
		List<String>values = new ArrayList<String>();
		
		for (String eachdata : companies) {
			
			values.add(eachdata);
			
		}
//System.out.println(values);

Collections.sort(values);
		
		for (String eachvalues : values) {
			
			System.out.println(eachvalues);
			
			
		}
	}

}
