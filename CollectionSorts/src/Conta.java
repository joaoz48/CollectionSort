public class Conta implements Comparable<Conta>{
    private String dono;
    private int saldo;

    public Conta(int saldo, String dono){
        this.saldo = saldo;
        this.dono = dono;
    }

    public String getDono() {
        return dono;
    }

    public int getSaldo() {
        return saldo;
    }

    /*
    //Compare feito pelo saldo
    @Override
    public int compareTo(Conta o) {
        return Integer.compare(this.saldo,o.saldo);
    }
     */

    //Compare feito pelo dono
    @Override
    public int compareTo(Conta o) {
        return dono.compareTo(o.dono);
    }
}
