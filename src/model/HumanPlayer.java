
package quoridor.model;

import java.awt.Color;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.Serializable;


/**
 * HumanPlayer class. Represents a human player that can play against another human player or an AI player.
 * This class gathers user input and manages the general player actions.
 */
public class HumanPlayer extends Player implements Serializable {

	private transient  Scanner scan;

	/**
	 * HumanPlayer constructor. Calls the Player super-class constructor with the given parameters.
	 * @param name the player name
	 * @param color the player color (it is used for the pawn color, for example)
	 * @param board the game board
	 * @param pos the player position top, bottom...
	 */
	public HumanPlayer(String name, Color color, Board board, PlayerPos pos) {
		super(name, color, board, pos);
		this.scan = new Scanner(System.in);
	}

	/**
	 * Gathers the user input and manages the player actions during his turn.
	 */
	public boolean play() {


		boolean ret = false;
    int x = 0;
    int y = 0;
		String tmp;
		System.out.println(this.board.toString());
    boolean b = true;
    do {
			b = true;
      System.out.println("Entrez la position en X du pion");
      try {
				this.scan = new Scanner(System.in);
				tmp= scan.nextLine();
				if (tmp.equals("quit")) {
					ret = true;
				}
				else {
					x = Integer.parseInt(tmp);
				}

      } catch(Exception e) {
        b= false;
      }
			if (!ret) {

				System.out.println("Entrez la position en Y du pion");
				try {
					this.scan = new Scanner(System.in);
					tmp = scan.nextLine();
					if (tmp.equals("quit")) {
						ret = true;
					}
					else {
						y = Integer.parseInt(tmp);
					}

				} catch(Exception e) {
					b= false ;
				}
			}
			System.out.println(b);
			if (!b && !ret) {
				b = this.board.setNewMove(x, y, this);
			}
			System.out.print(b);
			if (!b) {
				System.out.println("Incorrect !");
			}

    } while (!b );

		return ret;

	}


}
