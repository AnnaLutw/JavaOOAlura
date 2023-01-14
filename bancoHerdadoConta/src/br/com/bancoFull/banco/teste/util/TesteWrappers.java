package br.com.bancoFull.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrappers {

	public static void main(String[] args) {
		
		Integer idadeRef =  Integer.valueOf(29); //autoboxing
		System.out.println(idadeRef.intValue());	//unboxing
		
		
		Double dRef = Double.valueOf(3.2);	//autoboxing
		System.out.println(dRef.doubleValue()); // unboxing
		
		Boolean bRef = Boolean.TRUE;	//autoboxing
		System.out.println(bRef.booleanValue());	//unboxing
		
		Number numero = Double.valueOf(29);
		System.out.println(numero);
		
		List<Number> lista = new ArrayList<>();
		lista.add(20);
		lista.add(60);
		
	}

}
