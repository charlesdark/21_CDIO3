public class LooseChange {

    int saldo = 0;

    public int getPayed(){
        return saldo;
    }

    public void betalSaldo(int penge){
        saldo -= penge;
    }
}
