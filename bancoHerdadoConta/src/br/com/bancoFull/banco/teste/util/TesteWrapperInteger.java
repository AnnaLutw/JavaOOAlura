package br.com.bancoFull.banco.teste.util;


public class TesteWrapperInteger {

	public static void main(String[] args) {
		
	
		Integer idadeRef =  Integer.valueOf(29);
		System.out.println(idadeRef.doubleValue());

		System.out.println(Integer.BYTES);
		
		
		int valor = idadeRef.intValue();
		
		System.out.println(valor);
		
		String s = args[0];
		
		//Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		System.out.println(numero);
		
		
	}

}
