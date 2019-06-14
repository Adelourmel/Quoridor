package quoridor.model;

/**
 * SquareType enumeration. Contains the two kinds of game objects the Square can host : either a pawn (PAWN_ONLY) or a wall (WALL_ONLY).
 */
public enum SquareType {
	PAWN_ONLY("O"),
	WALL_ONLY(" ");

	private String description;

	private SquareType(String description) {
		this.description = description;
	}

	public String toString() {
		return this.description;
	}
}
