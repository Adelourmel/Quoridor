
package quoridor.model;

import java.awt.Color;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * HumanPlayer class. Represents a human player that can play against another human player or an AI player.
 * This class gathers user input and manages the general player actions.
 */
public class HumanPlayer extends Player {

	private Scanner scan;

	/**
	 * HumanPlayer constructor. Calls the Player super-class constructor with the given parameters.
	 * @param name the player name
	 * @param color the player color (it is used for the pawn color, for example)
	 * @param board the game board
	 */
	public HumanPlayer(String name, Color color, Board board, PlayerPos pos) {
		super(name, color, board, pos);
	}

	/**
	 * Gathers the user input and manages the player actions during his turn.
	 */
	public void play() {



      int x = 0;
      int y = 0;
			this.board.toString();
      boolean b ;
      do {
        System.out.println("Entrez la position en X du pion");
        try {
          x = scan.nextInt();
        } catch(InputMismatchException e) {
          b= false ;
        }

        System.out.println("Entrez la position en Y du pion");
        try {
          y = scan.nextInt();
        } catch(InputMismatchException e) {
          b= false ;
        }

        b = this.board.setNewMove(x, y, this);
      } while (!b );


    this.board.setNewMove(x, y, this);
	}

}
