package week1.day1;

public class Mobile {
	
	public void makeCall() {
		// TODO Auto-generated method stub

		System.out.println("call is connected");
		
	}
	
	
	public void sendMessage() {
		// TODO Auto-generated method stub

		System.out.println("message is received");
	}
	
	public static void main(String[] args) {
		
		
		
		System.out.println("inside main");
		
		Mobile myMobile = new Mobile();
		myMobile.takePhoto();
		myMobile.makeCall();
		myMobile.sendMessage();
		
		
		}
		
	
	
	private void takePhoto() {
		// TODO Auto-generated method stub
		
		System.out.println("photo is taken");

	}
	
	
	private void voice() {
		// TODO Auto-generated method stub
		
		System.out.println("voice is connected");

	}
	
	
	
	
	
	
	
	
	
	

}
