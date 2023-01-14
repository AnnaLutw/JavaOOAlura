package bancoHerdado;

public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setSalario(1500);		
		EditorVideo f = new EditorVideo();
		f.setSalario(2000);
		EditorVideo juca = new EditorVideo();
		juca.setSalario(3000);

		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(f);
		controle.registra(g1);
		controle.registra(juca);

		System.out.println("Bonificação: "+g1.getBonificacao());
		System.out.println("Bonificação: "+f.getBonificacao());			
		System.out.println("Bonificação: "+juca.getBonificacao());

	}

}
