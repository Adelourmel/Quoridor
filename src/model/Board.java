package quoridor.model;

import java.util.*;

public class Board {

	private Collection<Square> grid;
	private int size;

	/**
	 * 
	 * @param size
	 */
	public Board(int size) {
		// TODO - implement Board.Board
		throw new UnsupportedOperationException();
	}

	public int getSize() {
		return this.size;
	}

	/**
	 * 
	 * @param size
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * 
	 * @param player
	 */
	public ArrayList<int[][]> legalMovesPawn(Player player) {
		// TODO - implement Board.legalMovesPawn
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param player
	 */
	public ArrayList<int[][]> legalMovesWall(Player player) {
		// TODO - implement Board.legalMovesWall
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param x
	 * @param y
	 * @param player
	 */
	public boolean isLegalWall(int x, int y, Player player) {
		// TODO - implement Board.isLegalWall
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param x
	 * @param y
	 * @param player
	 */
	public boolean isLegalPawn(int x, int y, Player player) {
		// TODO - implement Board.isLegalPawn
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param x
	 * @param y
	 * @param player
	 */
	public boolean checkMovePawn(int x, int y, Player player) {
		// TODO - implement Board.checkMovePawn
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param x
	 * @param y
	 * @param player
	 */
	public boolean checkMoveWall(int x, int y, Player player) {
		// TODO - implement Board.checkMoveWall
		throw new UnsupportedOperationException();
	}

	public void setNewMove() {
		// TODO - implement Board.setNewMove
		throw new UnsupportedOperationException();
	}

	public Square[][] getGrid() {
		// TODO - implement Board.getGrid
		throw new UnsupportedOperationException();
	}

}