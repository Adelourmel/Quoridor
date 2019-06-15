
package quoridor.model;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * MoveCalculator class. Contains all the useful methods of the game that manage the players moves, by determining if they are legal.
 * This class contains the browsing algorithm which ensure that moves fit the game's rules.
 */
public class MoveCalculator {

	private ArrayList<Pair> possibleWalls;
	private Player player1;
	private Player player2;
	private ArrayList<Pair> wallsList;
	private Square[][] grid;
	private final int[][] COEFF = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

	/**
	 * MoveCalculator constructor. Initialises the two players attributes and all the game-managing ArrayLists.
	 * @param player1 the player1 object
	 * @param player2 the player2 object
	 */
	public MoveCalculator(Player player1, Player player2, Square[][] grid) {
		this.player1 = player1;
		this.player2 = player2;

		this.grid = grid;
	}

	/**
	 * Update all the arrayLsit
	 */
	public void updateAll() {
		updatePossibleMoves(player1);
		updatePossibleMoves(player2);
		updatePossibleWalls();
	}

	/**
	 * Updates the possibleMoves ArrayList for both players by browsing through all the grid coordinates to check each move possible.
	 */
	private void updatePossibleMoves(Player player) {
		// TODO - implement MoveCalculator.updatePossibleMoves
	}

	/**
	 * Updates the possibleWalls ArrayList, used by both players, by browsing through all the grid coordinates to check each possible wall to put on the grid.
	 */
	private void updatePossibleWalls() {
		// TODO - implement MoveCalculator.updatePossibleWalls
	}

	/**
	 * Browses through the possibleWalls ArrayList corresponding to the given player, to check if the wall move with the given coordinates is in it, which means that placing this wall is possible.
	 * @param x the x-coordinate of the wall move
	 * @param y the y-coordinate of the wall move
	 * @return true is the wall move is possible, false otherwise
	 */
	public boolean isLegalWall(int x, int y) {
		return foundInArrayList(x, y, this.possibleWalls);
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
	 * @return true is the move is possible, false otherwise
	 */
	private boolean checkMove(int x, int y, Player player) {
		for (int i = 0 ; i < this.COEFF.length ; i++) {
			int posX = this.COEFF[i][0] + x;
			int posY = this.COEFF[i][1] + y;

			if (isInGrid(posX, posY) && !(Wall.class.isInstance(this.grid[posX][posY]))) {
				posX += this.COEFF[i][0];
				posY += this.COEFF[i][1];

				if (isInGrid(posX, posY) && !(Player.class.isInstance(this.grid[posX][posY]))) {

					posX += this.COEFF[i][0];
					posY += this.COEFF[i][1];

					if (!(Wall.class.isInstance(this.grid[posX][posY]))) {
						posX += this.COEFF[i][0];
						posY += this.COEFF[i][1];

						Pair tmp = new Pair(posX, posY);
						player.getPossiblePawn().add(tmp);
					}
				}
			}

		}
		return true;
	}

	private boolean isInGrid(int x, int y) {
		return x >= 0 && y >= 0 && x < this.grid.length && y < this.grid.length;
	}

	/**
	 * Checks if the given wall move respects the game rules and can be placed. This method contains the algorithm that checks the grid to determines if the wall move fit the rules.
	 * @param x the x-coordinate of the wall move
	 * @param y the y-coordinate of the wall move
	 * @return true is the wall move is possible, false otherwise
	 */
	private boolean checkWall(int x, int y) {
		// TODO - implement MoveCalculator.checkWall
		return true;
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

}
