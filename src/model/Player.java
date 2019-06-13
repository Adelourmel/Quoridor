
package quoridor.model;

import java.awt.Color;

/**
 * Player abstract class. Represents a player (Human or AI) that can play against another player (Human or AI).
 * This class has abstract methods that defines the basic player actions.
 */
public abstract class Player {

	private Pawn pawn;
	private Board board;
	private String playerName;
	private Color color;
	private int wallsNb;

	/**
	 * Player constructor. Initialises the Player attributes with the given parameters.
	 * @param name the player name
	 * @param color the player color (it is used for the pawn color, for example)
	 * @param board the game board
	 */
	public Player(String name, Color color, Board board) {
		// TODO - implement Player.Player
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
		// TODO - implement Player.decWalls
	}

	/**
	 * Returns a String representation of the player, containing his name, color and number of walls.
	 * @return a String representation of the player
	 */
	public String toString() {
		// TODO - implement Player.toString
	}

}
