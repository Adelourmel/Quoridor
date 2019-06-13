
package quoridor.model;

import java.util.ArrayList;

/**
 * MoveCalculator class. Contains all the useful methods of the game that manage the players moves, by determining if they are legal.
 * This class contains the browsing algorithm which ensure that moves fit the game's rules.
 */
public class MoveCalculator {

	private ArrayList<Pair> possibleWalls;
	private ArrayList<Pair> possibleMovesPlayer1;
	private ArrayList<Pair> possibleMovesPlayer2;
	private Player player1;
	private Player player2;
	private ArrayList<Pair> wallsList;

	/**
	 * MoveCalculator constructor. Initialises the two players attributes and all the game-managing ArrayLists.
	 * @param player1 the player1 object
	 * @param player2 the player2 object
	 */
	public MoveCalculator(Player player1, Player player2) {
		// TODO - implement MoveCalculator.MoveCalculator
	}

	/**
	 * Updates the possibleMoves ArrayList for both players by browsing through all the grid coordinates to check each move possible.
	 */
	public void updatePossibleMoves() {
		// TODO - implement MoveCalculator.updatePossibleMoves
	}

	/**
	 * Updates the possibleWalls ArrayList, used by both players, by browsing through all the grid coordinates to check each possible wall to put on the grid.
	 */
	public void updatePossibleWalls() {
		// TODO - implement MoveCalculator.updatePossibleWalls
	}

	/**
	 * Browses through the possibleWalls ArrayList corresponding to the given player, to check if the wall move with the given coordinates is in it, which means that placing this wall is possible.
	 * @param x the x-coordinate of the wall move
	 * @param y the y-coordinate of the wall move
	 * @return true is the wall move is possible, false otherwise
	 */
	public boolean isLegalWall(int x, int y) {
		// TODO - implement MoveCalculator.isLegalWall
		return false;
	}

	/**
	 * Browses through the possibleMoves ArrayList corresponding to the given player, to check if the move with the given coordinates is in it, which means that the move is possible.
	 * @param x the x-coordinate of the move
	 * @param y the y-coordinate of the move
	 * @param player the player that made the move
	 * @return true is the move is possible, false otherwise
	 */
	public boolean isLegalPawn(int x, int y, Player player) {
		// TODO - implement MoveCalculator.isLegalPawn
		return false;
	}

	/**
	 * Checks if the given move respects the game rules and can be placed. This method contains the algorithm that checks the grid to determines if the move fit the rules.
	 * @param x the x-coordinate of the move
	 * @param y the y-coordinate of the move
	 * @param player the player that made the move
	 * @return true is the move is possible, false otherwise
	 */
	public boolean checkMove(int x, int y, Player player) {
		// TODO - implement MoveCalculator.checkMove
		return false;
	}

	/**
	 * Checks if the given wall move respects the game rules and can be placed. This method contains the algorithm that checks the grid to determines if the wall move fit the rules.
	 * @param x the x-coordinate of the wall move
	 * @param y the y-coordinate of the wall move
	 * @return true is the wall move is possible, false otherwise
	 */
	public boolean checkWall(int x, int y) {
		// TODO - implement MoveCalculator.checkWall
		return false;
	}

	/**
	 * Returns the possibleMoves ArrayList for the player 1.
	 * @return the possibleMovesPlayer1 ArrayList
	 */
	public ArrayList<Pair> getPossibleMovesPlayer1() {
		return this.possibleMovesPlayer1;
	}

	/**
	 * Returns the possibleMoves ArrayList for the player 2.
	 * @return the possibleMovesPlayer2 ArrayList
	 */
	public ArrayList<Pair> getPossibleMovesPlayer2() {
		return this.possibleMovesPlayer2;
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
