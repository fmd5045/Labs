//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package week01;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		
			int availablePlaneSeats = 10;
		
		// 2. Create a variable to hold the cost of groceries at checkout
			double costOfGroceries = 34.99;
		
		// 3. Create a variable to hold a person's middle initial
			char middleInitial = 'M';
	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
			boolean itsHotOutside = true;
		
		// 5. Create a variable to hold a customer's first name
			String customersFirstName = "Donald";
		
		// 6. Create a variable to hold a street address
			String streetAddress = "225 ABC St." ;

		// 7. Print all variables to the console
			System.out.println(availablePlaneSeats);
			System.out.println(costOfGroceries);
			System.out.println(middleInitial);
			System.out.println(itsHotOutside);
			System.out.println(customersFirstName);
			System.out.println(streetAddress);

		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
			availablePlaneSeats -= 2;

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		 	costOfGroceries += 2.15;


		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		 	middleInitial = 'B';

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
		 	itsHotOutside = false;

		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		 	String customersFullName = customersFirstName +" "+ middleInitial +" "+ "Smith";

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
		 	System.out.println("Hello my name is "+ customersFullName+ ", I currently live at "+ streetAddress);
		
	}
}
