package ss;

import java.util.*;

public class HelloWorld {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter 2 numbers you would like to know the sum of.");
		
		System.out.println("Please enter the 1st number: ");
		int firstNum = keyboard.nextInt();
		System.out.println("Please enter the 2nd number: ");
		int secondNum= keyboard.nextInt();
		
		Adder sum = new Adder(firstNum, secondNum);
		
		System.out.println("The sum of your two numbers is: " + sum.add(firstNum, secondNum));
	}

}
