import javax.swing.JOptionPane;

// This is a test program of the PokeData class and it's member variables.
public class pokeTest {
	public IO fileOutput;

	public static void main(String[] args) {
		String species = JOptionPane.showInputDialog("Enter a species: ");
		String item = JOptionPane.showInputDialog("Enter the item held by the pokemon: ");
		String IVHPString = JOptionPane.showInputDialog("Enter HP IV: ");
		String IVatkString = JOptionPane.showInputDialog("Enter attack IV: ");
		String IVdefString = JOptionPane.showInputDialog("Enter defense IV: ");
		String IVspAtkString = JOptionPane.showInputDialog("Enter special attack IV: ");
		String IVspDefString = JOptionPane.showInputDialog("Enter special defense IV: ");
		String IVspdString = JOptionPane.showInputDialog("Enter speed IV: ");
		String EVHPString = JOptionPane.showInputDialog("Enter HP EV: ");
		String EVatkString = JOptionPane.showInputDialog("Enter attack EV: ");
		String EVdefString = JOptionPane.showInputDialog("Enter defense EV: ");
		String EVspAtkString = JOptionPane.showInputDialog("Enter special attack EV: ");
		String EVspDefString = JOptionPane.showInputDialog("Enter special defense EV: ");
		String EVspdString = JOptionPane.showInputDialog("Enter speed EV: ");
		String ability = JOptionPane.showInputDialog("Enter the pokemon's ability: ");
		String shinyString = JOptionPane.showInputDialog("Is the pokemon shiny?\n[1] Yes\n[2] No");
		int shinyInt = Integer.parseInt(shinyString);
		boolean shiny = false;
		if (shinyInt == 1)
			shiny = true;
		else if (shinyInt == 2)
			shiny = false;
		String nature = JOptionPane.showInputDialog("Enter the pokemon's nature: ");
		String move1 = JOptionPane.showInputDialog("Enter move 1: ");
		String move2 = JOptionPane.showInputDialog("Enter move 2: ");
		String move3 = JOptionPane.showInputDialog("Enter move 3: ");
		String move4 = JOptionPane.showInputDialog("Enter move 4: ");
		int IVHP = Integer.parseInt(IVHPString);
		int IVatk = Integer.parseInt(IVatkString);
		int IVdef = Integer.parseInt(IVdefString);
		int IVspAtk = Integer.parseInt(IVspAtkString);
		int IVspDef = Integer.parseInt(IVspDefString);
		int IVspd = Integer.parseInt(IVspdString);
		int EVHP = Integer.parseInt(EVHPString);
		int EVatk = Integer.parseInt(EVatkString);
		int EVdef = Integer.parseInt(EVdefString);
		int EVspAtk = Integer.parseInt(EVspAtkString);
		int EVspDef = Integer.parseInt(EVspDefString);
		int EVspd = Integer.parseInt(EVspdString);
		try {
			PokeData pokemon = new PokeData(species, item, new IVSet(IVHP, IVatk, IVdef, IVspAtk, IVspDef, IVspd),
					new EVSet(EVHP, EVatk, EVdef, EVspAtk, EVspDef, EVspd), ability, shiny, nature,
					new MoveSet(move1, move2, move3, move4));
			IVSet IVs = pokemon.getIVs();
			EVSet EVs = pokemon.getEVs();
			MoveSet moves = pokemon.getMoves();
			String pokeString = "";
			pokeString += pokemon.getSpecies() + " @ " + pokemon.getItem() + "\n";
			pokeString += "IVs: " + IVs.getHP() + " HP / " + IVs.getAtk() + " Atk / " + IVs.getDef() + " Def / " + IVs.getSpAtk() + " SpA / " + IVs.getSpDef() + " SpD / " + IVs.getSpd() + " Spe" + "\n";
			pokeString += "EVs: " + EVs.getHP() + " HP / " + EVs.getAtk() + " Atk / " + EVs.getDef() + " Def / " + EVs.getSpAtk() + " SpA / " + EVs.getSpDef() + " SpD / " + EVs.getSpd() + " Spe" + "\n";
			pokeString += "Ability: " + pokemon.getAbility() + "\n";
			pokeString += "Shiny: " + pokemon.getShiny() + "\n";
			pokeString += pokemon.getNature() + " Nature" + "\n";
			pokeString += "- " + moves.getMove1() + "\n";
			pokeString += "- " + moves.getMove2() + "\n";
			pokeString += "- " + moves.getMove3() + "\n";
			pokeString += "- " + moves.getMove4() + "\n";
			JOptionPane.showMessageDialog(null, pokeString);
			IO fileOut = new IO(pokemon);
			fileOut.FileOut();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}
