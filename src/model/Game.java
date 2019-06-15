package quoridor.model;
import java.awt.Color;

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
		this.board = new Board(size, this.player1, this.player2);

		if (mode == Gamemode.HH) {
			this.player1 = new HumanPlayer(playerName1, Color.BLACK, this.board, PlayerPos.TOP);
			this.player2 = new HumanPlayer(playerName2, Color.WHITE, this.board, PlayerPos.BOTTOM);
		}
		else if (mode == Gamemode.HA) {
			this.player1 = new HumanPlayer(playerName1, Color.BLACK, this.board, PlayerPos.TOP);
			this.player2 = new AIPlayer(playerName2, Color.WHITE, this.board, PlayerPos.BOTTOM);
		}
		this.board.setPlayers(this.player1, this.player2);
		this.board.initGrid();
		startGame();
	}

	/**
	 * Starts the game and manages the game's progress.
	 */
	public void startGame() {
		boolean player1Play = true;

		while (!this.endOfGame()){
			if (player1Play) {
				this.player1.play();
				player1Play = false;
			}
			else {
				this.player2.play();
				player1Play = true;
			}
		}
	}

	/**
	 * Checks if the game has ended. To end a game, a player's pawn have to reach the opposite-player's starting zone.
	 * @return true if the game has ended, false otherwise
	 */
	public boolean endOfGame() {
		boolean ret = false;
		if (player1.getPawn().getPosY() == this.board.getSize()-1) {
			System.out.println("Le gagnant est "+player1.toString());
			ret = true;
		}
		else if (player2.getPawn().getPosY() == 0) {
			System.out.println("Le gagnant est "+player2.toString());
			ret = true;
		}
		return ret;
	}

	/**
	 * Returns the game board.
	 * @return the game board
	 */
	public Board getBoard() {
		return this.board;
	}

}
