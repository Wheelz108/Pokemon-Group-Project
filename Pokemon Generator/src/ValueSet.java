/* Class: ValueSet
 * 
 * Parent class of the value sets.  Mainly set up as the basis for the IVSet and EVSet classes.*/
public class ValueSet {
	private int spAtk; // Stores Special Attack
	private int spDef; // Stores Special Defense
	private int HP; // Stores HP
	private int atk; // Stores Attack
	private int def; // Stores Defense
	private int spd; // Stores Speed

	/*
	 * Main constructor - takes in the HP, attack, defense, special attack, special
	 * defense and speed and sets up value set
	 */
	ValueSet(int HP, int atk, int def, int spAtk, int spDef, int spd) {
		this.HP = HP;
		this.atk = atk;
		this.def = def;
		this.spAtk = spAtk;
		this.spDef = spDef;
		this.spd = spd;
	}

	/* Method: getHP - returns HP as an int. */
	public int getHP() {
		return HP;
	}

	/* Method: getAtk - returns attack as an int. */
	public int getAtk() {
		return atk;
	}

	/* Method: getDef - returns defense as an int. */
	public int getDef() {
		return def;
	}

	/* Method: getSpAtk - returns special attack as an int. */
	public int getSpAtk() {
		return spAtk;
	}

	/* Method: getSpDef - returns special defense as an int. */
	public int getSpDef() {
		return spDef;
	}

	/* Method: getSpd - returns speed as an int. */
	public int getSpd() {
		return spd;
	}

	/* Method: setHP - takes in HP as an int and sets the HP. */
	public void setHP(int HP) {
		this.HP = HP;
	}

	/* Method: setAtk - takes in attack as an int and sets the attack. */
	public void setAtk(int atk) {
		this.atk = atk;
	}

	/* Method: setDef - takes in defense as an int and sets the defense. */
	public void setDef(int def) {
		this.def = def;
	}

	/*
	 * Method: setSpAtk - takes in the special attack as an int and sets the special
	 * attack.
	 */
	public void setSpAtk(int spAtk) {
		this.spAtk = spAtk;
	}

	/*
	 * Method: setSpDef - takes in the special defense as an int and sets the
	 * special defense.
	 */
	public void setSpDef(int spDef) {
		this.spDef = spDef;
	}

	/* Method: setSpd - takes in the speed as an int and sets the speed. */
	public void setSpd(int spd) {
		this.spd = spd;
	}
}
