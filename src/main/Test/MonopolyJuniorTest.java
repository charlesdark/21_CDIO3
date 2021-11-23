import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonopolyJuniorTest {

    @Test
    void main() {

        Spiller spiller[] = new Spiller[3];
        spiller[0] = new Spiller();
        spiller[1] = new Spiller();
        spiller[2] = new Spiller();
        spiller[0].setKonto(-35);
        spiller[1].setKonto(10);
        spiller[2].setKonto(30);
        System.out.println(spiller[0].getKonto());
        System.out.println(spiller[1].getKonto());
        System.out.println(spiller[2].getKonto());


        int x;
        int max = spiller[0].getKonto();

        for (x = 0; x < 3; x++) {
            if (spiller[x].getKonto() > max){
                max = spiller[x].getKonto();
            }


        }
        Assertions.assertEquals(spiller[2].getKonto(), max);
    }


}
