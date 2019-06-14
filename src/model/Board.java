
package quoridor.model;

/**
 * Board class. Stores the 2-dimension array of Squares that represents the game grid, on which the players place their pawn and walls.
 * This class is charged of managing the grid during the course of the game.
 */
public class Board {

	private Square[][] grid;
	private MoveCalculator calculator;
	private int size;
	private Player player1;
	private Player player2;
	private final int SIZEWALL = 3;

	/**
	 * Board constructor. Initialises the game grid at the given size, and creates a MoveCalculator object with the two given players.
	 * @param size the grid size
	 * @param player1 the player1 object (HumanPlayer or AIPlayer)
	 * @param player2 the player2 object (HumanPlayer or AIPlayer)
	 */
	public Board(int size, Player player1, Player player2) {

		this.player1 = player1;
		this.player2 = player2;
		this.size = size;


	}

	/**
	 * Initialise the grid
	 */
	public void initGrid() {
		this.grid = new Square[this.size][this.size];

		for (int i = 0 ; i < grid.length ; i++) {
			for (int p = 0 ; p < grid[i].length ; p++) {

				if (p%2 != 0) {
					this.grid[i][p] = new Square(i, p, SquareType.WALL_ONLY);
				}
				else {
					if (i%2 == 0) {
						this.grid[i][p] = new Square(i, p, SquareType.PAWN_ONLY);
					}
					else {
						this.grid[i][p] = new Square(i, p, SquareType.WALL_ONLY);
					}
				}

			}

		}

		int x = this.player1.getPawn().getPosX();
		int y = this.player1.getPawn().getPosY();
		this.grid[x][y] = this.player1.getPawn();

		x = this.player2.getPawn().getPosX();
		y = this.player2.getPawn().getPosY();
		this.grid[x][y] = this.player2.getPawn();

	}
	/**
	 * Returns the grid size.
	 * @return the grid size
	 */
	public int getSize() {
		return this.size;
	}

	/**
	 * Sets a the grid size
	 * @param size the new grid size
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * Returns the 2-dimension array of Square that represents the game grid.
	 * @return the game grid
	 */
	public Square[][] getGrid() {
		return this.grid;
	}

	/**
	 * Checks if the move at the given coordinates is correct. If it is, this method changes the grid to apply the changes.
	 * This method is only used when the player that made the move is a HumanPlayer.
	 * @param x the x-coordinate of the move
	 * @param y the y-coordinate of the move
	 * @param player the HumanPlayer that made the move
	 * @return true if the move is correct and has been applied to the grid, false otherwise
	 */
	public boolean setNewMove(int x, int y, HumanPlayer player) {

		if (true) {
			if (grid[x][y].getSquareType() == SquareType.WALL_ONLY) {
				if (x%2 == 0) {
					System.out.println("YOp");
					setWalls(x, y, player);
				}
			}
			else {

				int lastX = player.getPawn().getPosX();
				int lastY = player.getPawn().getPosY();

				this.grid[x][y] = player.getPawn();
				player.getPawn().setPosX(x);
				player.getPawn().setPosY(y);

				this.grid[lastX][lastY] = new Square(lastX, lastY, SquareType.PAWN_ONLY);

			}




		}

		return true;
	}

	private boolean isWall(int x, int y) {
			return x%2 != 0 && y%2 != 0;
	}
	private void setWalls(int x, int y, Player player) {
		System.out.println("fdf");
		int coeffX = 0;
		int coeffY = 0;

		int posX = x;
		int posY = y;

		if (x%2 == 0) {
			coeffX = 1;
		}
		else if (y%2 == 0) {
			coeffY = 1;
		}

		for (int i = 0 ; i < this.SIZEWALL ; i++) {
			this.grid[posX][posY] = new Wall(posX, posY, player);
			posX += coeffX;
			posY += coeffY;
		}
		player.decWalls();
	}
	public void setPlayers(Player p1, Player p2) {
		this.player1 = p1;
		this.player2 = p2;
	}
	/**
	 * Changes the grid to apply the changes made by the given move.
	 * Warning : this method does not check if the given move is correct. It assumes that this checking has been done by the AIPlayer itself.
	 * This method is only used when the player that made the move is a AIPlayer.
	 * @param x the x-coordinate of the move
	 * @param y the y-coordinate of the move
	 * @param player the AIPlayer that made the move
	 */
	public void setNewMove(int x, int y, AIPlayer player) {
		// TODO - implement Board.setNewMove
	}

	/**
	 * Returns the MoveCalculator object.
	 * @return the MoveCalculator object
	 */
/*	public MoveCalculator getCalculator() {
		// TODO - implement Board.getCalculator
	}*/

	/**
	 * Returns a String representation of the game grid. This method can be used for displaying the grid in the console version of game.
	 * @return a String representation of the game grid
	 */
	public String toString() {
		String ret = "\n";
		String tmp = "   ";
		for (int i = 0 ; i < this.grid.length ; i++) {
			ret += i + "  ";
			for (int p = 0 ; p < this.grid[i].length ; p++) {
				ret += this.grid[p][i].toString() + " ";
			}
			tmp += i + " ";
			ret += "\n";
		}
		ret += tmp;
		return ret;
	}

}
