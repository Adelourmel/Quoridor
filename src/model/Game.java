package quoridor.model;
import java.awt.Color;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Game class. This class starts the game with the correct settings (grid size, gamemode, players) and manages the game's progress.
 */
public class Game implements Serializable {

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

	}

	/**
	 * Starts the game and manages the game's progress.
	 */
	public void startConsoleGame() {
		boolean player1Play = true;

		boolean quitGame = false;
		while (!this.endOfGame() && !quitGame){
			if (player1Play) {
				quitGame = this.player1.play();
				player1Play = false;
			}
			else {
				quitGame = this.player2.play();
				player1Play = true;
			}
		}
		if (quitGame) {
			quitConsoleGame();
		}

	}

	public void saveConsoleGame(){
		SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
    Date date = new Date();
		File file = new File("../data/"+this.player1.getPlayerName()+"-"+this.player2.getPlayerName()+"-"+formater.format(date)+".ser");
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(this);
		} catch(IOException  e) {
			System.out.println(e.getMessage());
		}
	}

	public void quitConsoleGame(){

		System.out.println("Save the game ? (y/n)");

		boolean valide = false;

		Scanner sc = new Scanner(System.in);
		do {
			String choice = sc.nextLine();

			if (choice.equals("y")) {
				this.saveConsoleGame();
				System.out.println("Game saved");
				valide = true;
			}
			else if (choice.equals("n")) {
				valide = true;
			}
			else {
				valide = false;
			}
		} while (!valide);
		sc.close();
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
