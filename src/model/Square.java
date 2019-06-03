package quoridor.model;

public class Square {

	private SquareType squareType;
	private int posX;
	private int posY;

	/**
	 * 
	 * @param posX
	 * @param posY
	 */
	public Square(int posX, int posY) {
		// TODO - implement Square.Square
		throw new UnsupportedOperationException();
	}

	public int getPosX() {
		return this.posX;
	}

	public int getPosY() {
		return this.posY;
	}

	public String toString() {
		// TODO - implement Square.toString
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param posX
	 */
	public void setPosX(int posX) {
		this.posX = posX;
	}

	/**
	 * 
	 * @param posY
	 */
	public void setPosY(int posY) {
		this.posY = posY;
	}

}