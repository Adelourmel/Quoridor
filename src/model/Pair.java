
package quoridor.model;
import java.io.Serializable;

/**
 * Pair class. This class provides a means of representing pairs of coordinates (x and y).
 * This coordinates are widely used for specifying moves locations on the grid.
 */
public class Pair implements Serializable {

	private int x;
	private int y;

	/**
	 * Pair constructor. Initialises the attributes with the given coordinates.
	 * @param x the x-coordinate
	 * @param y the y-coordinate
	 */
	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Returns the x-coordinate of this pair.
	 * @return the x-coordinate
	 */
	public int getX() {
		return this.x;
	}

	/**
	 * Sets the x-coordinate at the given int.
	 * @param x the new x-coordinate
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Returns the y-coordinate of this pair.
	 * @return the y-coordinate
	 */
	public int getY() {
		return this.y;
	}

	/**
	 * Sets the y-coordinate at the given int.
	 * @param y the new y-coordinate
	 */
	public void setY(int y) {
		this.y = y;
	}

/**
 * Convert object to String
 * @return the values x and y to String
 */
	public String toString() {
		return "(" + this.x + ";" + this.y + ")";
	}

}
