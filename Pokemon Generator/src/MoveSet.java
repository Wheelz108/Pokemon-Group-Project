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

	public String getMove1() {
		return move1;
	}

	public String getMove2() {
		return move2;
	}

	public String getMove3() {
		return move3;
	}

	public String getMove4() {
		return move4;
	}

	public String[] getMoves() {
		String[] moves = { move1, move2, move3, move4 };
		return moves;
	}

	public void setMove1(String move) {
		move1 = move;
	}

	public void setMove2(String move) {
		move2 = move;
	}

	public void setMove3(String move) {
		move3 = move;
	}

	public void setMove4(String move) {
		move4 = move;
	}

}
