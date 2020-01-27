/* Class: PokeData
 * 
 * This class stores a Pokemon as a data structure including all of it's characteristics.*/
public class PokeData {
	private String species; // Stores the species name
	private String item; // Stores item carried
	private String ability; // Stores the pokemon's ability
	private boolean shiny; // Stores whether or not the Pokemon is shiny or not
	private String nature; // Stores the pokemon's nature
	private MoveSet moves; // Stores the move set of the pokemon
	private IVSet IVs; // Stores the individual values of the pokemon
	private EVSet EVs; // Stores the effort values of the pokemon

	/* Default constructor: Currently empty - may not be used. */
	PokeData() {

	}

	/*
	 * Main constructor Takes in the species, item carried, IV set, EV set, ability,
	 * shiny status, pokemon nature and moves of the pokemon and sets up the object
	 */
	PokeData(String species, String item, IVSet IVs, EVSet EVs, String ability, boolean shiny, String nature,
			MoveSet moves) {
		this.species = species;
		this.item = item;
		this.IVs = IVs;
		this.EVs = EVs;
		this.ability = ability;
		this.shiny = shiny;
		this.nature = nature;
		this.moves = moves;
	}

	/* Method: getSpecies - returns the pokemon species as a String. */
	public String getSpecies() {
		return species;
	}

	/* Method: getITem - returns the item held as a String. */
	public String getItem() {
		return item;
	}

	/*
	 * Method: getIVs - returns the individual values of the pokemon as an IVSet
	 * object.
	 */
	public IVSet getIVs() {
		return IVs;
	}

	/*
	 * Method: getEVs - returns the effort values of the pokemon as an EVSet object.
	 */
	public EVSet getEVs() {
		return EVs;
	}

	/* Method: getAbility - returns the ability name as a String. */
	public String getAbility() {
		return ability;
	}

	/*
	 * Method: getShiny - returns whether or not the pokemon is shiny as a boolean.
	 */
	public boolean getShiny() {
		return shiny;
	}

	/* Method: getNature - returns the nature of the pokemon as a String. */
	public String getNature() {
		return nature;
	}

	/* Method: getMoves - returns the pokemon's moves as a MoveSet object. */
	public MoveSet getMoves() {
		return moves;
	}

	/*
	 * Method: setSpecies - takes in a species name as a String and sets the species
	 * variable.
	 */
	public void setSpecies(String species) {
		this.species = species;
	}

	/*
	 * Method: setItem - takes in a item name as a String and sets the item
	 * variable.
	 */
	public void setItem(String item) {
		this.item = item;
	}

	/*
	 * Method: setIVs - takes in a pokemon's IVs as an IVSet object and sets the IVs
	 * variable.
	 */
	public void setIVs(IVSet IVs) {
		this.IVs = IVs;
	}

	/*
	 * Method: setEVs - takes in a pokemon's EVs as an EVSet object and sets the EVs
	 * variable.
	 */
	public void setEVs(EVSet EVs) {
		this.EVs = EVs;
	}

	/*
	 * Method: setAbility - takes in a pokemon's ability as a string and sets the
	 * ability variable.
	 */
	public void setAbility(String ability) {
		this.ability = ability;
	}

	/*
	 * Method: setShiny - takes in a pokemon's shiny status as a boolean and sets
	 * the shiny variable.
	 */
	public void setShiny(boolean shiny) {
		this.shiny = shiny;
	}

	/*
	 * Method: setNature - takes in a pokemon's nature as a String and sets the
	 * nature variable.
	 */
	public void setNature(String nature) {
		this.nature = nature;
	}

	/*
	 * Method: setMOves - takes in a pokemon's move set as a MoveSet object and sets
	 * the moves variable.
	 */
	public void setMoves(MoveSet moves) {
		this.moves = moves;
	}
}
