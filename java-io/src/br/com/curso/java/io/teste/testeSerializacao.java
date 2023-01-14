package br.com.curso.java.io.teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class testeSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//String nome = "Ana Luiza";
		
		/*
		 * ObjectOutputStream oos = new ObjectOutputStream(new
		 * FileOutputStream("objeto.bin"));						//Serializa��o
		 * 
		 * oos.writeObject(nome); oos.close();
		 */
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		String nome = (String) ois.readObject();			//Desserializa��o
		ois.close();
		System.out.println(nome);
	}

}
