package TicTacToeGame;
/* @author - ANIRUDH MARPALLY */

/**
 * 
 * @author AnirudhMarpally
 * 
 * This program generates 10 random integers between 5 and 53 (inclusive),
 * stores them in an array, displays them on the screen, prompts the user
 * to enter an integer to search for, searches for the integer in the array,
 * and counts the number of times the integer appears in the array. Finally,
 * it displays the number of times the integer appears in the array.
 *
 */
public class ArrayIntegerRepetition {
	/**
	 * This method generates the ten random integers and instantiates the object
	 * for checkIntegerOccurance class and calls the method
	 * 
	 * @author AnirudhMarpally
	 * @param randomNumbers an array to store the generated random integers
	 * @return none
	 */
	public static void main(String[] args) {
	// Create an array of size 10 to store the random integers
	int[] randomNumbers = new int[10];


    // Generate 10 random integers between 5 and 53 (inclusive) and store them in the array
    for (int i = 0; i < 10; i++) {
        randomNumbers[i] = (int)(Math.random() * 49) + 5;
    }
    
    // Display the generated random integers
    System.out.print("Generated random integers: ");
    for (int number : randomNumbers) {
        System.out.print(number + " ");
    }
    System.out.println();
    
    
    
    //creating a object and calling the class to check for the user entered input
    CheckIntegerOccurance CheckOccurance = new CheckIntegerOccurance();
    CheckOccurance.CheckOccurance(randomNumbers);

	}
}



