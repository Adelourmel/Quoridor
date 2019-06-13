
package quoridor.model;

import java.awt.Color;

/**
 * Pawn class, extends from the Square class. This class represents a special kind of Square, that players own and can move on the grid.
 */
public class Pawn extends Square {

	private Color color;

	/**
	 * Pawn constructor. Initialises the initial coordinates by calling the super-class constructor.
	 * @param posInitX the x-coordinate of the initial position of the pawn on the grid
	 * @param posInitY the y-coordinate of the initial position of the pawn on the grid
	 * @param color the player color
	 */
	public Pawn(int posInitX, int posInitY, Color color) {
		super(posInitX, posInitY, SquareType.PAWN_ONLY);
		// TODO - implement Pawn.Pawn
	}

	/**
	 * Returns a String representation of the Pawn, with his coordinates and his color.
	 * @return a String representation of the Pawn
	 */
	public String toString() {
		// TODO - implement Pawn.toString
		return "he";
	}

	/**
	 * Returns the pawn color.
	 * @return the pawn color
	 */
	public Color getColor() {
		return this.color;
	}

	/**
	 * Sets the new color to the pawn.
	 * @param color the new color of the pawn
	 */
	public void setColor(Color color) {
		this.color = color;
	}

}
