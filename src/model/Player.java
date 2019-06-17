
package quoridor.model;

import java.awt.Color;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * Player abstract class. Represents a player (Human or AI) that can play against another player (Human or AI).
 * This class has abstract methods that defines the basic player actions.
 */
public abstract class Player implements Cloneable, Serializable {

	protected Pawn pawn;
	protected Board board;
	protected String playerName;
	protected Color color;
	private int wallsNb;
	private ArrayList<Pair> possiblePawn;

	/**
	 * Player constructor. Initialises the Player attributes with the given parameters.
	 * @param name the player name
	 * @param color the player color (it is used for the pawn color, for example)
	 * @param board the game board
	 * @param pos the player position top, bottom...
	 */
	public Player(String name, Color color, Board board, PlayerPos pos) {
		this.playerName = name;
		this.color = color;
		this.board = board;
		this.wallsNb = 10;

		this.possiblePawn = new ArrayList<Pair>();

		if (pos == PlayerPos.TOP) {
			this.pawn = new Pawn((this.board.getSize())/2, 0, this.color);
		}
		else if(pos == PlayerPos.BOTTOM){
			this.pawn = new Pawn((this.board.getSize())/2, this.board.getSize()-1, this.color);
		}
	}

	/**
	 * Manages the player actions during his turn.
	 */
	public abstract void play();

	/**
	 * Returns the player name.
	 * @return the player name
	 */
	public String getPlayerName() {
		return this.playerName;
	}

	/**
	 * Sets the player name.
	 * @param playerName the new player name
	 */
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	/**
	 * Returns the player color.
	 * @return the player color
	 */
	public Color getColor() {
		return this.color;
	}

	/**
	 * Sets the player color.
	 * @param color the new player color
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * Returns the player's pawn
	 * @return the player's pawn
	 */
	public Pawn getPawn() {
		return this.pawn;
	}

	/**
	 * Returns the number of walls left for the player.
	 * @return the number of walls left
	 */
	public int getWallsNb() {
		return this.wallsNb;
	}

	/**
	 * Decrements the number of walls by one unit. This method is used when a player place a wall on the grid.
	 */
	public void decWalls() {
		if (this.wallsNb > 0) {
			this.wallsNb--;
		}
	}

	/**
	 * Returns a String representation of the player, containing his name, color and number of walls.
	 * @return a String representation of the player
	 */
	public String toString() {
		String s =  this.getPlayerName();
		return s;
	}

	public ArrayList<Pair> getPossiblePawn() {
		return this.possiblePawn;
	}
	public Player clone() throws CloneNotSupportedException {
		Player clonePlayer = (Player) super.clone();

		return clonePlayer;
	}
}
