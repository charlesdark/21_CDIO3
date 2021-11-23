import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Felter {
    String description;
    int feltInt;

    //Læser fra tekstfiler med felters Strings og Ints
    public void setFelt(int slag) throws IOException {
        String feltString = "src/main/Ressources/FelterInt.txt";
        feltString = Files.readAllLines(Paths.get(feltString)).get(slag);
        feltInt = Integer.parseInt(feltString);

        String feltDK = "src/main/Ressources/FelterDK.txt";
        description = Files.readAllLines(Paths.get(feltDK)).get(slag);
    }
    //Metode til at hente linje fra FelterDK.txt
    public String getFeltstr(){
        return description;
    }
    //Metode til hente tal fra FetlerInt.txt
    public int getFeltInt(){
        return feltInt;
    }

}
