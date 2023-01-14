package br.com.bancoFull.banco.modelo;

public class ContaPoupanca extends Conta {
	
	//chama o construtor da classe mãe ondee está os parametros
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	public void deposita(double valor) {
		super.saldo  += valor;
	}
	public void saca(double valor) throws SaldoInsuficienteExcecao{
		double valorASacar = valor + 0.2;
		 super.saca(valorASacar);
	}
	@Override
	public String toString() {
		return  "Conta Poupança> "+ super.toString();
	}

}
