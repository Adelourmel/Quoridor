
package quoridor.model;

import java.awt.Color;

/**
 * AIPlayer class. Represents an AI player that can play against a human player. This class is responsible for managing the AI actions.
 */
public class AIPlayer extends Player {

	/**
	 * AIPlayer constructor. Calls the Player super-class constructor with the given parameters.
	 * @param name the player name
	 * @param color the player color (it is used for the pawn color, for example)
	 * @param board the game board
	 */
	public AIPlayer(String name, Color color, Board board) {
		// TODO - implement AIPlayer.AIPlayer
	}

	/**
	 * Computes the next move played by the AI, by randomly choosing a Pair of coordinates in the ArrayList of possible moves.
	 * @return the Pair of coordinates of the next move
	 */
	public Pair computeNextMove() {
		// TODO - implement AIPlayer.computeNextMove
	}

	/**
	 * Manages the player actions during his turn.
	 */
	public void play() {
		// TODO - implement AIPlayer.play
	}

}
