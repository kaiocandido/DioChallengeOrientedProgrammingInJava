public abstract class Conta implements IntConta{
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected static final int AGENDA_PADRAO = 0;

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void transferir(double valor, int numConta) {

    }

    @Override
    public void depositar(double valor) {

    }
}
