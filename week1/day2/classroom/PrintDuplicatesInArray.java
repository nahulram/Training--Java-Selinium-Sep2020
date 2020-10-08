package week1.day2.classroom;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		
		int arraysize=arr.length;
		
		int count=0;
		
		
		//System.out.println(arraysize);

		for(int i=0;i<arr.length-1;i++) {
			
			//System.out.println(i);
			
			for(int j=i+1; j<arr.length; j++ ) {
			
				//System.out.println(j);
				
				if(arr[i]==arr[j]) {
					
					//count=count+arr[i];
					
					System.out.println("Duplicate in array is"+"  "+arr[j]);
				}
				
			}
			
		}
		
		
		//System.out.println(count);
	}

}
