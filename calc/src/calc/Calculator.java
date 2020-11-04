package calc;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter first number : " );
		int firstNum = myObj.nextInt();
		
		System.out.println("Enter second number : " );
		int secondNum = myObj.nextInt();
		
		int answer = 0;
		
		System.out.println("Enter the kind of Operation you want to perform : \n Press 1 for addition \n Press 2 for subtraction \n Press 3 for Multiplication \n Press 4 for division" );
		Scanner myObj1 = new Scanner(System.in);
		String choice = myObj1.nextLine();
		
		switch(choice) {
		case "1": 
			answer = firstNum+secondNum;
			break;
		case "2": 
			answer = firstNum-secondNum;
			break;
		case "3":
			answer=firstNum*secondNum;
			break;
		case "4":answer=firstNum/secondNum;
		}
		System.out.println("The calculated value is : "+answer);
		}
}