import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MonopolyJunior {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Felter felter = new Felter();
        LooseChange looseChange = new LooseChange();
        int Max;

        System.out.println("2-4 spillere.");
        System.out.println("Hvor mange spiller?: ");
        Max = sc.nextInt(); //Sætter Max til antal spillere
        Spiller[] spiller = new Spiller[Max]; //Laver et array af spillerklasser

        //For hver spiller, giver vi dem et navn
        for (int i = 0; i < Max; i++) {
            sc.nextLine();
            spiller[i] = new Spiller();
            System.out.println("Indtast navn: ");
            spiller[i].setName(sc.next());
        }

        //Højeste slag starter
        ArrayList<Integer> highRoll = new ArrayList<Integer>();
        ArrayList<Integer> sortRoll = new ArrayList<Integer>();

        for (int i = 0; i < Max; i++) {
            spiller[i].roll();
            System.out.println(spiller[i].getName() + " slå med terningen.");
            highRoll.add(Dice.getDots1());
            sortRoll.add(Dice.getDots1());
            System.in.read();
            System.out.println(spiller[i].getName() + " slog " + Dice.getDots1() + "\n");
        }
        Collections.sort(sortRoll);
        int i = highRoll.indexOf(sortRoll.get(sortRoll.size() - 1));
        System.out.println(spiller[i].getName() + " Starter");

        //Kør et loop indtil en spillers konto når 0
        for (i = i; spiller[i].getKonto() > 0; i++) {
            spiller[i].roll();  //Slå spillers terning
            spiller[i].setFelt(); //Sæt spilleren på et felt
            felter.setFelt(spiller[i].getFelt()); //Sætter felter-klassen på samme felt som spilleren

            if (spiller[i].getFelt() == 8) { //Hvis spilleren lander på 8, skal de betale til looseChange
                looseChange.betalSaldo(felter.getFeltInt());
                spiller[i].setKonto(felter.getFeltInt());
            }
            else if (spiller[i].getFelt() == 16){ //Hvis spilleren lander på 16 får de looseChange og LC bliver sat til 0
                spiller[i].setKonto(looseChange.getPayed());
                looseChange.saldo = 0;
            }else {spiller[i].setKonto(felter.getFeltInt());}

            System.out.println("Spiller: " + spiller[i].getName() + ", slå med terningerne!\n");

            System.in.read();

            System.out.println("Du slog " + Dice.getSum() + ". Du står på felt nr: " + spiller[i].getFelt() + "\n" + felter.getFeltStr());
            System.out.println("Spiller " + spiller[i].getName() + ", din saldo er: " + spiller[i].getKonto() + "og loose change er: " + looseChange.saldo + "\n");

            if (i == (Max - 1)) { //Hvis i = antal spillere så start ved spiller[0]
                i = -1;
            }

        }

    }

    }
