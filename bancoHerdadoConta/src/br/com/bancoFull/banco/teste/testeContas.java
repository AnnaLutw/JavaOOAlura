package br.com.bancoFull.banco.teste;

import  br.com.bancoFull.banco.modelo.*;

public class testeContas {

	public static void main(String[] args)throws SaldoInsuficienteExcecao {
		//Full Qualifieed Name FQN
		ContaCorrente c1 = new ContaCorrente(111, 111);
		c1.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200);
		
		c1.tranfere(10, cp);
		
		System.out.println(c1.getSaldo());
		System.out.println(cp.getSaldo());
		
		
		

		
	}

}
