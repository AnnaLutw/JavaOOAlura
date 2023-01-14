package br.com.bancoFull.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

import br.com.bancoFull.banco.modelo.Conta;
import br.com.bancoFull.banco.modelo.ContaCorrente;

public class testeArrayEquals {

	public static void main(String[] args) {

		List<Conta> lista = new ArrayList<Conta>();
		
		
		Conta cc = new ContaCorrente(22, 11);
		Conta cc2 = new ContaCorrente(22, 20);
		Conta cc3 = new ContaCorrente(22, 20);

		
		lista.add(cc);
		lista.add(cc2);

		
		boolean existe = lista.contains(cc3);
		System.out.println("já existe? " + existe);
		
		boolean igual = cc2.equals(cc3);
		System.out.println(igual);

		

		for(Conta conta : lista) {
			System.out.println(conta);
		}

	}

}
