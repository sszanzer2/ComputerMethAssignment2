package ss;

public class Subtractor {
	private int num1;
	private int num2;
	private int difference;
	
	public Subtractor(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
		
	}
	
	public int subtract(int num1, int num2) {
		difference = num1 - num2;
		return difference;
	}

}
