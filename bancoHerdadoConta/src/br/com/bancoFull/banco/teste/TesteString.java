package br.com.bancoFull.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		
		String nome = "Feijao"; //object Literal
		
		char c = nome.charAt(2);	 //pega o caracter escolhido por indice	
		System.out.println(c);
		
		int pos = nome.indexOf("jao"); // indexOf procura a parte escolhida no parametro
				System.out.println(pos);
		
		String sub =nome.substring(3); //escreve o nome a partir do indice declarado
		System.out.println(sub);
		
		System.out.println(nome.length()); //total da string
		
		
		for(int i=0; i<nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		
		String vazio = " ";
		String outroVazio = vazio.trim();	//tiro os espaços com o trim
		System.out.println(outroVazio.isEmpty()); //verifico se a string está vazia
		System.out.println(vazio.contains("jao")); //verifica se contem essa subtring na string
	}

}
