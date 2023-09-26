package ss;

public class Adder {
	private int num1;
	private int num2;
	private int sum;
	
	public Adder(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
		
	}
	
	public int add(int num1, int num2) {
		sum = num1+num2;
		return sum;
	}

}
