public class chanceKortHandler extends Chancekort{
    Chancekort[] kortBunke = new Chancekort[10];
    public chanceKortHandler(){
        Chancekort kort1 = new Chancekort("Ryk 5 felter frem!", "move", 5); kortBunke[0] = kort1;
        Chancekort kort2 = new Chancekort("Modtag $2!", "money", 2); kortBunke[1] = kort2;
        Chancekort kort3 = new Chancekort("Du har har vundet skolelotteriet, du modtager $10!", "money", 10); kortBunke[2] = kort3;
        Chancekort kort4 = new Chancekort("Ryk til start!", "moveToStart", 0); kortBunke[3] = kort4;
        Chancekort kort5 = new Chancekort("Du skal betale $5 i renter!", "money", -5); kortBunke[4] = kort5;
        Chancekort kort6 = new Chancekort("Ryk 3 felter tilbage!", "move", -3); kortBunke[5] = kort6;
        Chancekort kort7 = new Chancekort("Du fandt en tabt flaskebon, du modtager $1", "money", 1); kortBunke[6] = kort7;
        Chancekort kort8 = new Chancekort("Du har glemt at lave lektier, du skal betale $1", "money", -1); kortBunke[7] = kort8;
        Chancekort kort9 = new Chancekort("Ryk 1 felt tilbage", "move", -1); kortBunke[8] = kort9;
        Chancekort kort10 = new Chancekort("Du får en gratis omgang rundt om spillepladen", "move",24); kortBunke[9] = kort10;
    }
    public String toString(){
        String str = "";
        for (int i = 0; i < kortBunke.length; i++) {
            str = str + kortBunke[i].toString();
        }
        return str;
    }
}
