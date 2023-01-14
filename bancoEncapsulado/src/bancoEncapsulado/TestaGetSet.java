package bancoEncapsulado;

public class TestaGetSet {

	public static void main(String[] args) {
		Conta conta = new Conta(5, 900);
		Cliente ana = new Cliente();			
		conta.setTitular(ana);
		
		Conta conta2 = new Conta(5, 5666);		
		Cliente joao = new Cliente();
		conta2.setTitular(joao);
		
		System.out.println(conta2.getNumero());
		System.out.println("Agencia: " +conta2.getAgencia());
		conta.setSaldo(100);
		conta.deposita(500);
		conta.saca(300);

		System.out.println(conta.getSaldo());
		
		ana.setNome("Ana sousa");
		ana.setCpf("0000-8888");
		ana.setProfissao("Programadora");
		
		System.out.println("Nome: "+ conta.getTitular().getNome());
		System.out.println("CPF: "+ conta.getTitular().getCpf());
		System.out.println("Profissão: "+ conta.getTitular().getProfissao());

		System.out.println("Total de contas: " + Conta.getTotal());
		
	}
}