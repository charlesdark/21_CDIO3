import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import gui_fields.GUI_Player;
import gui_main.GUI;

public class Spiller {
    private String name;
    private int konto = 0;
    private int felt = 0;
    private int slag;

    public void roll() {
        Dice dice = new Dice();

        dice.roll1();

        slag = Dice.getDots1();
    }

    private void setBalance(){
    }

    public int getKonto(){
        return konto;
    }
    public void setKonto(int tal){
        konto += tal;
    }
    public void goToJail(){
        felt = 6;
        konto += -1;
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
    public void setChanceFelt(int a) {
        if ((felt + a) >= 24) {
            felt = (felt + a) % 24;
            konto += 2;
        } else {
            felt += a;
        }
    }
    public void moveToStart(){
        felt = 0;
    }
}
