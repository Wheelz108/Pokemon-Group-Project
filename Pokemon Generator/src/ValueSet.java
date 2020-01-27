/* Class: ValueSet
 * 
 * Parent class of the value sets.  Inherited by IVSet and EVSet*/
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

	public int getHP() {
		return HP;
	}

	public int getAtk() {
		return atk;
	}

	public int getDef() {
		return def;
	}

	public int getSpAtk() {
		return spAtk;
	}

	public int getSpDef() {
		return spDef;
	}

	public int getSpd() {
		return spd;
	}

	public void setHP(int HP) {
		this.HP = HP;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public void setSpAtk(int spAtk) {
		this.spAtk = spAtk;
	}

	public void setSpDef(int spDef) {
		this.spDef = spDef;
	}

	public void setSpd(int spd) {
		this.spd = spd;
	}
}
