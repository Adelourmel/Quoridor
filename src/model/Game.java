package quoridor.model;


/**
 * Game class. This class starts the game with the correct settings (grid size, gamemode, players) and manages the game's progress.
 */
public class Game {

	private Player player1;
	private Player player2;
	private Board board;

	/**
	 * Game constructor. Creates the two players with their names according to the given gamemode. 
	 * Also initialises the game board with the newly created players.
	 * @param size the grid size
	 * @param playerName1 the player1 name
	 * @param playerName2 the player2 name
	 * @param mode the gamemode
	 */
	public Game(int size, String playerName1, String playerName2, Gamemode mode) {
		// TODO - implement Game.Game
	}

	/**
	 * Starts the game and manages the game's progress.
	 */
	public void startGame() {
		// TODO - implement Game.startGame
	}

	/**
	 * Checks if the game has ended. To end a game, a player's pawn have to reach the opposite-player's starting zone.
	 * @return true if the game has ended, false otherwise
	 */
	public boolean endOfGame() {
		// TODO
	}

	/**
	 * Returns the game board.
	 * @return the game board
	 */
	public Board getBoard() {
		return this.board;
	}

}