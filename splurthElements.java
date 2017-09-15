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
		// Prompt the user to choose an element. Add spaces after for input.
		System.out.println("Welcome to Splurth, where you can create your own"
							+ " elements! What would you like your first"
							+ " element to be?\n");
		// Show the rules for entering user's element name and symbol
		System.out.println("(Please enter your element and like this: elementname"
							+ "  sy (Symbol is only 2 letters!))"
							+ " both of these have 2 spaces in between them\n\n\n");
		String elandsymb = initializer();
		String [] split = splitter(elandsymb);
		String element = split[0];
		String symbol = split[1];

		// Verify the user knows what was typed. This also helps with testing
		// the code above.
		System.out.println("Your Element is: " + element + " " + element.length() + "\n\n"
							+ "Your Symbol is: " + symbol + " " + symbol.length());
	}

	// This method sends back the user input in the form of a string
	public static String initializer() {
		Scanner sc = new Scanner(System.in);	// Initialize scanner to read
												// Terminal input
		String elandsymb = sc.nextLine();				// Read user input for element
												// name and symbol

		// Keep user in input loop until the user enters a valid input
		while (elandsymb.length() < 5) {
			System.out.println("Please be sure to enter an element name "
								+ "that is longer than 1 character.");
			// Show the rules for entering user's element name and symbol
			System.out.println("(Please enter your element like this: elementname"
								+ "  sy (Element is at least 2 letters,"
								+ "followed by 2 spaces," 
								+ "followed by a Symbol that's only 2 letters!))\n\n\n");
			
			elandsymb = sc.nextLine();				// Read user input for element
													// name and symbol
		}
		return elandsymb;
	}

	public static String [] splitter(String elandsymb) {
		String element = "";
		int i = 0;
		while (elandsymb.charAt(i) != ' ') {
			element += elandsymb.charAt(i);
			i++;

			// If we go through all of the user input and don't see a space,
			// reinitialize
			if (i == elandsymb.length() - 2) {
				System.out.println("You've broken the rules of creation on Splurth!"
									+ "Now you've got to start all over!");
				elandsymb = initializer();
			}
		}

		// symbol = last two letters of user input
		String symbol = elandsymb.substring(elandsymb.length()-2, elandsymb.length());
		String [] split = {element, symbol};
		return split;
	}

}