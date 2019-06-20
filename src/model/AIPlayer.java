
package quoridor.model;

import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;
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
		this.board.getCalculator().updatePossibleWalls();
		Pair ret;

		int index;
		int choice = (int)Math.round(Math.random());
		if (choice ==1 ) {
			index = (int) (Math.random()*(this.board.getCalculator().getPossibleWalls().size()-1));
			ret = this.board.getCalculator().getPossibleWalls().get(index);
		}
		else{
			index = (int) (Math.random()*(this.getPossiblePawn().size()-1));
			ret = this.getPossiblePawn().get(index);
		}
		return ret;
	}

	/**
	 * Manages the player actions during his turn.
	 */
	public boolean play() {
		Pair pair = this.computeNextMove();
		this.board.setNewMove(pair.getX(), pair.getY(), this);
		return false;
	}

	/**
	 * Manages the player actions during his turn
	 * @param  x the x coordinate of the move
	 * @param  y the y coordinate of the move
	 * @return   true if it's good move false if it isn't
	 */
	public boolean play(int x, int y){
		return true;
	}

}
