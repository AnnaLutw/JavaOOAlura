package pacote;

public enum Prioridade {

	MIN(7),NORMAL(10),MAX(11);
	
	private int valor;
	
	Prioridade(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}
}
