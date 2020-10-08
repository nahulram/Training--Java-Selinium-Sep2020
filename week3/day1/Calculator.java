package week3.day1;

public class Calculator {
	
	
public void add(int a,int b) {
	// TODO Auto-generated method stub
	System.out.println(a+ +b );

}
	public void add(int c, int d , int  e ) {
		// TODO Auto-generated method stub
     System.out.println(c+  +d+   + e);
	}

	
	public void multiply(int f,int h) {
		// TODO Auto-generated method stub
System.out.println(f*h);
	}
	
	public void multiply(int m,double n) {
		// TODO Auto-generated method stub
System.out.println(m*n);
	}

	public void subtract(int x ,int y) {
		// TODO Auto-generated method stub
System.out.println(x- y);
	}
	
	
	public void subtract(double xx, double yy) {
		// TODO Auto-generated method stub
System.out.println(xx- yy);
	}
	
	
	public void divide(int mn ,int yb) {
		// TODO Auto-generated method stub
System.out.println(mn/yb);
	}
	
	
	public void divide(double mm) {
		// TODO Auto-generated method stub
System.out.println(mm);
	}

	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cc = new Calculator();
		
		cc.add(10, 20);
		cc.add(20, 20, 10);
		cc.multiply(10, 20);
		cc.multiply(10, 15.8);
		cc.subtract(30, 20);
		cc.subtract(20.5, 10.5);
		cc.divide(10, 5);
		cc.divide(15.5/2);
		

	}

}
