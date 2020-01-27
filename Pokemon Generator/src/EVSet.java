/* Class: MoveSet
 * 
 * This class represents a set of EVs.  Currently empty.  Extends ValueSet and will contain additional code that will have checks regarding EVs.*/
public class EVSet extends ValueSet {

	/*
	 * This constructor first calls the parent constructor and throws an EVException
	 * if any of the EVs are more than 252 or the total EVs total more than 510.
	 */
	EVSet(int HP, int atk, int def, int spAtk, int spDef, int spd) throws EVException {
		super(HP, atk, def, spAtk, spDef, spd);
		int totalEVs = HP + atk + def + spAtk + spDef + spd;
		if (HP > 252 || atk > 252 || def > 252 || spAtk > 252 || spDef > 252 || spd > 252 || HP < 0 || atk < 0
				|| def < 0 || spAtk < 0 || spDef < 0 || spd < 0 || totalEVs > 510)
			throw new EVException();
	}
}
