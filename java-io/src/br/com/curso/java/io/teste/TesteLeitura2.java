package br.com.curso.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new File("contas.csv"), "UTF-8");
				
		while(sc.hasNextLine()) {
			String linha = sc.nextLine();
			//System.out.println(linha);
			
			Scanner ln = new Scanner(linha);
            ln.useLocale(Locale.US);

			ln.useDelimiter(",");
			
			String tipoConta = ln.next();
			int agencia = ln.nextInt();
			int numero = ln.nextInt();
			String titular = ln.next();
			double saldo = ln.nextDouble();

			
			System.out.format(new Locale("pt", "BR"), "%s - %04d - %08d, %20s: %08.2f %n", 
					tipoConta, agencia, numero, titular, saldo);			
			

			//String[] valores =linha.split(",");
			//System.out.println((valores[3]));
			ln.close();

		}
		sc.close();
	}

}
