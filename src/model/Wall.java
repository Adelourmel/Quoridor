
package quoridor.model;
import java.io.Serializable;

/**
 * Wall class, extends from Square. This class represents a special kind of Square,
 * that players can place on the grid to block other player's pawn to move freely on the grid.
 */
public class Wall extends Square implements Serializable{



	/**
	 * Wall constructor. Initialises the initial coordinates by calling the super-class constructor.
	 * @param posX the x-coordinate of the wall on the grid
	 * @param posY the y-coordinate of the wall on the grid
	 */
	public Wall(int posX, int posY) {
		super(posX, posY, SquareType.WALL_ONLY);
	}


	/**
	 * Returns a String representation of this wall, containing its coordinates on the game grid.
	 * @return a String representation of this wall
	 */
	public String toString() {
		return "X";
	}


	/**
	 * clone the wall
	 * @return the cloned wall
	 * @throws CloneNotSupportedException if clone is not supported
	 */
	public Wall clone() throws CloneNotSupportedException {
		Wall cloneObj = (Wall) super.clone();

		cloneObj.posX = this.posX;
		cloneObj.posY = this.posY;

		return cloneObj;
	}
}
