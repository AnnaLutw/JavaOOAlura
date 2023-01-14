package bancoEncapsulado;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("o total é: "+ Conta.total);
		this.agencia = agencia;
		this.numero= numero;
		
	}
	
	public static int getTotal() {
		return Conta.total;
	}

	public void deposita(double  valor) {
		
		this.saldo += valor;
	}
	
	public boolean saca(double valor ) {
		
		if(this.saldo >= valor){
			this.saldo -= valor;
			return true;
		}
		else {
			return false;
		}
		
	}
	public boolean tranfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -=valor;
			destino.deposita(valor);
			return true;
		}
		else {
			return false;
		}
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
	/*public void setNumero(int novoNumero){
		if(numero <= 0) {
			System.out.println("Não pode valores negativos");
			return;
		}
		this.numero = novoNumero;
	}*/
	public int getAgencia() {
		
		return agencia;
	}
	/*public void setAgencia(int novaAgencia) {
		if(agencia <=0) {
			System.out.println("Não pode valores negativos");
			return;
		}
		this.agencia = novaAgencia;
	}*/
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
}
