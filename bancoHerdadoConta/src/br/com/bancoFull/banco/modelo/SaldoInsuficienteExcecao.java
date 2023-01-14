package br.com.bancoFull.banco.modelo;

public class SaldoInsuficienteExcecao extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SaldoInsuficienteExcecao(String msg) {
		super(msg);
	}
}
