package MatrixGame;
import java.util.Scanner;
public class Puzzle_Game {
    static Scanner scan = new Scanner(System.in);
    static  int x, y;
    public static void main(String[] args) {
        char[][] input = {{'A', 'B', 'C', 'D', 'E'},
                          {'F', 'G', 'H', 'I', 'J'},
                          {'K', 'L', 'M', 'N', 'O'},
                          {'P', 'Q', 'R', '-', 'T'},
                          {'U', 'V', 'W', 'S', 'X'}};
        char[][] pos1 = {   {'A', 'B', 'C', 'D', 'E'},
                            {'F', 'G', 'H', 'I', 'J'},
                            {'K', 'L', 'M', 'N', 'O'},
                            {'P', 'Q', 'R', 'S', 'T'},
                            {'U', 'V', 'W', 'X', '-'}};
        final char[][] pos2 = {   {'-','A', 'B', 'C', 'D'},
                            {'E','F', 'G', 'H', 'I'},
                            {'J','K', 'L', 'M', 'N'},
                            {'O','P', 'Q', 'R', 'S'},
                            {'T','U', 'V', 'W', 'X'}};
        System.out.println("Enter the Moves to move the pointer");
        System.out.println("A - Above" + "\nB - Below" + "\nL - Left" + "\nR - Right\n");
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                System.out.print(input[i][j] + " ");}
            System.out.println();
        }
        gameResult(input, pos1, pos2);
    }
        public static void gameResult(char[][]input, char[][]pos1, char[][] pos2)
        {
        char[][] result = moveArrayPointer(input);
        try
        {
        while(result != pos1 || result != pos2)
        {   
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result.length; j++) {
                    System.out.print(result[i][j] + " ");}
                System.out.println();
            }
            if(result == pos1 || result == pos2)
            {
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result.length; j++) {
                    System.out.print(result[i][j] + " ");}
                System.out.println();
                }
            System.out.println("Game Won");
            }
            else
                result = moveArrayPointer(result);
        }
    }
        catch (Exception e)
        {
        System.out.println("Invalid Move - Game lost");
        }
    }
    public static char[][] moveArrayPointer(char[][] input)
    {
    	
    		
        System.out.println("\nEnter a Move");
        char temp = scan.next().toUpperCase().charAt(0);    
        for(int i = 0; i < input.length; i++)
        {
            int j = 0;
        while(j < input.length)
        {
            if(input[i][j] == '-')
                {
                x = i;
                y = j;
                }
            j++;
            }
        }
        if(temp == 'A')
        {
            return moveUp(input);
        }
        else if(temp == 'B')
        {
            return moveDown(input);
        }
        else if(temp == 'L')
        {
            return moveLeft(input);
        }
        else if (temp == 'R')
        {
            return moveRight(input);
        }
        else
            return input;
    }
    public static char[][] moveUp(char[][] input)
    {
        char swap;
        swap = input[x-1][y];
        input[x-1][y] = input[x][y];
        input[x][y] = swap;
        return input;
    }
    public static char[][] moveDown(char[][] input)
    {
        char swap;
        swap = input[x+1][y];
        input[x+1][y] = input[x][y];
        input[x][y] = swap;
        return input;
    }
    public static char[][] moveRight(char[][] input)
    {
        char swap;
        swap = input[x][y+1];
        input[x][y+1] = input[x][y];
        input[x][y] = swap;
        return input;
    }
    public static char[][] moveLeft(char[][] input)
    {
        char swap;
        swap = input[x][y-1];
        input[x][y-1] = input[x][y];
        input[x][y] = swap;
        return input;
    }
}