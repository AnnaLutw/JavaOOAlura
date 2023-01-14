package br.com.curso.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteEscrita {

    public static void main(String[] args) throws IOException {

            //Fluxo de Entrada com Arquivo
    		InputStream fis = new FileInputStream("lorem.txt");	//pega o arquivo em bits
            Reader isr = new InputStreamReader(fis);	//converte de bits para string
            BufferedReader br = new BufferedReader(isr);	//lê umas linha
            String linha = br.readLine();

            
            while(linha != null) {            	
                System.out.println(linha);
                linha = br.readLine();

            }

            br.close();
            
	}

}
