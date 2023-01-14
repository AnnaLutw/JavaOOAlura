package bancoHerdado;

public class testeGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Luiz");
		g1.setCpf("8000000");
		g1.setSalario(800);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		
		g1.setSenha(567);
		boolean autenticou = g1.autentica(567);				

		System.out.println(autenticou);
		System.out.println(g1.getBonificacao());
		
	
	}

}
