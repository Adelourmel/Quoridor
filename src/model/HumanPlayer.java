
package quoridor.model;

import java.awt.Color;
import java.util.Scanner;

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
		// TODO - implement HumanPlayer.HumanPlayer
	}

	/**
	 * Gathers the user input and manages the player actions during his turn.
	 */
	public void play() {
		// TODO - implement HumanPlayer.play
	}

}
