import java.util.Scanner;

public class MonopolyJunior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dice dice = new Dice();
        int Max;

        System.out.println("2-4 spillere.");
        System.out.println("Hvor mange spiller?: ");
        Max = sc.nextInt();
        String spillere[] = new String[Max];
        int Beholdning[] = new int[Max];
        int spillerpos[] = new int[Max];
        Spiller spiller = new Spiller();

       for(int i = 0; i < Max; i++){
           System.out.println("Indtast navn: ");
           spiller.name = sc.next();
           spillere[i] = spiller.name;
           spillerpos[i] = spiller.position;
           Pengebeholdning pengebeholdning = new Pengebeholdning();
           Beholdning[i] = pengebeholdning.getSaldo();
        }

       for (int i = 0; Beholdning[i] > 0; i++) {
           dice.roll1();
           dice.roll2();

           System.out.println("Spiller: " + spillere[i] + ", slå med terningerne!");

           try{System.in.read();}
           catch(Exception e){}

           System.out.println("Du slog " + Dice.getSum());
           spillerpos[i] += Dice.getSum();

           switch (spillerpos[i]) {
               case 0:
                   Beholdning[i] += Felter.Start();
                   System.out.println(Felter.start());
                   break;
               case 1:
                   Beholdning[i] -= Felter.Burgerbar();
                   System.out.println(Felter.burgerbar());
                   break;
               case 2:
                   Beholdning[i] -= Felter.Pizzaria();
                   System.out.println(Felter.pizzaria());
                   break;
               case 3:
                   Beholdning[i] -= Felter.Slikbutikken();
                   System.out.println(Felter.slikbutikken());
                   break;
               case 4:
                   Beholdning[i] -= Felter.Iskiosken();
                   System.out.println(Felter.iskiosken());
                   break;
           }

           System.out.println("Spiller " + spillere[i] + ", din saldo er: " + Beholdning[i]);

       }

    }

}
