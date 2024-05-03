package TicTacToeGame;
/* @author - ANIRUDH MARPALLY */


public class Program {
	public static void main(String[] args) {
        // Create an array that can hold 10 integers
        int[] arr = new int[10];
        
        // Fill each slot with a different random value from 5-53
        for(int i = 0; i < 10; i++) {
            arr[i] = (int)(Math.random() * (53 - 5 + 1) + 5);
        }
        
        // Display the values
        System.out.print("Array values: ");
        for(int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        // Prompt the user for an integer
        System.out.print("Please enter an integer: ");
        int input = Integer.parseInt(System.console().readLine());
        
        // Search through the array, and count the number of times the item is found
        int count = 0;
        for(int i = 0; i < 10; i++) {
            if(arr[i] == input) {
                count++;
            }
        }
        
        // Output the result
        System.out.println("The integer " + input + " was found " + count + " times in the array.");
    }
}