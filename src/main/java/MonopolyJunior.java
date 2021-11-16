import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MonopolyJunior {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Felter felter = new Felter();
        LooseChange looseChange = new LooseChange();
        int Max;

        System.out.println("2-4 spillere.");
        System.out.println("Hvor mange spiller?: ");
        Max = sc.nextInt();
        Spiller[] spiller = new Spiller[Max];


        for (int i = 0; i < Max; i++) {
            sc.nextLine();
            spiller[i] = new Spiller();
            System.out.println("Indtast navn: ");
            spiller[i].setName(sc.next());
        }

        for (int i = 0; spiller[i].getKonto() > 0; i++) {
            spiller[i].roll();
            spiller[i].setFelt();
            felter.setFelt(spiller[i].getFelt());

            if (spiller[i].getFelt() == 8) {
                looseChange.betalSaldo(felter.getFeltInt());
                spiller[i].setKonto(felter.getFeltInt());
            }
            else if (spiller[i].getFelt() == 16){
                spiller[i].setKonto(looseChange.getPayed());
                looseChange.saldo = 0;
            }else {spiller[i].setKonto(felter.getFeltInt());}

            System.out.println("Spiller: " + spiller[i].getName() + ", slå med terningerne!\n");

            System.in.read();

            System.out.println("Du slog " + Dice.getSum() + ". Du står på felt nr: " + spiller[i].getFelt() + "\n" + felter.getFeltStr());
            System.out.println("Spiller " + spiller[i].getName() + ", din saldo er: " + spiller[i].getKonto() + "og loose change er: " + looseChange.saldo + "\n");

            if (i == (Max - 1)) {
                i = -1;
            }

        }

    }

    }
