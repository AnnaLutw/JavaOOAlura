package br.com.bancoFull.banco.teste;
import br.com.bancoFull.banco.modelo.*;

public class TesteSaca {

	public static void main(String[] args) {
		Conta c = new ContaCorrente(123, 321);
		
		c.deposita(200.0);
		try {
			c.saca(201);
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
				
		System.out.println(c.getSaldo());
	}

}
