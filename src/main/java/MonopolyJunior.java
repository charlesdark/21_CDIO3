import java.awt.*;

import gui_fields.*;
import gui_main.GUI;

public class MonopolyJunior {
    public static void main(java.lang.String[] args) {
        Felter felter = new Felter();
        LooseChange looseChange = new LooseChange();

        //Opretter en spilleplade med 40 felter
        GUI_Field[] fields = new GUI_Field[24];
        GUI_Start start = new GUI_Start(); start.setTitle("GO!"); start.setBackGroundColor(Color.GREEN); start.setSubText("Modtag 2$"); fields[0] = start;
        GUI_Street street1 = new GUI_Street(); street1.setTitle("Burger Joint"); street1.setBorder(Color.BLACK); street1.setBackGroundColor(Color.RED); street1.setSubText("2$"); fields[1] = street1;
        GUI_Street street2 = new GUI_Street(); street2.setTitle("Pizza Joint"); street2.setBorder(Color.BLACK); street2.setBackGroundColor(Color.RED); street2.setSubText("2$"); fields[2] = street2;
        GUI_Chance chance = new GUI_Chance(); chance.setBackGroundColor(Color.GREEN); chance.setForeGroundColor(Color.BLACK); fields[3] = chance;
        GUI_Street street3 = new GUI_Street(); street3.setTitle("Candy Store"); street3.setBorder(Color.BLACK); street3.setBackGroundColor(Color.YELLOW); street3.setSubText("2$"); fields[4] = street3;
        GUI_Street street4 = new GUI_Street(); street4.setTitle("Ice Cream Palour"); street4.setBorder(Color.BLACK); street4.setBackGroundColor(Color.YELLOW); street4.setSubText("2$"); fields[5] = street4;
        GUI_Street pay = new GUI_Street(); pay.setTitle("pay 2$ dollars"); pay.setBorder(Color.BLACK); pay.setBackGroundColor(Color.GREEN); pay.setSubText("2$"); fields[6] = pay;
        GUI_Street street5 = new GUI_Street(); street5.setTitle("Museum"); street5.setBorder(Color.BLACK); street5.setBackGroundColor(Color.BLUE); street5.setSubText("2$"); fields[7] = street5;
        GUI_Street street6 = new GUI_Street(); street6.setTitle("Library"); street6.setBorder(Color.BLACK); street6.setBackGroundColor(Color.BLUE); street6.setSubText("2$"); fields[8] = street6;
        GUI_Chance chance2 = new GUI_Chance(); chance2.setBackGroundColor(Color.GREEN); chance2.setForeGroundColor(Color.BLACK); fields[9] = chance2;
        GUI_Street street7 = new GUI_Street(); street7.setTitle("Skate Park"); street7.setBorder(Color.BLACK); street7.setBackGroundColor(Color.ORANGE); street7.setSubText("2$"); fields[10] = street7;
        GUI_Street street8 = new GUI_Street(); street8.setTitle("Swimming Pool"); street8.setBorder(Color.BLACK); street8.setBackGroundColor(Color.ORANGE); street8.setSubText("2$"); fields[11] = street8;
        fields[12] = new GUI_Shipping("src/main/Ressources/train-icon-21.jpg.png", "Railroad","2$","Du er landet på togstationen, og får nu en gratis tur med toget.", "2$", Color.GREEN, Color.BLACK);
        GUI_Street street9 = new GUI_Street(); street9.setTitle("Video Game Arcade"); street9.setBorder(Color.BLACK); street9.setBackGroundColor(Color.GRAY); street9.setSubText("2$"); fields[13] = street9;
        GUI_Street street10 = new GUI_Street(); street10.setTitle("Movie Theater"); street10.setBorder(Color.BLACK); street10.setBackGroundColor(Color.GRAY); street10.setSubText("2$"); fields[14] = street10;
        GUI_Street restrooms = new GUI_Street(); restrooms.setTitle("Restrooms"); restrooms.setBorder(Color.BLACK); restrooms.setBackGroundColor(Color.GREEN); restrooms.setSubText("?"); fields[15] = restrooms;
        GUI_Street street11 = new GUI_Street(); street11.setTitle("Toy Store"); street11.setBorder(Color.BLACK); street11.setBackGroundColor(Color.CYAN); street11.setSubText("2$"); fields[16] = street11;
        GUI_Street street12 = new GUI_Street(); street12.setTitle("Pet Store"); street12.setBorder(Color.BLACK); street12.setBackGroundColor(Color.CYAN); street12.setSubText("2$"); fields[17] = street12;
        GUI_Street loosechange = new GUI_Street(); loosechange.setTitle("Loose Change"); loosechange.setBorder(Color.BLACK); loosechange.setBackGroundColor(Color.GREEN); loosechange.setSubText("JACKPOT!"); fields[18] = loosechange;
        GUI_Street street13 = new GUI_Street(); street13.setTitle("Bowling Ally"); street13.setBorder(Color.BLACK); street13.setBackGroundColor(Color.PINK); street13.setSubText("2$"); fields[19] = street13;
        GUI_Street street14 = new GUI_Street(); street14.setTitle("The Zoo"); street14.setBorder(Color.BLACK); street14.setBackGroundColor(Color.PINK); street14.setSubText("2$"); fields[20] = street14;
        GUI_Chance chance3 = new GUI_Chance(); chance3.setBackGroundColor(Color.GREEN); chance3.setForeGroundColor(Color.BLACK); fields[21] = chance3;
        GUI_Street street15 = new GUI_Street(); street15.setTitle("Park Place"); street15.setBorder(Color.BLACK); street15.setBackGroundColor(Color.BLUE); street15.setSubText("2$"); fields[22] = street15;
        GUI_Street street16 = new GUI_Street(); street16.setTitle("BoardWalk"); street16.setBorder(Color.BLACK); street16.setBackGroundColor(Color.BLUE); street16.setSubText("2$"); fields[23] = street16;


        GUI gui = new GUI(fields);
        gui.setDie(1);

        int numPlayers = gui.getUserInteger("Indtast antallet af spillere (2 - 4): ", 2, 4);

        GUI_Player player[] = new GUI_Player[numPlayers];
        Spiller spiller[] = new Spiller[numPlayers];

        //Opretter en spiller m. tilhørende bil
        for (int i = 0; i < numPlayers; i++) {
            if (i == 0) {
                spiller[i] = new Spiller();
                String player1In = gui.getUserString("Indtast et navn: ");
                GUI_Car car1 = new GUI_Car();
                car1.setPrimaryColor(Color.YELLOW);
                player[i] = new GUI_Player(player1In, 35, car1);
                gui.addPlayer(player[i]);
            }
            if (i == 1) {
                spiller[i] = new Spiller();
                String player2In = gui.getUserString("Indtast et navn: ");
                GUI_Car car2 = new GUI_Car();
                car2.setPrimaryColor(Color.BLUE);
                player[i] = new GUI_Player(player2In, 35, car2);
                gui.addPlayer(player[i]);
            }
            if (i == 2){
                spiller[i] = new Spiller();
                String player3In = gui.getUserString("Indtast et navn: ");
                GUI_Car car3 = new GUI_Car();
                car3.setPrimaryColor(Color.GREEN);
                player[i] = new GUI_Player(player3In, 35, car3);
                gui.addPlayer(player[i]);
            }
            if (i == 3){
                spiller[i] = new Spiller();
                String player4In = gui.getUserString("Indtast et navn: ");
                GUI_Car car4 = new GUI_Car();
                car4.setPrimaryColor(Color.RED);
                player[i] = new GUI_Player(player4In, 35, car4);
                gui.addPlayer(player[i]);
            }
        }
        //Tilføjer spillerne til start-pladsen
        for(int i = 0; i < numPlayers; i++) {
            fields[0].setCar(player[i], true);
        }

        gui.showMessage("Tryk OK for at starte spillet!");

        for(int i = 0; player[i].getBalance() > 0; i++){
            //Slår med terningen
            gui.showMessage(player[i].getName() + " tryk OK for at slå med terningen");
            spiller[i].roll();
            gui.setDie(Dice.getDots1());

            //Rykker spilleren hen til det nye felt
            gui.showMessage("Flytter bilen!");
            fields[spiller[i].getFelt()].removeAllCars();
            spiller[i].setFelt();
            fields[spiller[i].getFelt()].setCar(player[i], true);

            //Odaterer spillerens konto og betaler til loosechange
            if(spiller[i].getFelt() == 6){
                looseChange.betalSaldo(felter.getFeltInt());
                spiller[i].setKonto(felter.getFeltInt());
                gui.showMessage("Du betaler til Loose Change");
            }
            else if(spiller[i].getFelt() == 15){
                looseChange.betalSaldo(felter.getFeltInt());
                spiller[i].setKonto(felter.getFeltInt());
                gui.showMessage("Du betaler til Loose Change");
            }
            else if(spiller[i].getFelt() == 18){
                spiller[i].setKonto(looseChange.getPayed());
                looseChange.Saldo = 0;
                gui.showMessage("DU MODTAGER LOOSE CHANGE!!");
            }
            //Opdaterer spilleren konto
            else {spiller[i].setKonto(felter.getFeltInt());
                gui.showMessage(felter.getFeltstr());}
            player[i].setBalance(spiller[i].getKonto());

            //Giver en ekstra tur hvis man lander på railroad
            if(spiller[i].getFelt() == 12){
                i = i-1;
                gui.showMessage("Du har fået et ekstra slag!");
            }

            if(i == (numPlayers - 1)){
                i = -1;
            }
        }

    }
}
