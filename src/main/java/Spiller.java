public class Spiller {

    String name;
    int konto = 35;
    int felt = 0;
    int slag;

    public void roll() {
        Dice dice = new Dice();

        dice.roll1();
        dice.roll2();

        slag = Dice.getSum();
    }

    public int getKonto(){
        return konto;
    }

    public void setKonto(int tal){
        konto += tal;
    }

    public int getFelt(){
        return felt;
    }

    public void setFelt(){
        if ((felt + slag) >= 24) {
            felt = (felt + slag) % 24;}
        else {
            felt += slag;
        }
    }

    public String getName(){
        return name;
    }

    public void setName(String navn){
        name = navn;
    }

}
