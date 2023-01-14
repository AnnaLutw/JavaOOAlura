package br.com.bancoFull.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {
	
	//chama o construtor da classe mãe ondee está os parametros
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	public void saca(double valor)throws SaldoInsuficienteExcecao {
		double valorASacar = valor + 0.2;
		 super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo  += valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo* 0.01;
	}
	
	@Override
	public String toString() {
		return "Conta Corrente> " +  super.toString();
	}
}
