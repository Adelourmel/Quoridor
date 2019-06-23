package quoridor.model;


/**
 * SquareType enumeration. Contains the two kinds of game objects the Square can host : either a pawn (PAWN_ONLY) or a wall (WALL_ONLY).
 */
public enum SquareType {
	PAWN_ONLY("O"),
	WALL_ONLY(" ");

	private String description;

/**
 * constructor
 * @param description description of the pawn
 */
	private SquareType(String description) {
		this.description = description;
	}

/**
 * Allow to view the description
 * @return description
 */
	public String toString() {
		return this.description;
	}

}
