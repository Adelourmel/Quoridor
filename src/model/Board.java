
package quoridor.model;
import test.TestGridPanel;
import java.io.Serializable;

/**
 * Board class. Stores the 2-dimension array of Squares that represents the game grid, on which the players place their pawn and walls.
 * This class is charged of managing the grid during the course of the game.
 */
public class Board implements Cloneable, Serializable {

	private Square[][] grid;
	private MoveCalculator calculator;
	private int size;
	private Player player1;
	private Player player2;
	private final int SIZEWALL = 3;
	private transient TestGridPanel test;

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

	public void initGrid(Square[][] grid) {
		this.grid = grid;
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

		this.calculator = new MoveCalculator(this);
		this.calculator.updatePawn();


    this.test = new TestGridPanel(this.grid);



	}
	/**
	 * Returns the grid size.
	 * @return the grid size
	 */
	public int getSize() {
		return this.size;
	}

	public int getSizeWall() {
		return this.SIZEWALL;
	}


	/**
	 * Returns the 2-dimension array of Square that represents the game grid.
	 * @return the game grid
	 */
	public Square[][] getGrid() {
		return this.grid;
	}


	/**
	 * change the position of the pawn
	 * @param x      the new position x of the pawn
	 * @param y      the new position y of the pawn
	 * @param player the owner of the pawn
	 */
	public void setPawn(int x, int y, Player player) {
		int lastX = player.getPawn().getPosX();
		int lastY = player.getPawn().getPosY();

		this.grid[x][y] = player.getPawn();
		player.getPawn().setPosX(x);
		player.getPawn().setPosY(y);

		this.grid[lastX][lastY] = new Square(lastX, lastY, SquareType.PAWN_ONLY);

		calculator.updatePawn();
	}



	/**
	 * set wall in the grid
	 * @param x      the position x of the wall
	 * @param y      the position y of the wall
	 * @param player the owner of the wall
	 */
	public void setWalls(int x, int y, Player player) {
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
	* Checks if the move at the given coordinates is correct. If it is, this method changes the grid to apply the changes.
	* This method is only used when the player that made the move is a HumanPlayer.
	* @param x the x-coordinate of the move
	* @param y the y-coordinate of the move
	* @param player the HumanPlayer that made the move
	* @return true if the move is correct and has been applied to the grid, false otherwise
	*/
	public boolean setNewMove(int x, int y, HumanPlayer player) {
		boolean ret = false;

		if (grid[x][y].getSquareType() == SquareType.WALL_ONLY) {
			if (this.calculator.isLegalWall(x, y)) {
				setWalls(x, y, player);
				ret = true;
			}

		}
		else {
			if (this.calculator.isLegalPawn(x, y, player)) {
				setPawn(x, y, player);
				ret = true;

			}

		}
		if (ret) {
			calculator.updatePossibleWalls();
			System.out.println("array : ");
			for (Pair elem : player.getPossiblePawn()) {
				System.out.println(elem.toString());
			}
			test.gridPane.repaint();
		}
		return ret;
	}

	/**
	 * Changes the grid to apply the changes made    by the given move.
	 * Warning : this method does not check if the given move is correct. It assumes that this checking has been done by the AIPlayer itself.
	 * This method is only used when the player that made the move is a AIPlayer.
	 * @param x the x-coordinate of the move
	 * @param y the y-coordinate of the move
	 * @param player the AIPlayer that made the move
	 */
	public void setNewMove(int x, int y, AIPlayer player) {
		if (grid[x][y].getSquareType() == SquareType.WALL_ONLY) {
				setWalls(x, y, player);
		}
		else {
			setPawn(x, y, player);
		}
		calculator.updatePossibleWalls();
	}

	/**
	 * Returns the MoveCalculator object.
	 * @return the MoveCalculator object
	 */
	public MoveCalculator getCalculator() {
		return this.calculator;
	}

	/**
	 * Returns a String representation of the game grid. This method can be used for displaying the grid in the console version of game.
	 * @return a String representation of the game grid
	 */
	public String toString() {
		String ret = "\n";
		String tmp = "   ";
		for (int i = 0 ; i < this.grid.length ; i++) {
			ret += i + "\t";

			for (int p = 0 ; p < this.grid[i].length ; p++) {
				ret += this.grid[p][i].toString() + " ";
			}
			tmp += i + " ";
			ret += "\n";
		}
		ret += "\t" + tmp;
		return ret;
	}

	public Board clone() throws CloneNotSupportedException {
		Board cloneBoard = (Board) super.clone();
		cloneBoard.player1 = this.player1.clone();
		cloneBoard.player2 = this.player2.clone();

		Square[][] gridClone = new Square[this.grid.length][this.grid.length];

		for (int i = 0 ; i < this.grid.length ; i++) {
			for (int j = 0 ; j < this.grid.length ; j++) {
				gridClone[i][j] = this.grid[i][j].clone();
			}
		}
		cloneBoard.grid = gridClone;

		cloneBoard.calculator = new MoveCalculator(cloneBoard);

		return cloneBoard;
	}

	public Player getPlayer1() {
		return this.player1;
	}

	public Player getPlayer2() {
		return this.player2;
	}


}
