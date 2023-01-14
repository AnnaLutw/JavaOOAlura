package br.com.bancoFull.banco.teste;

import br.com.bancoFull.banco.modelo.*;

public class TesteObject extends Object {

	public static void main(String[] args) {
		
		
		Object cc = new ContaCorrente(22, 78);
		Object cp = new ContaPoupanca(32, 78);
		
		System.out.println(cp);
		System.out.println(cc);

	}

	
}
