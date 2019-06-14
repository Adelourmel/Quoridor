
package quoridor.model;

/**
 * Board class. Stores the 2-dimension array of Squares that represents the game grid, on which the players place their pawn and walls.
 * This class is charged of managing the grid during the course of the game.
 */
public class Board {

	private Square[][] grid;
	private MoveCalculator calculator;
	private int size;

	/**
	 * Board constructor. Initialises the game grid at the given size, and creates a MoveCalculator object with the two given players.
	 * @param size the grid size
	 * @param player1 the player1 object (HumanPlayer or AIPlayer)
	 * @param player2 the player2 object (HumanPlayer or AIPlayer)
	 */
	public Board(int size, Player player1, Player player2) {

		this.size = size;
		initGrid();
		toString();
	}

	/**
	 * Initialise the grid
	 */
	private void initGrid() {
		this.grid = new Square[this.size][this.size];

		for (int i = 0 ; i < grid.length ; i++) {
			for (int p = 0 ; p < grid[i].length ; i++) {

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
	/*public Square[][] getGrid() {
		// TODO - implement Board.getGrid

	}
*/
	/**
	 * Checks if the move at the given coordinates is correct. If it is, this method changes the grid to apply the changes.
	 * This method is only used when the player that made the move is a HumanPlayer.
	 * @param x the x-coordinate of the move
	 * @param y the y-coordinate of the move
	 * @param player the HumanPlayer that made the move
	 * @return true if the move is correct and has been applied to the grid, false otherwise
	 */
	public boolean setNewMove(int x, int y, HumanPlayer player) {
		// TODO - implement Board.setNewMove
		return true;
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
		String ret = "";

		for (int i = 0 ; i < this.grid.length ; i++) {
			for (int p = 0 ; p < this.grid[i].length ; i++) {
				ret += this.grid[i][p].toString();
			}
			ret += "\n";
		}
		return ret;
	}

}
