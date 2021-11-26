import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MonopolyJuniorTest {

    @org.junit.jupiter.api.Test
    void VinderTest01() {
        Spiller[] spiller = new Spiller[3];
        spiller[0] = new Spiller();
        spiller[1] = new Spiller();
        spiller[2] = new Spiller();
        spiller[0].setKonto(0);
        spiller[1].setKonto(45);
        spiller[2].setKonto(65);

        int x;
        int max = spiller[0].getKonto();

        for (x = 0; x < 3; x++) {
            if (spiller[x].getKonto() > max)
                max = spiller[x].getKonto();
        }
        Assertions.assertEquals(spiller[2].getKonto(), max);
    }


    @org.junit.jupiter.api.Test
    void setFeltTest01() {
        // Opretter spiller
        Spiller[] spiller = new Spiller[2];
        spiller[0] = new Spiller();

        int slutFelt = 0;


        for (int i = 0; i < 50; i++) {
            int startFelt = spiller[0].getFelt();
            spiller[0].roll();
            int slag = Dice.getDots1();
            spiller[0].setFelt();
            if (startFelt + slag >= 24) {
                slutFelt = (startFelt + slag) % 24;
            } else {
                slutFelt = startFelt + slag;
            }

            Assertions.assertEquals(slutFelt, spiller[0].getFelt());
        }


    }
}