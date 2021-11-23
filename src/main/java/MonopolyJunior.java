import java.awt.*;
import java.io.IOException;

import gui_fields.*;
import gui_main.GUI;

public class MonopolyJunior {
    public static void main(java.lang.String[] args) throws IOException {
        //Opretter felter til spillepladen
        Felter felter = new Felter();
        GameBoard gameboard = new GameBoard();
        //Opretter en ny spilleplade.
        GUI gui = new GUI(gameboard.fields, Color.PINK);
        gui.setDie(1);

        int numPlayers = gui.getUserInteger("Indtast antallet af spillere (2 - 4): ", 2, 4);

        GUI_Player player[] = new GUI_Player[numPlayers];
        Spiller spiller[] = new Spiller[numPlayers];
        int balance;
        if(numPlayers == 2){balance = 20;}
        else if(numPlayers == 3){balance = 18;}
        else{balance = 16;}

        //Opretter en spiller m. tilhørende bil
        for (int i = 0; i < numPlayers; i++) {
            if (i == 0) {
                spiller[i] = new Spiller();
                String player1In = gui.getUserString("Indtast et navn: ");
                GUI_Car car1 = new GUI_Car();
                car1.setPrimaryColor(Color.YELLOW);
                player[i] = new GUI_Player(player1In, balance, car1);
                spiller[i].setKonto(balance);
                gui.addPlayer(player[i]);
            }
            if (i == 1) {
                spiller[i] = new Spiller();
                String player2In = gui.getUserString("Indtast et navn: ");
                GUI_Car car2 = new GUI_Car();
                car2.setPrimaryColor(Color.BLUE);
                player[i] = new GUI_Player(player2In, balance, car2);
                spiller[i].setKonto(balance);
                gui.addPlayer(player[i]);
            }
            if (i == 2){
                spiller[i] = new Spiller();
                String player3In = gui.getUserString("Indtast et navn: ");
                GUI_Car car3 = new GUI_Car();
                car3.setPrimaryColor(Color.GREEN);
                player[i] = new GUI_Player(player3In, balance, car3);
                spiller[i].setKonto(balance);
                gui.addPlayer(player[i]);
            }
            if (i == 3){
                spiller[i] = new Spiller();
                String player4In = gui.getUserString("Indtast et navn: ");
                GUI_Car car4 = new GUI_Car();
                car4.setPrimaryColor(Color.RED);
                player[i] = new GUI_Player(player4In, balance, car4);
                spiller[i].setKonto(balance);
                gui.addPlayer(player[i]);
            }
        }
        //Tilføjer spillerne til start-pladsen
        for(int i = 0; i < numPlayers; i++) {
            gameboard.fields[0].setCar(player[i], true);
        }

        gui.showMessage("Tryk OK for at starte spillet!");

        for(int i = 0; player[i].getBalance() > 0; i++){
            //Slår med terningen
            gui.showMessage(player[i].getName() + " tryk OK for at slå med terningen");
            spiller[i].roll();
            gui.setDie(Dice.getDots1());

            //Rykker spilleren hen til det nye felt
            gui.showMessage("Flytter bilen!");
            gameboard.fields[spiller[i].getFelt()].removeAllCars();
            spiller[i].setFelt();
            felter.setFelt(spiller[i].getFelt());
            gameboard.fields[spiller[i].getFelt()].setCar(player[i], true);

            //Odaterer spillerens konto og sender personen i fængsel.
            if(spiller[i].getFelt() == 18){
                gameboard.fields[spiller[i].getFelt()].removeAllCars();
                spiller[i].goToJail();
                gameboard.fields[spiller[i].getFelt()].setCar(player[i], true);
            }
            //Opdaterer spilleren konto
            else {spiller[i].setKonto(felter.getFeltInt());}
            player[i].setBalance(spiller[i].getKonto());
            gui.showMessage(felter.getFeltstr());


            if(player[i].getBalance() < 1) {
                break;
            }
            else if (i == (numPlayers - 1)){
                i = -1;
            }

            }
        int x;
        int max = player[0].getBalance();

        for (x = 0; x < numPlayers - 1; x++) {
            if (player[x].getBalance() > max) {
                max = player[x].getBalance();
            }
        }
        gui.showMessage("Vinderen er " + player[x].getName());
    }
}
