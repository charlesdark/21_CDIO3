import java.util.Scanner;

public class MonopolyJunior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dice dice = new Dice();
        String name;
        int Max;

        System.out.println("2-4 spillere.");
        System.out.println("Hvor mange spiller?: ");
        Max = sc.nextInt();
        String spillere[] = new String[Max];
        int Beholdning[] = new int[Max];


       for(int i = 0; i < Max; i++){
           sc.nextLine();
           Spiller spiller = new Spiller();
           System.out.println("Indtast navn: ");
           spiller.name = sc.next();
           spillere[i] = spiller.name;
           Pengebeholdning pengebeholdning = new Pengebeholdning();
           Beholdning[i] = pengebeholdning.getSaldo();
        }
       Beholdning[0] += 500;
       Beholdning[1] += 1000;

       for (int i = 0; i < Max; i++) {
           System.out.println("Spiller: " + spillere[i] + ", slå med terningerne!");
           System.out.println("Spiller " + spillere[i] + ", din saldo er: " + Beholdning[i] +"\n");
       }

    }

}
