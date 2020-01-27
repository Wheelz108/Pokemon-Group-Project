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

	public String getSpecies() {
		return species;
	}

	public String getItem() {
		return item;
	}

	public IVSet getIVs() {
		return IVs;
	}

	public EVSet getEVs() {
		return EVs;
	}

	public String getAbility() {
		return ability;
	}

	public boolean getShiny() {
		return shiny;
	}

	public String getNature() {
		return nature;
	}

	public MoveSet getMoves() {
		return moves;
	}

	//
	public void setSpecies(String species) {
		this.species = species;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public void setIVs(IVSet IVs) {
		this.IVs = IVs;
	}

	public void setEVs(EVSet EVs) {
		this.EVs = EVs;
	}

	public void setAbility(String ability) {
		this.ability = ability;
	}

	public void setShiny(boolean shiny) {
		this.shiny = shiny;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public void setMoves(MoveSet moves) {
		this.moves = moves;
	}
}
