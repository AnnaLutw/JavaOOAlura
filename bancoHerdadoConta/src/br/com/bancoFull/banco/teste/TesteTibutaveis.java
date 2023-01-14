package br.com.bancoFull.banco.teste;

import br.com.bancoFull.banco.modelo.*;

public class TesteTibutaveis {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(1000);
		
		SeguroDeVida ss = new SeguroDeVida();
		CalculaImposto calc = new CalculaImposto();
		calc.registra(cc);
		calc.registra(ss);
		
		System.out.println(calc.getTotalImposto());
	}

}
