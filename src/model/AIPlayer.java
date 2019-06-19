
package quoridor.model;

import java.awt.Color;
import java.io.Serializable;
/**
 * AIPlayer class. Represents an AI player that can play against a human player. This class is responsible for managing the AI actions.
 */
public class AIPlayer extends Player implements Serializable {

	/**
	 * AIPlayer constructor. Calls the Player super-class constructor with the given parameters.
	 * @param name the player name
	 * @param color the player color (it is used for the pawn color, for example)
	 * @param board the game board
	 * @param pos the player position top, bottom...
	 */
	public AIPlayer(String name, Color color, Board board, PlayerPos pos) {
		super(name, color, board, pos);
	}

	/**
	 * Computes the next move played by the AI, by randomly choosing a Pair of coordinates in the ArrayList of possible moves.
	 * @return the Pair of coordinates of the next move
	 */
	public Pair computeNextMove() {
		// TODO - implement AIPlayer.computeNextMove
		return new Pair(0, 0);
	}

	/**
	 * Manages the player actions during his turn.
	 */
	public boolean play() {
		// TODO - implement AIPlayer.play
		return false;
	}

	public void play(int x, int y){
		
	}

}
