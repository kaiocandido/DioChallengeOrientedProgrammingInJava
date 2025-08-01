public class ContaCorrente extends Conta{

    private static int SEQUENCIAL = 0;

    public ContaCorrente() {
        super.agencia = Conta.AGENDA_PADRAO;
        super.numero = SEQUENCIAL++;
    }


}
