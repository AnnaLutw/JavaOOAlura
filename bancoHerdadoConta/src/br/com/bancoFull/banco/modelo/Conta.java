package br.com.bancoFull.banco.modelo;

import java.io.Serializable;

/**
 * Classe representa a moldura de uma conta
 * @author Ana Luizas
 *@version 0.1
 */

public abstract class Conta extends Object implements Comparable<Conta>, Serializable {
	
	protected double saldo;
	private int agencia;
	private int numero;
	private transient Cliente titular;
	private static int total=0;
	
/**
 * Construtor para inicializar o objeto Conta a partidar da agencia e numero
 * @param agencia
 * @param numero
 */
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("o total é: "+ Conta.total);
		this.agencia = agencia;
		this.numero= numero;
		
	}
	
	public static int getTotal() {
		return Conta.total;
	}

	public abstract void deposita(double valor);
	
/**
 * Valor precisa ser maior do que o saldo
 * 
 * @param valor
 * @throws SaldoInsuficienteExcecao
 */
	public void saca(double valor ) throws SaldoInsuficienteExcecao{
		
		if(this.saldo < valor){
			throw new SaldoInsuficienteExcecao("Saldo: "+ this.saldo + ",Valor: "+ valor);
		}
		this.saldo -= valor;

	}
	public void tranfere(double valor, Conta destino) throws SaldoInsuficienteExcecao{
		this.saca(valor);
		destino.deposita(valor);
		}					 
		
	
	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public int getNumero() {
		return numero;
	}
	
	public int getAgencia() {
		
		return agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	@Override
	public String toString() {
		return  "Numero " + this.numero +  " Agencia: "+ this.agencia;
	}
	@Override
	public boolean equals(Object ref) {
		
		Conta outra = (Conta)ref;
		
		if(this.agencia != outra.agencia) {
			return false;
		}
		if(this.numero != outra.numero) {
			return false;
		}
		return true;
	}
	
	@Override
	public int compareTo(Conta outra) {		
		return Double.compare(this.saldo, outra.saldo);
	}
	
}
