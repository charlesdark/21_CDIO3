public class LooseChange {
    int Saldo = 0;

    public int getPayed(){
        return Saldo;
    }
    public void betalSaldo(int penge){
        Saldo -= penge;
    }
}
