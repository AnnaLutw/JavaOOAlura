package br.com.curso.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

    public static void main(String[] args) throws IOException {

            //Fluxo de Entrada com Arquivo
			/*
			 * InputStream fis = new FileInputStream("lorem.txt"); Reader isr = new
			 * InputStreamReader(fis); BufferedReader br = new BufferedReader(isr); String
			 * linha = br.readLine();
			 */
            
           
            BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
            
            bw.write("teste filwww teswadawdwao filee writerrr");
            bw.newLine();
            bw.newLine();

            bw.write("adawdwadawd");
            
            bw.close();
            
	}

}
