package TicTacToeGame;
/* @author - ANIRUDH MARPALLY */

/**
 * A Java program for a two-player game of Tic-Tac-Toe with a graphical user interface.
 * The game can be played against the computer and the computer plays with a decent Al module.
 * 
 * @author AnirudhMarpally
 *
 */
public class TicTacToeGame {
	public static void main(String[] args) {
		
		//Starting the game by constructing the GUI
        TicTacToe game = new TicTacToe();
        game.setVisible(true);
    }
}
