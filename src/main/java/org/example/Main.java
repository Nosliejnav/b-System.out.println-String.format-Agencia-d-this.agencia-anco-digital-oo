package org.example;

public class Main {

    public static void main(String[] args) {
        Cliente vanja = new Cliente();
        vanja.setNome("Vanja");


        Conta cc = new ContaCorrente(vanja);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(vanja);

        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
