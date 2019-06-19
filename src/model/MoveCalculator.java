
package quoridor.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.io.Serializable;

/**
 * MoveCalculator class. Contains all the useful methods of the game that manage the players moves, by determining if they are legal.
 * This class contains the browsing algorithm which ensure that moves fit the game's rules.
 */
public class MoveCalculator implements Cloneable, Serializable {

	private ArrayList<Pair> possibleWalls;
	private ArrayList<Pair> wallsList;

	private final int[][] COEFF = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
	private Board board;

	/**
	 * MoveCalculator constructor. Initialises the two players attributes and all the game-managing ArrayLists.
	 * @param player1 the player1 object
	 * @param player2 the player2 object
	 * @param grid the grid array
	 */
	public MoveCalculator(Board board) {

		this.board = board;
	}

	/**
	 * Update all the arrayLsit
	 */
	public void updatePawn() {
		updatePossibleMoves(this.board.getPlayer1());
		updatePossibleMoves(this.board.getPlayer2());
	}

	/**
	 * Updates the possibleMoves ArrayList for both players by browsing through all the grid coordinates to check each move possible.
	 * @param player the player
	 */
	private void updatePossibleMoves(Player player) {
		player.getPossiblePawn().clear();
		checkPawnMove(player.getPawn().getPosX(), player.getPawn().getPosY(), player, this.board.getGrid());
	}

	/**
	 * Updates the possibleWalls ArrayList, used by both players, by browsing through all the grid coordinates to check each possible wall to put on the grid.
	 */
	public void updatePossibleWalls() {
		Square[][] g = board.getGrid();

		this.possibleWalls = new ArrayList<Pair>();

		for (int i = 0 ;  i < g.length - 1; i++) {
			for (int p = 0 ; p < g[i].length -1 ; p++) {
				if (this.board.getGrid()[i][p].getSquareType() == SquareType.WALL_ONLY && !(p%2 != 0 && i%2 != 0)) {
					if (thereIsNoWall(i, p, g)) {
						if (checkWall(i, p)) {
							possibleWalls.add(new Pair(i,p));
						}
					}

				}
			}

		}
	}




	public boolean thereIsNoWall(int x, int y, Square[][] g) {
		boolean ret = false;

		if (y%2 != 0) {
			ret = isInGrid(x, y, g) && !(Wall.class.isInstance(this.board.getGrid()[x][y]))
			 && isInGrid(x+2, y, g) && !(Wall.class.isInstance(this.board.getGrid()[x+2][y]))
			 && isInGrid(x+1, y, g) && !(Wall.class.isInstance(this.board.getGrid()[x+1][y]));
		}
		else if (x%2 != 0) {
			ret = isInGrid(x, y, g) && !(Wall.class.isInstance(this.board.getGrid()[x][y]))
			&& isInGrid(x, y+2, g) && !(Wall.class.isInstance(this.board.getGrid()[x][y+2]))
			 && isInGrid(x, y+1, g) && !(Wall.class.isInstance(this.board.getGrid()[x][y+1]));
		}

		return ret;

	}

	/**
	 * Browses through the possibleWalls ArrayList corresponding to the given player, to check if the wall move with the given coordinates is in it, which means that placing this wall is possible.
	 * @param x the x-coordinate of the wall move
	 * @param y the y-coordinate of the wall move
	 * @return true is the wall move is possible, false otherwise
	 */
	public boolean isLegalWall(int x, int y) {
		boolean ret = false;
		Square[][] g = board.getGrid();

		if (thereIsNoWall(x, y, g)) {
			if (checkWall(x, y)) {
				ret = true;
			}
		}
		return ret;
	}

	/**
	 * Browses through the possibleMoves ArrayList corresponding to the given player, to check if the move with the given coordinates is in it, which means that the move is possible.
	 * @param x the x-coordinate of the move
	 * @param y the y-coordinate of the move
	 * @param player the player that made the move
	 * @return true is the move is possible, false otherwise
	 */
	public boolean isLegalPawn(int x, int y, Player player) {
		return foundInArrayList(x, y, player.getPossiblePawn());

	}

/**
 * Foud if the coordinate are in the array or not
 * @param  x     x position
 * @param  y     y position
 * @param  array the ArrayList
 * @return       true if found else false
 */
	private boolean foundInArrayList(int x, int y, ArrayList<Pair> array) {
		Iterator<Pair> ite = array.iterator();
		boolean found = false;

		while (ite.hasNext() && !found) {
			Pair elem = ite.next();
			if (elem.getX() == x && elem.getY() == y) {
				found = true;
			}
		}
		return found;
	}

