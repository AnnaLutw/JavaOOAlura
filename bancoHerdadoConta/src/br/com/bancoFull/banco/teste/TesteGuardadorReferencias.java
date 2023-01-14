package br.com.bancoFull.banco.teste;
import br.com.bancoFull.banco.modelo.*;

public class TesteGuardadorReferencias {

	public static void main(String[] args) {
		
		GuardadorDeContas guarda= new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(22, 11);
		Conta cc2 = new ContaCorrente(22, 20);


		guarda.adiciona(cc);
		guarda.adiciona(cc2);

		
		int tamanho = guarda.getQuantidadeElementos();
		System.out.println(tamanho);
		
		Conta ref = guarda.getReferencia(1);
		System.out.println(ref.getNumero());
	}

}
