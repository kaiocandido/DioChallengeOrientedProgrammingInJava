public interface IntConta {
    void sacar(double valor);
    
    void transferir(double valor, Conta numConta);

    void depositar(double valor);

    public void imprimirExtrato();
}
