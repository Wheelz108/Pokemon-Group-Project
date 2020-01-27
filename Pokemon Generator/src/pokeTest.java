import javax.swing.JOptionPane;

// This is a test program of the PokeData class and it's member variables.
public class pokeTest {

	public static void main(String[] args) {
		try {
			PokeData testPokemon = new PokeData("Bulbasaur", "A thing", new IVSet(31, 31, 31, 31, 31, 31),
					new EVSet(252, 252, 6, 0, 0, 0), "things and stuff", true, "beautiful",
					new MoveSet("Fly", "Splash", "Hydro Pump", "Ice Beam"));
			IVSet IVs = testPokemon.getIVs();
			EVSet EVs = testPokemon.getEVs();
			MoveSet moves = testPokemon.getMoves();
			String pokeString = "";
			pokeString += "Species: " + testPokemon.getSpecies() + "\n";
			pokeString += "Item: " + testPokemon.getItem() + "\n";
			pokeString += "IVs:\n";
			pokeString += "* HP - " + IVs.getHP() + "\n";
			pokeString += "* Atk - " + IVs.getAtk() + "\n";
			pokeString += "* Def - " + IVs.getDef() + "\n";
			pokeString += "* Sp Atk - " + IVs.getSpAtk() + "\n";
			pokeString += "* Sp Def - " + IVs.getSpDef() + "\n";
			pokeString += "* Spd - " + IVs.getSpd() + "\n";
			pokeString += "EVs:\n";
			pokeString += "* HP - " + EVs.getHP() + "\n";
			pokeString += "* Atk - " + EVs.getAtk() + "\n";
			pokeString += "* Def - " + EVs.getDef() + "\n";
			pokeString += "* Sp Atk - " + EVs.getSpAtk() + "\n";
			pokeString += "* Sp Def - " + EVs.getSpDef() + "\n";
			pokeString += "* Spd - " + EVs.getSpd() + "\n";
			pokeString += "Ability: " + testPokemon.getAbility() + "\n";
			pokeString += "Shiny: " + testPokemon.getShiny() + "\n";
			pokeString += "Nature: " + testPokemon.getNature() + "\n";
			pokeString += "Moves:\n";
			pokeString += "* Move 1 - " + moves.getMove1() + "\n";
			pokeString += "* Move 2 - " + moves.getMove2() + "\n";
			pokeString += "* Move 3 - " + moves.getMove3() + "\n";
			pokeString += "* Move 4 - " + moves.getMove4() + "\n";
			System.out.println(pokeString);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

	}

}
