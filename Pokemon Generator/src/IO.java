import java.io.*;
import javax.swing.JOptionPane;

public class IO {
    IVSet IVs = testPokemon.getIVs();
    EVSet EVs = testPokemon.getEVs();
    MoveSet moves = testPokemon.getMoves();

    IO() {
        
    }
    public FileOut(PokeData testPokemon) {
        BufferedWriter outFile = null;
        try {
            outFile = new BufferedWriter(new FileWriter("Pkmn.txt", true));
            outFile.newLine();
            outFile.write(testPokemon.getSpecies() + "@" + testPokemon.getItem());
            outFile.newLine();
            if (IVs.getHP() == 31 && IVs.getAtk() == 31 && IVs.getDef() == 31 && IVs.getSpAtk() == 31 && IVs.getSpDef() == 31 && IVs.getSpd() == 31) {
                outFile.write("EVs: " + EVs.getHP() + " / " + EVs.getAtk() + " / " + EVs.getDef() + " / "  + EVs.getSpAtk() + " / " + EVs.getSpDef() + " / " + EVs.getSpd());
                outFile.newLine();
            } else {
                outFile.write("IVs: " + IVs.getHP() + " / " + IVs.getAtk() + " / " + IVs.getDef() + " / "  + IVs.getSpAtk() + " / " + IVs.getSpDef() + " / " + IVs.getSpd());
                outFile.newLine();
                outFile.write("EVs: " + EVs.getHP() + " / " + EVs.getAtk() + " / " + EVs.getDef() + " / "  + EVs.getSpAtk() + " / " + EVs.getSpDef() + " / " + EVs.getSpd());
                outFile.newLine();
            }
            outFile.write("Ability: " + testPokemon.getAbility());
            outFile.newLine();
            if (testPokemon.getShiny() == true) {
                outFile.write("Shiny: Yes");
                outFile.newLine();
                outFile.write(testPokemon.getNature() + "Nature");
                outFile.newLine();
            } else {
                outFile.write(testPokemon.getNature() + "Nature");
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