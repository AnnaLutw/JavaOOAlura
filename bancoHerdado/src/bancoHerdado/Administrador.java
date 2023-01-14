package bancoHerdado;

public class Administrador extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador;


	@Override
	public double getBonificacao() {
		return 50;
	}
	
	public Administrador() {
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
