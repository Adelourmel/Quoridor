package quoridor.model;

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
		// TODO - implement QuoridorSettings.QuoridorSettings
	}

	/**
	 * Gathers input from the user to set game settings, like gamemode, players names, etc...
	 */
	public void configure() {
		// TODO
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
}