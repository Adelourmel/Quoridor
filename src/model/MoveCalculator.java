package quoridor.model;

public class MoveCalculator {

	private ArrayList<Pair> possibleWalls;
	private ArrayList<Pair> possibleMovesPlayer1;
	private ArrayList<Pair> possibleMovesPlayer2;
	private Player player1;
	private Player player2;
	private ArrayList<Pair> wallsList;

	/**
	 * 
	 * @param player1
	 * @param player2
	 */
	public MoveCalculator(Player player1, Player player2) {
		// TODO - implement MoveCalculator.MoveCalculator
		throw new UnsupportedOperationException();
	}

	public void updatePossibleMoves() {
		// TODO - implement MoveCalculator.updatePossibleMoves
		throw new UnsupportedOperationException();
	}

	public void updatePossibleWalls() {
		// TODO - implement MoveCalculator.updatePossibleWalls
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param x
	 * @param y
	 * @param player
	 */
	public boolean isLegalWall(int x, int y, Player player) {
		// TODO - implement MoveCalculator.isLegalWall
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param x
	 * @param y
	 * @param player
	 */
	public boolean isLegalPawn(int x, int y, Player player) {
		// TODO - implement MoveCalculator.isLegalPawn
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param x
	 * @param y
	 * @param player
	 */
	public boolean checkMove(int x, int y, Player player) {
		// TODO - implement MoveCalculator.checkMove
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param x
	 * @param y
	 */
	public boolean checkWall(int x, int y) {
		// TODO - implement MoveCalculator.checkWall
		throw new UnsupportedOperationException();
	}

	public ArrayList<Pair> getPossibleMovesPlayer1() {
		return this.possibleMovesPlayer1;
	}

	public ArrayList<Pair> getPossibleMovesPlayer2() {
		return this.possibleMovesPlayer2;
	}

	public ArrayList<Pair> getPossibleWalls() {
		return this.possibleWalls;
	}

	public ArrayList<Pair> getWallsList() {
		return this.wallsList;
	}

}