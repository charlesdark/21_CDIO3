import gui_fields.*;
import java.awt.*;

public class GameBoard {
    GUI_Field[] fields = new GUI_Field[24];
    Felter felter = new Felter();
    public GameBoard() {
        fields[0] = new GUI_Start("GO!", "Du modtager 2$", "Du har passeret start.", Color.GREEN, Color.BLACK);
        fields[1] = new GUI_Street("Burger Bar", "$1", "Du har været ude og købe en burger til aftensmad, den koster dig 2$", "2$", Color.RED, Color.BLACK);
        fields[2] = new GUI_Street("Pizza bar", "$1", "Du har været ude og købe en pizza til aftensmad, den koster dig 2$", "2$", Color.RED, Color.BLACK);
        GUI_Chance chance = new GUI_Chance();chance.setBackGroundColor(Color.GREEN);chance.setForeGroundColor(Color.BLACK);fields[3] = chance;
        fields[4] = new GUI_Street("Slikbutik", "$1", "Du har blandet slik for 2$", "2$", Color.YELLOW, Color.BLACK);
        fields[5] = new GUI_Street("Isbutik", "$1", "Du har købt en is til 2$", "2$", Color.YELLOW, Color.BLACK);
        fields[6] = new GUI_Shipping("src/main/Ressources/Pay.png", "På besøg!", "2$", "Du skal betale 2$ til Loose Change!", "2$", Color.GREEN, Color.BLACK);
        fields[7] = new GUI_Street("Museum", "$2", "Du har været en tur på museum, og det har kostet dig 2$ for billetten", "2$", Color.BLUE, Color.BLACK);
        fields[8] = new GUI_Street("Bibliotek", "$2", "Du har været en tur på biblioteket, og det har kostet dig 2$ for at få et bibliotekskort", "2$", Color.BLUE, Color.BLACK);
        GUI_Chance chance2 = new GUI_Chance();chance2.setBackGroundColor(Color.GREEN);chance2.setForeGroundColor(Color.BLACK);fields[9] = chance2;
        fields[10] = new GUI_Street("Skate park", "$2", "Du har været ude og skate og mangler et nyt skatebræt, det koster dig 2$", "2$", Color.ORANGE, Color.BLACK);
        fields[11] = new GUI_Street("Svømmehal", "$2", "Du har været en tur i svømmehallen, og det koster dig 2$.", "2$", Color.ORANGE, Color.BLACK);
        fields[12] = new GUI_Shipping("src/main/Ressources/Railroad.png", "Gratis Parkering", "2$", "Du er landet på togstationen, og får nu en gratis tur med toget.", "2$", Color.GREEN, Color.BLACK);
        fields[13] = new GUI_Street("Spillehal", "$3", "Du har været i spillehallen med dine venner, du har brugt 2$", "2$", Color.GRAY, Color.BLACK);
        fields[14] = new GUI_Street("Biografen", "$3", "Du har været i biografen og set en film, billetten kostede 2$", "2$", Color.GRAY, Color.BLACK);
        GUI_Chance chance3 = new GUI_Chance();chance3.setBackGroundColor(Color.GREEN);chance3.setForeGroundColor(Color.BLACK);fields[15] = chance3;
        fields[16] = new GUI_Street("Legetøjsbutik", "$3", "Du har været ude og købe legetøj for 2$", "2$", Color.CYAN, Color.BLACK);
        fields[17] = new GUI_Street("Dyrehandler", "$3", "Du har købt et nyt kæledyr, det kostede dig 2$", "2$", Color.CYAN, Color.BLACK);
        fields[18] = new GUI_Shipping("src/main/Ressources/dollarSign.png", "Gå i fængsel!", "", "Tillykke, du modtager Loose Change!", "2$", Color.GREEN, Color.BLACK);
        fields[19] = new GUI_Street("Bowlinghal", "$4", "Du har været ude og bowle, det kostede dig 2$", "2$", Color.DARK_GRAY, Color.BLACK);
        fields[20] = new GUI_Street("Zoo", "$4", "Du har været i zoologisk have, billetten kostede 2$", "2$", Color.DARK_GRAY, Color.BLACK);
        GUI_Chance chance4 = new GUI_Chance();chance4.setBackGroundColor(Color.GREEN);chance4.setForeGroundColor(Color.BLACK);fields[21] = chance4;
        fields[22] = new GUI_Street("Kongens Have", "$5", "Du har været en tur i parken hvor du købte noget at spise, det kostede 2$", "2$", Color.BLUE, Color.BLACK);
        fields[23] = new GUI_Street("Stadion", "$5", "Du har været ude og se fodbold, det kostede 2$ at komme ind", "2$", Color.BLUE, Color.BLACK);
    }
    public String toString(){
        String str = "";
        for(int i = 0; i < fields.length; i++){
            str = str + fields[i].toString();
        }
        return str;
    }
}
