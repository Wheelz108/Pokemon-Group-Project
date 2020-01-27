/* Class: IVSet
 * 
 * This class represents a set of IVs.  Currently empty.  Extends ValueSet and will contain additional code that will have checks regarding IVs.*/
public class IVSet extends ValueSet {

	/*
	 * This constructor throws an exception if any of the IVs are more than 31 or
	 * less than 0
	 */
	IVSet(int HP, int atk, int def, int spAtk, int spDef, int spd) throws IVException {
		super(HP, atk, def, spAtk, spDef, spd);
		if (HP > 31 || atk > 31 || def > 31 || spAtk > 31 || spDef > 31 || spd > 31 || HP < 0 || atk < 0 || def < 0
				|| spAtk < 0 || spDef < 0 || spd < 0)
			throw new IVException();
	}
}
