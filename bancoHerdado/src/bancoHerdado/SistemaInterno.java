package bancoHerdado;

public class SistemaInterno  {
	
	private int senha = 2222;
	
	public void autentica(Autenticavel g) {
		boolean autenticou =g.autentica(this.senha);
		if(autenticou) {
			System.out.println("Acesso permitido");
		}
		else {
			System.out.println("Acesso negado");
		}
	}

}
