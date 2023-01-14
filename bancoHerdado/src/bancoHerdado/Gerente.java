package bancoHerdado;
//Gerente É um funcionario então ele herda da Classe Funcionario com "extends", E ASSINA O CONTRATO
//AUTENTICAVEL IMPLPLEMENTANDO

public class Gerente extends Funcionario implements Autenticavel{
		
	private AutenticacaoUtil autenticador;

	
	public double getBonificacao() {
		return  super.getSalario() ;		
	}

	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.autentica(senha);

	}	
	
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);

	}

	
	
}