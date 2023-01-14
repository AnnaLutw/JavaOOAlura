package br.com.bancoFull.banco.teste.util;

import java.util.ArrayList;

import br.com.bancoFull.banco.modelo.Conta;
import br.com.bancoFull.banco.modelo.ContaCorrente;

public class testeArrayList {

	public static void main(String[] args) {

		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22, 11);
		Conta cc2 = new ContaCorrente(22, 20);
		
		
		lista.add(cc);
		lista.add(cc2);
		
		System.out.println("Tamanho; " + lista.size());
		
		Conta ref = lista.get(0);
		
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		System.out.println("Tamanho; " + lista.size());
		
		Conta c3 = new ContaCorrente(22, 11);
		Conta cc4 = new ContaCorrente(22, 20);

		lista.add(c3);
		lista.add(cc4);
		
		for(int i =0; i< lista.size();i++) {
			System.out.println(lista.get(i));
		}
		System.out.println("----------------");
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}

	}

}
