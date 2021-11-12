import java.io.IOException;
import java.util.Scanner;

public class MonopolyJunior {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Felter felter = new Felter();
        int Max;

        System.out.println("2-4 spillere.");
        System.out.println("Hvor mange spiller?: ");
        Max = sc.nextInt();
        Spiller[] spiller = new Spiller[Max];

       for(int i = 0; i < Max; i++){
           sc.nextLine();
           spiller[i] = new Spiller();
           System.out.println("Indtast navn: ");
           spiller[i].setName(sc.next());

        }

       for (int i = 0; spiller[i].getKonto() > 0; i++) {
           spiller[i].roll();
           spiller[i].setFelt();
           felter.setFelt(spiller[i].getFelt());
           spiller[i].setKonto(felter.feltInt);

           System.out.println("Spiller: " + spiller[i].getName() + ", slå med terningerne!\n");

           try{System.in.read();}
           catch(Exception e){}

           System.out.println("Du slog " + Dice.getSum() + " " + felter.felt);
           System.out.println("Spiller " + spiller[i].getName() + ", din saldo er: " + spiller[i].getKonto() +"\n");

           if (i == (Max - 1)){
               i = -1;
           }
       }

    }

}
