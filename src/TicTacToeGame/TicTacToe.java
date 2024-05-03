package TicTacToeGame;
/* @author - ANIRUDH MARPALLY */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * This method constructs the Tic-Tac-Toe graphical board and 
 * starts the game and handles the event
 * 
 * @author AnirudhMarpally
 *
 */
public class TicTacToe extends JFrame implements ActionListener {
	
    
	private static final long serialVersionUID = 1307798497702473591L;
	// Variables used to store the game state
	static JButton[][] grid = new JButton[3][3];
    static JLabel infoLabel = new JLabel();
    private JPanel buttonPanel = new JPanel(new GridLayout(3, 3));
    //information panel to store game status
    static JPanel infoPanel = new JPanel();
    //setting the main panel
    private JPanel mainPanel = new JPanel(new BorderLayout());
    
    // keeps track of whose turn it is
    static boolean isPlayerOne = true;
    // keeps track of whose turn it is
    static boolean isGameOver = false;
    // keeps track of how many moves have been made
    static int count = 0;
   // static JPanel tabPanel = new JPanel();
    JButton help;
   // private JLabel message;

	//Construct the GUI
    public TicTacToe() {
    	//set the frame title
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setting the frame size
        setSize(300, 300);
        setResizable(false);
        // set the frame to center of the screen
        setLocationRelativeTo(null);
        
        // create the buttons and add them to the panel
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                grid[row][col] = new JButton();
                // set the font for the grid
                grid[row][col].setFont(new Font("Arial", Font.PLAIN, 40));
                grid[row][col].addActionListener(this);
                // add button to the panel
                buttonPanel.add(grid[row][col]);
            }
        }
        //setting the task panel for help buttons
        JPanel taskPanel = new JPanel();
        //setting the help button
        help = new JButton("Help");
        help.addActionListener(this);
        //add info label to info pane
        infoPanel.add(infoLabel);
        //add help button to task panel
        taskPanel.add(help);
        //add the button panel, info panel and task panel to main panel
        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        mainPanel.add(infoPanel, BorderLayout.NORTH);
        mainPanel.add(taskPanel, BorderLayout.SOUTH);
        add(mainPanel);
        //asking the user to start the game by pressing the OK button
        JOptionPane.showMessageDialog(null, "Welcome to Tic Tac Toe! \nPress OK to start the game.",
                "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);

        //Starting the game
        StartGame startGame = new StartGame();
		startGame.startGame();
    }

    /**
     * This method handles a button click
     */
    public void actionPerformed(ActionEvent e) {
    	
    	//return if the game is over
        if (isGameOver)
            return;

        JButton button = (JButton) e.getSource();
        //marking the player's choice with X
        if (button.getText().equals("")) {
            if (isPlayerOne) {
                button.setText("X");
                infoLabel.setText("Computer's turn (O).");
            } else {
                button.setText("O");
                infoLabel.setText("Player 1's turn (X).");
            }
            count++;
            //Checking if there is a win pattern
            if (CheckForWin.checkForWin()) {
                if (isPlayerOne)
                    infoLabel.setText("Player 1 wins!");
                else
                    infoLabel.setText("Computer wins!");
                isGameOver = true;
                return;
            }
            //returning the variables & ending the game if the total count in the grid exceeds
            if (count == 9) {
                infoLabel.setText("It's a tie!");
                isGameOver = true;
                return;
            }
            //asking for computer to play it's turn
            isPlayerOne = !isPlayerOne;
            if (!isPlayerOne)
            	ComputerMove.computerMove();
            
        }else if (e.getSource() == help) {
            JOptionPane.showMessageDialog(this, "Tic Tac Toe\n\nCreated by: Anirudh Marpally\nDate: 04/04/2023n\nRules:\n1. Players take turns placing an X and an O in an empty cell.\n2. The first player to get three of their marks in a row (up, down, across, or diagonally) is the winner.");
        }
    }
 
}
