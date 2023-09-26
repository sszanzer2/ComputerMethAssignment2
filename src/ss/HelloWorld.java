package ss;

import java.util.*;

public class HelloWorld {

	public static void main(String[] args) {
		
		boolean cont= true;
		Scanner keyboard = new Scanner(System.in);
		
		do {
		try {	
		
		System.out.println("Enter 2 numbers you would like to know the sum of.");
		
		System.out.println("Please enter the 1st number: ");
		int firstNum = keyboard.nextInt();
		System.out.println("Please enter the 2nd number: ");
		int secondNum= keyboard.nextInt();
		keyboard.nextLine();
		
		Calculator calc = new Calculator(firstNum, secondNum);
		
		System.out.println("Would you like to add or subtract the numbers? Type 'add' for add or 'sub' for subtract.");
		String response= keyboard.nextLine().toLowerCase();
		
		 if (response.equals("add"))
			 System.out.println("The sum of your two numbers is: " + calc.add(firstNum, secondNum));
		 else if( response.equals("sub"))
			 System.out.println("The difference of the two numbers is: " + calc.subtract(firstNum, secondNum));
		 
		
		System.out.println("Would you like to calculate other numbers? If yes type Yes if no type No: ");
		String answer = keyboard.nextLine().toUpperCase();
		
		if(answer.equals("NO"))
			cont= false;
		}catch(InputMismatchException i) {
			System.out.println("Incorrect input type. Please try running the program again.");
		}
		
	} while(cont);

	}
}	
