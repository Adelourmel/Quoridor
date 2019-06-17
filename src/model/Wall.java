
package quoridor.model;
import java.io.Serializable;

/**
 * Wall class, extends from Square. This class represents a special kind of Square,
 * that players can place on the grid to block other player's pawn to move freely on the grid.
 */
public class Wall extends Square implements Serializable{

	private Player player;

	/**
	 * Wall constructor. Initialises the initial coordinates by calling the super-class constructor.
	 * @param posX the x-coordinate of the wall on the grid
	 * @param posY the y-coordinate of the wall on the grid
	 * @param player the player that placed the wall
	 */
	public Wall(int posX, int posY, Player player) {
		super(posX, posY, SquareType.WALL_ONLY);
	}

	/**
	 * Returns the player that placed this wall.
	 * @return the player that placed this wall
	 */
	/*public Player getPlayer() {
		// TODO - implement Wall.getPlayer
	}*/

	/**
	 * Returns a String representation of this wall, containing its coordinates on the game grid.
	 * @return a String representation of this wall
	 */
	public String toString() {
		return "X";
	}

	/**
	 * Return the owner of the wall
	 * @return the owner of the wall
	 */
	public Player getPlayer() {
		return this.player;
	}

}
