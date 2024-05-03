package TicTacToeGame;
/* @author - ANIRUDH MARPALLY */

import java.util.Scanner;
public class CheckIntegerOccurance {
	/**
	 * This method takes the user input and does the calculation for the repetition of integer
	 * 
	 * @author AnirudhMarpally
	 * 
	 * @param randomNumbers
	 * @param input a scanner object to read user input from the console
	 * @param searchNumber an integer to search for in the array
	 * @param count the number of times the searchNumber appears in the array
	 * @return none
	 */
	public void CheckOccurance(int[] randomNumbers) {
		
		// Prompt the user to enter an integer to search for
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter an integer to search for: ");
	    
	    //User's input integer to search for
	    int searchNumber = input.nextInt();
	    
	    //variable to store the count of the user's integer
		int count = 0;
		
		//Iteration through each loop and count the repetition of integer i any
	    for (int number : randomNumbers) {
	        if (number == searchNumber) {
	            count++;
	        }
	    }
	    
	    // Display the number of times the user entered integer appears in the array
	    System.out.println(searchNumber + " appears " + count + " times in the array.");
	    
	    //closing the scanner
	    input.close();

	}

}
