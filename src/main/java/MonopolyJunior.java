import java.awt.*;
import java.util.Scanner;

import gui_fields.*;
import gui_main.GUI;
import gui_codebehind.*;
import gui_resources.*;
import gui_tests.*;

public class MonopolyJunior {
    public static void main(java.lang.String[] args) {
        Scanner sc = new Scanner(System.in);
        Dice dice = new Dice();
        String name;
        int Max;

        GUI gui = new GUI();
        gui.setDice(1, 1);

        //Opretter felter
        GUI_Field[] fields = new GUI_Field[40];

        /*fields[0] = new GUI_Street();
        GUI_Street testStreet = new GUI_Street();
        testStreet.setTitle("Testvej");
        testStreet.setBorder(Color.YELLOW);
        testStreet.setRent("100,-");
        fields[1] = testStreet;*/

        int numPlayers = gui.getUserInteger("Indtast antallet af spillere (2 - 4): ", 2, 4);

        GUI_Player player[] = new GUI_Player[numPlayers];

        //Opretter en spiller m. tilhørende bil
        for (int i = 0; i < numPlayers; i++) {


            if (i == 0) {
                String player1In = gui.getUserString("Indtast et navn: ");
                GUI_Car car1 = new GUI_Car();
                car1.setPrimaryColor(Color.YELLOW);
                player[i] = new GUI_Player(player1In, 1000, car1);
                gui.addPlayer(player[i]);

            }
            if (i == 1) {
                String player2In = gui.getUserString("Indtast et navn: ");
                GUI_Car car2 = new GUI_Car();
                car2.setPrimaryColor(Color.BLUE);
                player[i] = new GUI_Player(player2In, 1000, car2);
                gui.addPlayer(player[i]);
            }
            if (i == 2){
                String player3In = gui.getUserString("Indtast et navn: ");
                GUI_Car car3 = new GUI_Car();
                car3.setPrimaryColor(Color.GREEN);
                player[i] = new GUI_Player(player3In, 1000, car3);
                gui.addPlayer(player[i]);
            }
            if (i == 3){
                String player4In = gui.getUserString("Indtast et navn: ");
                GUI_Car car4 = new GUI_Car();
                car4.setPrimaryColor(Color.RED);
                player[i] = new GUI_Player(player4In, 1000, car4);
                gui.addPlayer(player[i]);
            }

        }



/*
        System.out.println("2-4 spillere.");
        System.out.println("Hvor mange spiller?: ");
        Max = sc.nextInt();
        String spillere[] = new String[Max];
        int Beholdning[] = new int[Max];


       for(int i = 0; i < Max; i++){
            sc.nextLine();
            Spiller spiller = new Spiller();
            System.out.println("Indtast navn: ");
            spiller.name = sc.nextLine();
            spillere[i] = spiller.name;
            Pengebeholdning pengebeholdning = new Pengebeholdning();
            Beholdning[i] = pengebeholdning.getSaldo();
        }
       Beholdning[2] += 500;
       Beholdning[1] += 1000;

       for (int i = 0; i < Max; i++) {
           System.out.println("Spiller: " + spillere[i] + ", slå med terningerne!");
           System.out.println("Spiller " + spillere[i] + ", din saldo er: " + Beholdning[i]);
       }

 */

    }

}
