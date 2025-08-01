public class ContaPoupanca extends Conta {

    private static int SEQUENCIAL = 10;
    public ContaPoupanca() {
        super.agencia = Conta.AGENDA_PADRAO;
        super.numero = SEQUENCIAL++;
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("==========================================");
        System.out.println("Extrato da conta Poupança " + super.agencia);
        System.out.println("Extrato da conta Poupança " + super.numero);
        System.out.println("Extrato da conta Poupança " + super.saldo);
        System.out.println("==========================================");
    }
}
