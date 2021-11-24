public class chanceKortHandler extends Chancekort{
    Chancekort[] kortBunke = new Chancekort[6];
    public chanceKortHandler(){
        Chancekort kort1 = new Chancekort("Ryk 5 felter frem!", "move", 5); kortBunke[0] = kort1;
        Chancekort kort2 = new Chancekort("Modtag $10!", "money", 10); kortBunke[1] = kort2;
        Chancekort kort3 = new Chancekort("Du har har vundet lotto, du modtager $50!", "money", 50); kortBunke[2] = kort3;
        Chancekort kort4 = new Chancekort("Ryk til start!", "moveToStart", 0); kortBunke[3] = kort4;
        Chancekort kort5 = new Chancekort("Du skal betale $5 i renter!", "money", 5); kortBunke[4] = kort5;
        Chancekort kort6 = new Chancekort("Du skal rykke i fængsel!", "move", 10); kortBunke[5] = kort6;
    }
    public String toString(){
        String str = "";
        for (int i = 0; i < kortBunke.length; i++) {
            str = str + kortBunke[i].toString();
        }
        return str;
    }
}