	/**
	 * Checks if the given move respects the game rules and can be placed. This method contains the algorithm that checks the grid to determines if the move fit the rules.
	 * @param x the x-coordinate of the move
	 * @param y the y-coordinate of the move
	 * @param player the player that made the move
	 * @return false if there is no move possible
	 */
	private boolean checkPawnMove(int x, int y, Player player, Square[][] g) {

		boolean ret = false;

		for (int i = 0 ; i < this.COEFF.length ; i++) {
			int posX = this.COEFF[i][0] + x;
			int posY = this.COEFF[i][1] + y;

			if (isInGrid(posX, posY, this.board.getGrid()) && !(Wall.class.isInstance(g[posX][posY]))) {
				posX += this.COEFF[i][0];
				posY += this.COEFF[i][1];

				if (isInGrid(posX, posY, this.board.getGrid()) && (Pawn.class.isInstance(g[posX][posY]))) {
					posX += this.COEFF[i][0];
					posY += this.COEFF[i][1];

					if (isInGrid(posX, posY, this.board.getGrid()) && !(Wall.class.isInstance(g[posX][posY]))) {
						posX += this.COEFF[i][0];
						posY += this.COEFF[i][1];

						Pair tmp = new Pair(posX, posY);
						player.getPossiblePawn().add(tmp);
						ret = true;
					}
				}
				else if (isInGrid(posX, posY, this.board.getGrid())){
					Pair tmp = new Pair(posX, posY);
					player.getPossiblePawn().add(tmp);
					ret = true;
				}
			}

		}
		return ret;
	}

	/**
	* Checks if the given wall move respects the game rules and can be placed. This method contains the algorithm that checks the grid to determines if the wall move fit the rules.
	* @param x the x-coordinate of the wall move
	* @param y the y-coordinate of the wall move
	* @return true is the wall move is possible, false otherwise
	*/
	private boolean checkWall(int x, int y) {



		Board cloneBoard = cloneTheBoard();

		cloneBoard.setWalls(x, y, cloneBoard.getPlayer1());

		ArrayList<Pair> mark = new ArrayList<Pair>();
	  boolean ret = false;




		ret = explore(cloneBoard.getPlayer1(), cloneBoard, mark);

		cloneBoard = cloneTheBoard();
		cloneBoard.setWalls(x, y, cloneBoard.getPlayer1());

		if (ret) {

			ret = explore(cloneBoard.getPlayer2(), cloneBoard, mark);

		}

		return ret;
	}

	private boolean explore(Player player, Board cloneBoard, ArrayList<Pair> mark) {
		int x = player.getPawn().getPosX();
		int y = player.getPawn().getPosY();

		boolean ret = false;

		mark.add(new Pair(x, y));
		ArrayList<Pair> m = cloneArray(mark);


		ArrayList<Pair> neighbors = player.getPossiblePawn();
		ArrayList<Pair> n = cloneArray(neighbors);

		Iterator<Pair> ite = n.iterator();


		while (!ret && ite.hasNext()) {

			Pair elem = ite.next();

			if (!ret && !foundInArrayList(elem.getX(), elem.getY(), mark)) {
				cloneBoard.setPawn(elem.getX(), elem.getY(), player);
				if (elem.getY() == player.getPosFinal()) {
			 			ret = true;
				}
				else {
					ret = explore(player, cloneBoard, m);

				}
			}

		}
		return ret;

	}


	private ArrayList<Pair> cloneArray(ArrayList<Pair> array) {
		ArrayList<Pair> ret = new ArrayList<Pair>();

		for (Pair elem : array) {
			try {
				ret.add(elem.clone());
			}
			catch (CloneNotSupportedException e) {
				System.out.println(e.getMessage());
			}
		}

		return ret;
	}

/**
 * Check if the x,y coordinate are in grid
 * @param  x coordinate x
 * @param  y coordinate y
 * @return   true if the position is good
 */
	private boolean isInGrid(int x, int y, Square[][] g) {
		return x >= 0 && y >= 0 && x < g.length && y < g.length;
	}




	/**
	 * Returns the possibleWalls ArrayList.
	 * @return the possibleWalls ArrayList
	 */
	public ArrayList<Pair> getPossibleWalls() {
		return this.possibleWalls;
	}

	/**
	 * Returns the ArrayList containing all the walls placed on the grid.
	 * @return the wallsList ArrayList
	 */
	public ArrayList<Pair> getWallsList() {
		return this.wallsList;
	}

	public MoveCalculator clone() throws CloneNotSupportedException {
		MoveCalculator cloneCal = (MoveCalculator) super.clone();
		return cloneCal;
	}


	private Board cloneTheBoard() {
		Board cloneBoard = null;
		boolean ret;

		try {
			cloneBoard = this.board.clone();
		} catch(CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		}

		return cloneBoard;
	}

}
