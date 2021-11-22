import java.awt.*;

import gui_fields.*;
import gui_main.GUI;

public class MonopolyJunior {
    public static void main(java.lang.String[] args) {
        Felter felter = new Felter();
        LooseChange looseChange = new LooseChange();

        //Opretter en spilleplade med 40 felter
        GUI_Field[] fields = new GUI_Field[24];
        fields[0] = new GUI_Start("GO!", "Du modtager 2$", "Du har passeret start.", Color.GREEN, Color.BLACK);
        fields[1] = new GUI_Street("Burger Bar", "2$", "Du har været ude og købe en burger til aftensmad, den koster dig 2$", "2$", Color.RED, Color.BLACK);
        fields[2] = new GUI_Street("Pizza bar", "2$", "Du har været ude og købe en pizza til aftensmad, den koster dig 2$", "2$", Color.RED, Color.BLACK);
        GUI_Chance chance = new GUI_Chance(); chance.setBackGroundColor(Color.GREEN); chance.setForeGroundColor(Color.BLACK); fields[3] = chance;
        fields[4] = new GUI_Street("Slikbutik", "2$", "Du har blandet slik for 2$","2$", Color.YELLOW, Color.BLACK);
        fields[5] = new GUI_Street("Isbutik", "2$", "Du har købt en is til 2$", "2$", Color.YELLOW, Color.BLACK);
        fields[6] = new GUI_Shipping("src/main/Ressources/Pay.png", "Betal 2$!", "2$", "Du skal betale 2$ til Loose Change!", "2$", Color.GREEN, Color.BLACK);
        fields[7] = new GUI_Street("Museum", "2$", "Du har været en tur på museum, og det har kostet dig 2$ for billetten", "2$", Color.BLUE, Color.BLACK);
        fields[8] = new GUI_Street("Bibliotek", "2$", "Du har været en tur på biblioteket, og det har kostet dig 2$ for at få et bibliotekskort", "2$", Color.BLUE, Color.BLACK);
        GUI_Chance chance2 = new GUI_Chance(); chance2.setBackGroundColor(Color.GREEN); chance2.setForeGroundColor(Color.BLACK); fields[9] = chance2;
        fields[10] = new GUI_Street("Skate park", "2$", "Du har været ude og skate og mangler et nyt skatebræt, det koster dig 2$", "2$", Color.ORANGE, Color.BLACK);
        fields[11] = new GUI_Street("Svømmehal", "2$", "Du har været en tur i svømmehallen, og det koster dig 2$.", "2$", Color.ORANGE, Color.BLACK);
        fields[12] = new GUI_Shipping("src/main/Ressources/Railroad.png", "Railroad","2$","Du er landet på togstationen, og får nu en gratis tur med toget.", "2$", Color.GREEN, Color.BLACK);
        fields[13] = new GUI_Street("Spillehal", "2$", "Du har været i spillehallen med dine venner, du har brugt 2$", "2$", Color.GRAY,Color.BLACK);
        fields[14] = new GUI_Street("Biografen", "2$", "Du har været i biografen og set en film, billetten kostede 2$", "2$", Color.GRAY, Color.BLACK);
        fields[15] = new GUI_Shipping("src/main/Ressources/Restrooms.png", "Toilet", "2$", "Du har benyttet dig af et offentligt toilet, og du skal betale 3$ til Loose Change", "2$", Color.GREEN, Color.BLACK);
        fields[16] = new GUI_Street("Legetøjsbutik", "2$", "Du har været ude og købe legetøj for 2$", "2$", Color.CYAN, Color.BLACK);
        fields[17] = new GUI_Street("Dyrehandler", "2$", "Du har købt et nyt kæledyr, det kostede dig 2$", "2$", Color.CYAN, Color.BLACK);
        fields[18] = new GUI_Shipping("src/main/Ressources/dollarSign.png", "Loose Change", "", "Tillykke, du modtager Loose Change!", "2$", Color.GREEN, Color.BLACK);
        fields[19] = new GUI_Street("Bowlinghal", "2$", "Du har været ude og bowle, det kostede dig 2$", "2$", Color.PINK, Color.BLACK);
        fields[20] = new GUI_Street("Zoo", "2$", "Du har været i zoologisk have, billetten kostede 2$", "2$", Color.PINK, Color.BLACK);
        GUI_Chance chance3 = new GUI_Chance(); chance3.setBackGroundColor(Color.GREEN); chance3.setForeGroundColor(Color.BLACK); fields[21] = chance3;
        fields[22] = new GUI_Street("Kongens Have", "2$", "Du har været en tur i parken hvor du købte noget at spise, det kostede 2$", "2$", Color.BLUE, Color.BLACK);
        fields[23] = new GUI_Street("Stadion", "2$", "Du har været ude og se fodbold, det kostede 2$ at komme ind", "2$", Color.BLUE, Color.BLACK);

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
