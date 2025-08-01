public class ContaCorrente extends Conta{

    private static int SEQUENCIAL = 0;

    public ContaCorrente() {
        super.agencia = Conta.AGENDA_PADRAO;
        super.numero = SEQUENCIAL++;
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("==========================================");
        System.out.println("Extrato da conta Corrente " + super.agencia);
        System.out.println("Extrato da conta Corrente " + super.numero);
        System.out.println("Extrato da conta Corrente " + super.saldo);
        System.out.println("==========================================");

    }

}
