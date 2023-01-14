package br.com.curso.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUniqueEnconding {

	public static void main(String[] args) throws UnsupportedEncodingException {

		String s = "C";
		
		System.out.println(s.codePointAt(0));
		
		Charset ch = Charset.defaultCharset();		
		System.out.println(ch.displayName());
		
		byte[] bytes = s.getBytes("windows-1252");
		System.out.print(bytes.length + ", ");		
		String sNovo = new String (bytes);
		System.out.println(sNovo + ", ");
		
		
		bytes = s.getBytes("UTF-16");
		System.out.print(bytes.length+ ", ");
		sNovo = new String (bytes);
		System.out.println(sNovo);
		
		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.print(bytes.length + ", ");
		sNovo = new String (bytes);
		System.out.print(sNovo);
	}

}
