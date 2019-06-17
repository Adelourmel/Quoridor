package quoridor.model;
import java.io.Serializable;

/**
 * Square class. This class represents the object that fill the game grid.
 * A Square has a SquareType attribute which defines if the Square can host a wall or a pawn on the game grid.
 */
public class Square implements Cloneable, Serializable {

	private SquareType squareType;
	private int posX;
	private int posY;

	/**
	 * Square constructor. Initialises the coordinates of the Square as well as the SquareType, which defines what kind of game object the Square can host during the game.
	 * @param posX the x-coordinate of this Square on the game grid
	 * @param posY the y-coordinate of this Square on the game grid
	 * @param squareType the SquareType object that defines if the Square can hosts either a wall or a pawn
	 */
	public Square(int posX, int posY, SquareType squareType) {
		this.posX = posX;
		this.posY = posY;

		this.squareType = squareType;

	}

	/**
	 * Returns the Square x-coordinate on the game grid.
	 * @return the x-coordinate
	 */
	public int getPosX() {
		return this.posX;
	}

	/**
	 * Returns the Square y-coordinate on the game grid.
	 * @return the y-coordinate
	 */
	public int getPosY() {
		return this.posY;
	}

	/**
	 * Returns the SquareType object that defines which kind of object this Square can host.
	 * @return the SquareType of the Square
	 */
	public SquareType getSquareType() {
		return this.squareType;
	}

	/**
	 * Sets the SquareType object that defines which kind of object this Square can host.
	 * @param squareType the new SquareType of this Square
	 */
	public void setSquareType(SquareType squareType) {
		this.squareType = squareType;
	}

	/**
	 * Returns a String representation of this Square, containing its coordinates.
	 * @return a String representation of this Square
	 */
	public String toString() {
		return this.squareType.toString();
	}

	/**
	 * Sets the x-coordinate of this Square on the game grid.
	 * @param posX the new x-coordinate of this Square
	 */
	public void setPosX(int posX) {
		this.posX = posX;
	}

	/**
	 * Sets the y-coordinate of this Square on the game grid.
	 * @param posY the new y-coordinate of this Square
	 */
	public void setPosY(int posY) {
		this.posY = posY;
	}

	public Square clone() throws CloneNotSupportedException {
		Square cloneObj = (Square) super.clone();
		return cloneObj;
	}

}
