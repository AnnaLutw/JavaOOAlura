package br.com.bancoFull.banco.teste.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bancoFull.banco.modelo.Cliente;
import br.com.bancoFull.banco.modelo.ContaCorrente;

public class testeSelializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Cliente cliente = new Cliente();
		cliente.setNome("ana");
		cliente.setProfissao("dev");
		cliente.setCpf("33423423");
		
		ContaCorrente cc = new ContaCorrente(22, 233);
		cc.setTitular(cliente);
		cc.deposita(1200);
		
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin")); //Serialização 
		oos.writeObject(cc);
		oos.close();
		
		

	}

}
