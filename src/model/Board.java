package quoridor.model;

import java.util.*;

public class Board {

	private Collection<Square> grid;
	private MoveCalculator calculator;
	private int size;

	/**
	 * 
	 * @param size
	 * @param player1
	 * @param player2
	 */
	public Board(int size, Player player1, Player player2) {
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

	public Square[][] getGrid() {
		// TODO - implement Board.getGrid
		throw new UnsupportedOperationException();
	}

	/**
	 * Ceci est un test
	 * @param x
	 * @param y
	 * @param player
	 */
	public boolean setNewMove(int x, int y, HumanPlayer player) {
		// TODO - implement Board.setNewMove
		throw new UnsupportedOperationException();
	}

	/**
	 * Ceci est un test
	 * @param x
	 * @param y
	 * @param player
	 */
	public boolean setNewMove(int x, int y, AIPlayer player) {
		// TODO - implement Board.setNewMove
		throw new UnsupportedOperationException();
	}

	public MoveCalculator getCalculator() {
		// TODO - implement Board.getCalculator
		throw new UnsupportedOperationException();
	}

}