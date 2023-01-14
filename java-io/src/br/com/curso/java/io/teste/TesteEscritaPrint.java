package br.com.curso.java.io.teste;

import java.io.IOException;
//import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrint {

    public static void main(String[] args) throws IOException {

            //Fluxo de Entrada com Arquivo
			/*
			 * InputStream fis = new FileInputStream("lorem.txt"); Reader isr = new
			 * InputStreamReader(fis); BufferedReader br = new BufferedReader(isr); String
			 * linha = br.readLine();
			 */
            
           
            //BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
    	
    		//PrintStream ps = new PrintStream("lorem2.txt");
    	
    		PrintWriter ps = new PrintWriter("lorem2.txt");
            
    		ps.println("hahahahahahahahahahah");
    		ps.println();
    		ps.println("adawdwadawd");
    		
		
            ps.close();
	}

}
