package br.com.curso.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {

            //Fluxo de Entrada com Arquivo
    		OutputStream fis = new FileOutputStream("lorem2.txt");	//pega o arquivo em bytes(binario)
            Writer isr = new OutputStreamWriter(fis);	//converte de bytes para string
            BufferedWriter bw = new BufferedWriter(isr);	//lê umas linha
          
            
            bw.write("ana estou testando esse arquivo no curso alura awndjawdw\r\n");
            
     //     bw.newLine();
            bw.newLine();
            bw.write("awdawdawd");
            

            bw.close();
            
	}

}
