public class Main {

    public static void main(String[] args) {
        Cliente Adriano = new Cliente();
        Adriano.setNome("Adriano");

        Conta cc = new ContaCorrente(Adriano);
        Conta poupanca = new ContaPoupanca(Adriano);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}