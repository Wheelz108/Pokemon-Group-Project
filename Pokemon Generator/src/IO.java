import java.io.*;
import javax.swing.JOptionPane;

public class IO {
    IVSet IVs;
    EVSet EVs;
    MoveSet moves;
    PokeData pokemon;

    public IO(PokeData _pokemon) {
        pokemon = _pokemon;
        IVs = _pokemon.getIVs();
        EVs = _pokemon.getEVs();
        moves = _pokemon.getMoves();
    }
    public void FileOut() {
        BufferedWriter outFile = null;
        try {
            outFile = new BufferedWriter(new FileWriter("Pkmn.txt", true));
            outFile.newLine();
            outFile.write(pokemon.getSpecies() + " @ " + pokemon.getItem());
            outFile.newLine();
            if (IVs.getHP() == 31 && IVs.getAtk() == 31 && IVs.getDef() == 31 && IVs.getSpAtk() == 31 && IVs.getSpDef() == 31 && IVs.getSpd() == 31) {
                outFile.write("EVs: " + EVs.getHP() + " HP / " + EVs.getAtk() + " Atk / " + EVs.getDef() + " Def / "  + EVs.getSpAtk() + " SpA / " + EVs.getSpDef() + " SpD / " + EVs.getSpd() + " Spe");
                outFile.newLine();
            } else {
                outFile.write("IVs: " + IVs.getHP() + " HP / " + IVs.getAtk() + " Atk / " + IVs.getDef() + " Def / "  + IVs.getSpAtk() + " SpA / " + IVs.getSpDef() + " SpD / " + IVs.getSpd() + " Spe");
                outFile.newLine();
                outFile.write("EVs: " + EVs.getHP() + " HP / " + EVs.getAtk() + " Atk / " + EVs.getDef() + " Def / "  + EVs.getSpAtk() + " SpA / " + EVs.getSpDef() + " SpD / " + EVs.getSpd() + " Spe");
                outFile.newLine();
            }
            outFile.write("Ability: " + pokemon.getAbility());
            outFile.newLine();
            if (pokemon.getShiny() == true) {
                outFile.write("Shiny: Yes");
                outFile.newLine();
                outFile.write(pokemon.getNature() + " Nature");
                outFile.newLine();
            } else {
                outFile.write(pokemon.getNature() + " Nature");
                outFile.newLine();
            }
            outFile.write("- " + moves.getMove1());
            outFile.newLine();
            outFile.write("- " + moves.getMove2());
            outFile.newLine();
            outFile.write("- " + moves.getMove3());
            outFile.newLine();
            outFile.write("- " + moves.getMove4());
            outFile.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}