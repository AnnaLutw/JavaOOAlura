package bancoHerdado;

public class testeFuncionario {

	public static void main(String[] args) {

		Gerente ana = new Gerente();
		ana.setNome("Ana Luiza");
		ana.setCpf("000-555");
		ana.setSalario(1000);
		
		System.out.println("Nome: "+ana.getNome());
		System.out.println("Salario: "+ana.getSalario());
		System.out.println("Bonus: "+ana.getBonificacao()+ "\n");
		
		EditorVideo joao = new EditorVideo();
		joao.setSalario(1500);
		joao.setNome("Joao lindao");
		
		System.out.println("Nome: "+joao.getNome());
		System.out.println("Salario: "+joao.getSalario());
		System.out.println("Bonus: "+joao.getBonificacao()+ "\n");
		
		
	}

}
