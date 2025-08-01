public class ContaPoupanca extends Conta {

    private static int SEQUENCIAL = 10;
    public ContaPoupanca() {
        super.agencia = Conta.AGENDA_PADRAO;
        super.numero = SEQUENCIAL++;
    }
}
