package br.com.Aluno.banco;

import br.com.bancoFull.banco.modelo.ContaCorrente;
import br.com.bancoFull.banco.modelo.Conta;


public class TesteBiblioteca {
	
	public static void main(String [] args) {
	
	Conta c = new ContaCorrente(123, 454);
	
	c.deposita(200);
	System.out.println(c.getSaldo());
	
	}
}