package br.com.bancoFull.banco.teste;

public class TesteArrayPrimitivo {

	public static void main(String[] args) {

		//Array = []
		int[] idades = new int [5];
		
		
		idades[0] = 29;
		idades[1] = 67;
		idades[2] = 87;
		idades[3] = 34;
		idades[4] = 45;

		

		int idade5 = idades[4];
		
		System.out.println(idade5);
		
		System.out.println(idades.length);
	}

}
