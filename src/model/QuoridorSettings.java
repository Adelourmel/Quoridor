package quoridor.model;

import java.util.Scanner;
import java.io.File;
import java.util.InputMismatchException;
import java.util.ArrayList;
/**
 * QuoridorSettings class. This class gathers and sets the game settings. It is also responsible for saving and loading save files of unfinished games.
 */
public class QuoridorSettings {

	private Game game;
	private Gamemode gamemode;
	private int SIZE = 9;
	private String playerName1;
	private String playerName2;

	/**
	 * QuoridorSettings constructor. Calls the configure() method that gather game settings from the user.
	 */
	public QuoridorSettings() {


		// -----------------------Play game save choice-----------------------
		System.out.println("Play old game (y/n)");

		boolean valide = false;

		Scanner sc = new Scanner(System.in);

		do {
			String choice = sc.nextLine();

			if (choice.equals("y")) {
				choiceGame();
				valide = true;
			}
			else if (choice.equals("n")) {
				configure();
				valide = true;
			}
			else {
				valide = false;
			}
		} while (!valide);
		this.game = new Game(this.SIZE, this.playerName1, this.playerName2, this.gamemode);
	}

	/**
	 * Gathers input from the user to set game settings, like gamemode, players names, etc...
	 */
	public void configure() {
		boolean valide = false;

		Scanner sc;

		// -----------------------Human choose Gamemode-----------------------
		System.out.println("Chose game mode  :\n1. Human VS Machine\n2. Human VS Human");
		do {
			int choice;
			try {
				sc = new Scanner(System.in);
				choice = sc.nextInt();

			} catch (Exception e) {
				choice = -1;
			}
			if (choice == 1) {
				this.gamemode = Gamemode.HA;
				valide = true;
			}
			else if (choice == 2) {
				this.gamemode = Gamemode.HH;
				valide = true;
			}
			else {
				System.out.println("Bad choice ! Retry please : ");
				valide = false;
			}
		} while(!valide);

		// -----------------------Choice player name -----------------------
		sc = new Scanner(System.in);

		System.out.println("Player 1 name : ");
		this.playerName1 = sc.nextLine();

		System.out.println("Player 2 name : ");
		this.playerName2 = sc.nextLine();

		System.out.println("playerName 1 : " + this.playerName1 + " playerName2 : " + this.playerName2);


	}


	/**
	 * Returns ArrayList with all the save game files
	 * @return ArrayList with all the save game files
	 */
	public ArrayList<String> listFile() {
		ArrayList<String> ret = new ArrayList<String>();


		File folder = new File("../data");
		File[] listOfGames = folder.listFiles();

		for (File elem : listOfGames) {
			if (elem.isFile()) {
				ret.add(elem.getName());
			}
		}

		return ret;

	}
	private String choiceGame() {

		ArrayList<String> listOfGames = listFile();

		String ret;
		ret = "";

		System.out.println("Chose file : ");

		for(int i = 0 ; i < listOfGames.size() ; i++) {
			System.out.println((i + 1) + ". " + listOfGames.get(i));

		}

		boolean valide = false;


		do {
			Scanner sc = new Scanner(System.in);
			int choice;
			try {
				choice = sc.nextInt();
			} catch(InputMismatchException e) {
					choice = -1;
			}

			if (choice <= listOfGames.size() && choice > 0) {
				ret = listOfGames.get(choice - 1);
				valide = true;
			}
			else {
				System.out.println("Invalid choice ! Enter your choice :");
				valide = false;
			}
		} while(!valide);


		return ret;
	}

	/**
	 * Saves the current on-going game in a save file, that will allow the user to continue the game later.
	 */
	public void saveGame() {
		// TODO - implement QuoridorSettings.saveGame
	}

	/**
	 * Loads a game save file of a previous unfinished game.
	 * @param fileName the save filename
	 */
	public void loadGame(String fileName) {
		// TODO
	}

	/**
	 * Sets the player1 name.
	 * @param playerName1 the player1 name
	 */
	public void setPlayerName1(String playerName1) {
		this.playerName1 = playerName1;
	}

	/**
	 * Sets the player2 name.
	 * @param playerName2 the player2 name
	 */
	public void setPlayerName2(String playerName2) {
		this.playerName2 = playerName2;
	}

	/**
	 * Sets the gamemode.
	 * @param gamemode the game mode
	 */
	public void setGamemode(Gamemode gamemode) {
		this.gamemode = gamemode;
	}


	/**
	 * Gets the player1 name.
	 * @return the player1 name
	 */
	public String getPlayerName1() {
		return this.playerName1;
	}

	/**
	 * Gets the player2 name.
	 * @return the player2 name
	 */
	public String getPlayerName2() {
		return this.playerName2;
	}


	/**
	 * Gets the game mode
	 * @return the game mode
	 */
	public Gamemode getGameMode() {
		return this.gamemode;
	}


}
