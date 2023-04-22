/*
 * Matthew Homan
 * CMIS 242 7382
 * April 20, 2023
 * Discussion Week 6 Task
 * 
 */

import java.util.Scanner;

public class DrinkRunner {

	public static void main(String[] args) {
		
		//Initialize attribute and get user input
		int userSelection;
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("\nWhat would you like to drink?\n");
		System.out.print("1. Coffee\n2. Cola\n\nPlease enter 1 or 2: ");
		userSelection = userInput.nextInt();
		System.out.println();
		
		//if statements to handle userSelection
		if (userSelection == 1) {

			//Create Coffee object and print 
			Coffee coffee = new Coffee("coffee");
			coffee.printCoffee();
			coffee.display();
			
		} else if (userSelection == 2) {
			
			//Create Cola object and print 
			Cola cola = new Cola("cola");
			cola.printCola();
			cola.display();
			
		}
		
		userInput.close();

	}

}
