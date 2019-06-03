package quoridor.model;

public abstract class Player {

	private Board board;
	private String playerName;
	private Color color;
	private int wallsNb;

	/**
	 * 
	 * @param posX
	 * @param posY
	 * @param name
	 * @param color
	 * @param board
	 */
	public Player(int posX, int posY, String name, Color color, Board board) {
		// TODO - implement Player.Player
		throw new UnsupportedOperationException();
	}

	public abstract void play();

	public String getPlayerName() {
		return this.playerName;
	}

	/**
	 * 
	 * @param playerName
	 */
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Color getColor() {
		return this.color;
	}

	/**
	 * 
	 * @param color
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	public int getWallsNb() {
		return this.wallsNb;
	}

	public void decWalls() {
		// TODO - implement Player.decWalls
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement Player.toString
		throw new UnsupportedOperationException();
	}

}