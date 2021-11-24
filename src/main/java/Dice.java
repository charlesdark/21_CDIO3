import java.util.Random;

class Dice {

    static int roll1;
    Random rn = new Random();

    public void roll1() {
        roll1 = rn.nextInt(6) + 1;
    }
    public static int getDots1() {
        return roll1;
    }


}
