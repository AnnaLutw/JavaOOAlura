package bancoHerdado;

public class Cliente implements Autenticavel{

	private AutenticacaoUtil autenticador;
	
	public Cliente() {
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
