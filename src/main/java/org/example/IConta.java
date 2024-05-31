package org.example;

public interface IConta {

	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, Conta contaDestino);
	
	void imprimirExtrato();
}

/* 
 * Aquilo que só seu Pai sabe é private, 
 * o que ele contou somente para familia e protected 
 * e o que seus vizinhos sabem é public
*/
