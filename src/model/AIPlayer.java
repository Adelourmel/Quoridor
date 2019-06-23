
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
		Pair ret;

		int index;
		int choice = (int)Math.round(Math.random()*10);
		if (choice < -1 && this.getWallsNb() > 0) {
			ret = setWall();

		}
		else{
			ret = setPawn();
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


/**
 * This method choose where the pawn is set up
 * @return pair with coordinate
 */
	private Pair setPawn() {

		Pair ret = this.getPossiblePawn().get(0);

		for (Pair elem : this.getPossiblePawn()) {
			if (elem.getY() < ret.getY()) {
				ret = elem;
			}
		}

		int index = (int) (Math.random()*this.getPossiblePawn().size());
		ret = this.getPossiblePawn().get(index);

		return ret;

	}


/**
 * This method chose where the pawn is set up
 * @return pair whith coordinate
 */
	private Pair setWall() {
	/*	this.board.getCalculator().updatePossibleWalls();
		int index = (int) (Math.random()*(this.board.getCalculator().getPossibleWalls().size()));
		ArrayList<Pair> possibleWalls = this.board.getCalculator().getPossibleWalls();

		Pair ret = possibleWalls.get(0);

		for (Pair elem : possibleWalls) {
			if (elem.getY() == this.board.getPlayer1().getY() && (elem.getX() >= this.board.getPlayer1().getX() && elem.getX() <= this.board.getPlayer1().getX())) {
				ret = elem;
				break;
			}
		}
*/



		return null;
	}

}
