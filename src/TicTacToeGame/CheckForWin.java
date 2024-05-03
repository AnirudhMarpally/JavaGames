package TicTacToeGame;
/* @author - ANIRUDH MARPALLY */

public class CheckForWin {
	/**
	 * This method is to check the game if there is a win pattern appears in the grid
	 * returns true if the game is completed
	 * returns false if the game is not completed yet
	 * 
	 * @author AnirudhMarpally
	 * @return boolean
	 */
    public static boolean checkForWin() {
        // Check horizontal wins
        for (int i = 0; i < 3; i++) {
        	//checking if there is any win pattern in all 3 horizontal rows
            if (TicTacToe.grid[i][0].getText().equals(TicTacToe.grid[i][1].getText()) && TicTacToe.grid[i][1].getText().equals(TicTacToe.grid[i][2].getText())
                    && !TicTacToe.grid[i][0].getText().equals("")) {
                return true;
            }
        }

        // Check vertical wins
        for (int i = 0; i < 3; i++) {
        	//checking if there is any win pattern in all 3 vertical columns
            if (TicTacToe.grid[0][i].getText().equals(TicTacToe.grid[1][i].getText()) && TicTacToe.grid[1][i].getText().equals(TicTacToe.grid[2][i].getText())
                    && !TicTacToe.grid[0][i].getText().equals("")) {
                return true;
            }
        }

        // Check diagonal wins if any in the grid
        if (TicTacToe.grid[0][0].getText().equals(TicTacToe.grid[1][1].getText()) && TicTacToe.grid[1][1].getText().equals(TicTacToe.grid[2][2].getText())
                && !TicTacToe.grid[0][0].getText().equals("")) {
            return true;
        }
        if (TicTacToe.grid[0][2].getText().equals(TicTacToe.grid[1][1].getText()) && TicTacToe.grid[1][1].getText().equals(TicTacToe.grid[2][0].getText())
                && !TicTacToe.grid[0][2].getText().equals("")) {
            return true;
        }
        //else return false if the game is not completed
        return false;
    }
}
