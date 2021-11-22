import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Spiller {

    String name;
    int konto = 35;
    int felt = 0;
    int slag;

    public void roll() {
        Dice dice = new Dice();

        dice.roll1();

        slag = Dice.getDots1();
    }
    public int getKonto(){
        return konto;
    }
    public void setKonto(int tal){
        konto += tal;
    }
    public int getFelt(){
        return felt;
    }
    public void setFelt() {
        if ((felt + slag) >= 24) {
            felt = (felt + slag) % 24;
            konto += 2;
        } else {
            felt += slag;
        }
    }
}