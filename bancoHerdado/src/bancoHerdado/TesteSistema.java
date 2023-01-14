package bancoHerdado;

public class TesteSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(2222);
			
		Administrador ad = new Administrador();
		ad.setSenha(245);
		
		Cliente c1 = new Cliente();
		c1.setSenha(2222);
		SistemaInterno si = new SistemaInterno();
		
		si.autentica(g);
		si.autentica(ad);
		si.autentica(c1);
			
		
	}

}
