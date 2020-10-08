package week3.day1;

public class Students {
	
	
	
	public void getStudentInfo(int id) {
		// TODO Auto-generated method stub
		
		System.out.println("ID is"+"   "+id);

	}
	
	
	
	public void getStudentInfo(int id ,String name) {
		
		// TODO Auto-generated method stub
		
		System.out.println("ID  is" +"  "+id+"   "+"name is"+"    "+name);

	}
	
	
	
    public void getStudentInformation(String email,long phonenumberl) {
		// TODO Auto-generated method stub
    	
    	System.out.println("Email id is"+" "+email+"  "+"mobile number is"+"   "+phonenumberl);

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students stud = new Students();
		
		stud.getStudentInfo(57);
		stud.getStudentInfo(57, "nahul");
		stud.getStudentInformation("nahulram@gmail.com", 9488085958l);
		

	}

}
