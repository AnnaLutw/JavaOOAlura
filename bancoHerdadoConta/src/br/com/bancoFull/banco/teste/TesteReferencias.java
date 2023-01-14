package br.com.bancoFull.banco.teste;

import br.com.bancoFull.banco.modelo.*;

public class TesteReferencias {

	public static void main(String[] args) {
		
		Object[] referencias = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(222, 124);
		ContaPoupanca cc2 = new ContaPoupanca(222, 122);
		
		Cliente cliente = new Cliente();
	
		referencias[0]=cc1;
		referencias[1]=cc2;
		referencias[2]=cliente;
		
		//Conta ref = (ContaPoupanca) referencias[1];
		Object refGererica = (ContaPoupanca) referencias[1];
		
		System.out.println(cc2.getNumero());
		System.out.println(refGererica.hashCode());



		
		
	}

}
