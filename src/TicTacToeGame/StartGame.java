package TicTacToeGame;
/* @author - ANIRUDH MARPALLY */


import javax.swing.JOptionPane;

public class StartGame {
	
	/**
	 * This method starts the game and
	 * navigates between player's turn and computer's turn
	 * 
	 * @author AnirudhMarpally
	 */
	public void startGame() {
		// TODO Auto-generated method stub
		int response = JOptionPane.showOptionDialog(null, "Do you want to start first?", "Tic Tac Toe",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
		//asking for player to make his move
        if (response == JOptionPane.YES_OPTION) {
        	TicTacToe.isPlayerOne = true;
        	TicTacToe.infoLabel.setText("Player 1's turn (X).");
        } else {
        	//asking computer to make a move
        	TicTacToe.isPlayerOne = false;
        	TicTacToe.infoLabel.setText("Computer's turn (O).");
        	//calling the computerMove
            ComputerMove.computerMove();
        }
	}


}
