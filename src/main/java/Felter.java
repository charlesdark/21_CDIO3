import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Felter {

    String felt;
    int feltInt;


    public void setFelt(int slag) throws IOException {
        String feltString = "src/main/java/FelterInt.txt";
        feltString = Files.readAllLines(Paths.get(feltString)).get(slag);
        feltInt = Integer.parseInt(feltString);

        String feltDK = "src/main/java/FelterDK.txt";
        felt = Files.readAllLines(Paths.get(feltDK)).get(slag);
    }

    public String getFeltStr() {
        return felt;
    }
    public int getFeltInt(){
        return feltInt;
    }
}