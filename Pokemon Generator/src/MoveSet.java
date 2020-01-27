/* Class: MoveSet
 * 
 * This class stores the moves in a moveset for a pokemon.*/

public class MoveSet {
	private String move1; // Move 1
	private String move2; // Move 2
	private String move3; // Move 3
	private String move4; // Move 4

	/* Default constructor: Currently empty - may not be used. */
	MoveSet() {

	}

	/*
	 * Main constructor: takes in the four moves that make up the pokemon's moveset
	 * and sets up the move set
	 */
	MoveSet(String m1, String m2, String m3, String m4) {
		move1 = m1;
		move2 = m2;
		move3 = m3;
		move4 = m4;
	}

	/* Method: getMove1 - returns move 1 as a String. */
	public String getMove1() {
		return move1;
	}

	/* Method: getMove2 - returns move 2 as a String. */
	public String getMove2() {
		return move2;
	}

	/* Method: getMove3 - returns move 3 as a String. */
	public String getMove3() {
		return move3;
	}

	/* Method: getMove4 - returns move 4 as a String. */
	public String getMove4() {
		return move4;
	}

	/* Method: getMoves - returns a String array with all four moves. */
	public String[] getMoves() {
		String[] moves = { move1, move2, move3, move4 };
		return moves;
	}

	/* Method: setMove1 - takes in a move string and sets move1. */
	public void setMove1(String move) {
		move1 = move;
	}

	/* Method: setMove2 - takes in a move string and sets move2. */
	public void setMove2(String move) {
		move2 = move;
	}

	/* Method: setMove3 - takes in a move string and sets move3. */
	public void setMove3(String move) {
		move3 = move;
	}

	/* Method: setMove4 - takes in a move string and sets move4. */
	public void setMove4(String move) {
		move4 = move;
	}

}
