/*
* Name: Zaki G. Lindo
* Assignment: p001 - Splurth Elemental Symbols
* Course: CIS 301 - Theory of Computation
* Date: 09-15-2017
*/

import java.util.*;

// This program prompts the user to enter input of the form <element> <sy>
// The program then lets the user know if they have entered an acceptable
// Symbol <sy> given their element <element> name they've enter.

public class splurthElements {

	public static void main(String [] args) {
		String element = "";
		// Prompt the user to choose an element. Add spaces after for input.
		System.out.println("Welcome to Splurth, where you can create your own"
							+ " elements! What would you like your first"
							+ " element to be?\n");
		// Show the rules for entering user's element name and symbol
		System.out.println("(Please enter your element like this: elementname"
							+ " symbol)\n\n\n");
		Scanner sc = new Scanner(System.in);	// Initialize scanner to read
												// Terminal input
		element = sc.nextLine();				// Read user input for element
												// name and symbol

		// Split the user input into symbol and element name
		String symbol = element.substring(element.length() - 3, element.length());
		element = element.substring(0, element.length() - 3);

		// Verify the user knows what was typed. This also helps with testing
		// the code above.
		System.out.println("Your Element is: " + element + "\n\n"
							+ "Your Symbol is: " + symbol);
	}

}