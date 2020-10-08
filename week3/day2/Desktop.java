package week3.day2;

public class Desktop implements Software{
	
	
	private void desktopModel() {
		// TODO Auto-generated method stub
		
		System.out.println("model is dell");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Desktop desk = new Desktop();
		desk.desktopModel();
		desk.hardwareResources();
		desk.softwareResources();
		

	}

	
	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println("hardware");
		
	}

	
	public void softwareResources() {
		// TODO Auto-generated method stub
		System.out.println("software");
		
	}

}
