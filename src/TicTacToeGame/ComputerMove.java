package TicTacToeGame;
/* @author - ANIRUDH MARPALLY */


public class ComputerMove {
	/**
	 * This method is for the computer's move
	 * Creates the AI module which plays against the player
	 * 
	 * @author AnirudhMarpally
	 *
	 */
    public static void computerMove() {
        int row = -1;
        int col = -1;

        // check for a winning move
        if ((row == -1) && (col == -1)) {
        	
            // Check horizontal rows
            for (int i = 0; i < 3; i++) {
            	//checking the horizontal rows and making a horizontal move that blocks the player move for a win
                if (TicTacToe.grid[i][0].getText().equals("O") && TicTacToe.grid[i][1].getText().equals("O")
                        && TicTacToe.grid[i][2].getText().equals("")) {
                    row = i;
                    col = 2;
                    break;
                } else if (TicTacToe.grid[i][0].getText().equals("O") && TicTacToe.grid[i][2].getText().equals("O")
                        && TicTacToe.grid[i][1].getText().equals("")) {
                    row = i;
                    col = 1;
                    break;
                } else if (TicTacToe.grid[i][1].getText().equals("O") && TicTacToe.grid[i][2].getText().equals("O")
                        && TicTacToe.grid[i][0].getText().equals("")) {
                    row = i;
                    col = 0;
                    break;
                } else if (TicTacToe.grid[0][i].getText().equals("O") && TicTacToe.grid[1][i].getText().equals("O")
                        && TicTacToe.grid[2][i].getText().equals("")) {
                    row = 2;
                    col = i;
                    break;
                } else if (TicTacToe.grid[0][i].getText().equals("O") && TicTacToe.grid[2][i].getText().equals("O")
                        && TicTacToe.grid[1][i].getText().equals("")) {
                    row = 1;
                    col = i;
                    break;
                } else if (TicTacToe.grid[1][i].getText().equals("O") && TicTacToe.grid[2][i].getText().equals("O")
                        && TicTacToe.grid[0][i].getText().equals("")) {
                    row = 0;
                    col = i;
                    break;
                }
            }
        }

        // check for a blocking move
        if ((row == -1) && (col == -1)) {
        	
            // Check vertical columns
            for (int i = 0; i < 3; i++) {
            	//checking the vertical columns and making a vertical move that blocks the player move for a win
                if (TicTacToe.grid[i][0].getText().equals("X") && TicTacToe.grid[i][1].getText().equals("X")
                        && TicTacToe.grid[i][2].getText().equals("")) {
                    row = i;
                    col = 2;
                    break;
                } else if (TicTacToe.grid[i][0].getText().equals("X") && TicTacToe.grid[i][2].getText().equals("X")
                        && TicTacToe.grid[i][1].getText().equals("")) {
                    row = i;
                    col = 1;
                    break;
                } else if (TicTacToe.grid[i][1].getText().equals("X") && TicTacToe.grid[i][2].getText().equals("X")
                        && TicTacToe.grid[i][0].getText().equals("")) {
                    row = i;
                    col = 0;
                    break;
                } else if (TicTacToe.grid[0][i].getText().equals("X") && TicTacToe.grid[1][i].getText().equals("X")
                        && TicTacToe.grid[2][i].getText().equals("")) {
                    row = 2;
                    col = i;
                    break;
                } else if (TicTacToe.grid[0][i].getText().equals("X") && TicTacToe.grid[2][i].getText().equals("X")
                        && TicTacToe.grid[1][i].getText().equals("")) {
                    row = 1;
                    col = i;
                    break;
                } else if (TicTacToe.grid[1][i].getText().equals("X") && TicTacToe.grid[2][i].getText().equals("X")
                        && TicTacToe.grid[0][i].getText().equals("")) {
                    row = 0;
                    col = i;
                    break;
                }
            }
        }

        // check for a center move
        if ((row == -1) && (col == -1)) {
            if (TicTacToe.grid[1][1].getText().equals("")) {
                row = 1;
                col = 1;
            }
        }

        // check for a corner move
        if ((row == -1) && (col == -1)) {
            if (TicTacToe.grid[0][0].getText().equals("")) {
                row = 0;
                col = 0;
            } else if (TicTacToe.grid[0][2].getText().equals("")) {
                row = 0;
                col = 2;
            } else if (TicTacToe.grid[2][0].getText().equals("")) {
                row = 2;
                col = 0;
            } else if (TicTacToe.grid[2][2].getText().equals("")) {
                row = 2;
                col = 2;
            }
        }
        //check for the game status
        //surround with try-catch
        try {
        	TicTacToe.grid[row][col].setText("O");
        	TicTacToe.count++;
		} catch (Exception e) {
			// TODO: handle exception
			//If there is no move then declare it as tie
			TicTacToe.infoLabel.setText("It's a tie!");
			TicTacToe.isGameOver = true;
            return;
		}
        //
        if (CheckForWin.checkForWin()) {
        	TicTacToe.infoLabel.setText("Computer wins!");
        	TicTacToe.isGameOver = true;
            return;
        }
        //Declaring the game as Tie if all the grids are filled and the game is not completed
        if (TicTacToe.count == 9) {
        	TicTacToe.infoLabel.setText("It's a tie!");
        	TicTacToe.isGameOver = true;
            return;
        }

        TicTacToe.isPlayerOne = true;
        TicTacToe.infoLabel.setText("Player 1's turn (X).");
    }


}
