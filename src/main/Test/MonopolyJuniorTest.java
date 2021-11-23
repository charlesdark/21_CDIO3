import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class MonopolyJuniorTest {

    @org.junit.jupiter.api.Test
    void main() {
        Spiller spiller[] = new Spiller[3];
        spiller[0] = new Spiller();
        spiller[1] = new Spiller();
        spiller[2] = new Spiller();
        spiller[0].setKonto(0);
        spiller[0].setKonto(45);
        spiller[0].setKonto(65);

        int x;
        int max = spiller[0].getKonto();

        for(x = 0; x < 3; x++){
            if(spiller[x].getKonto() > max);
            max = spiller[x].getKonto();
        }
        Assertions.assertEquals(spiller[2].getKonto(), max);
    }
}