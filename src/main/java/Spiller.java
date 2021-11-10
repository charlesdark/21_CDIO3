public class Spiller {

    String name;
    int konto = 1000;
    String felt;

    public void roll() {
        Dice dice = new Dice();

        dice.roll1();
        dice.roll2();
/*
        switch (Dice.getSum()) {
            case 2:
                konto += Felter.Tower();
                felt = FelterDansk.tower();
                break;
            case 3:
                konto += Felter.Crater();
                felt = FelterDansk.crater();
                break;
            case 4:
                konto += Felter.Palace_gates();
                felt = FelterDansk.palace_gates();
                break;
            case 5:
                konto += Felter.Cold_desert();
                felt = FelterDansk.cold_desert();
                break;
            case 6:
                konto += Felter.Walled_city();
                felt = FelterDansk.walled_city();
                break;
            case 7:
                konto += Felter.Monastery();
                felt = FelterDansk.monastery();
                break;
            case 8:
                konto += Felter.Black_cave();
                felt = FelterDansk.black_cave();
                break;
            case 9:
                konto += Felter.Huts_in_the_mountain();
                felt = FelterDansk.huts_in_the_mountain();
                break;
            case 10:
                konto += Felter.The_werewall();
                felt = FelterDansk.the_werewall();
                break;
            case 11:
                konto += Felter.The_pit();
                felt = FelterDansk.the_pit();
                break;
            case 12:
                konto += Felter.Goldmine();
                felt = FelterDansk.goldmine();
                break;
        }*/
    }

}
