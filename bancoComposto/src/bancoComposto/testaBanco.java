package bancoComposto;

public class testaBanco {

	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "222.222.222-45";
		paulo.profissao = "medico";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.setSaldo(300);
		contaDoPaulo.deposita(100);
		//associa o cliente a conta
		contaDoPaulo.titular = paulo;
		System.out.println("nome: " + contaDoPaulo.titular.nome);
		System.out.println("profissão: " + contaDoPaulo.titular.profissao);
		System.out.println("cpf: " + contaDoPaulo.titular.cpf );
		System.out.println("saldo: "+ contaDoPaulo.getSaldo()+"\n");
		
		//também posso fazer asso,
		Conta contaMarcela = new Conta();
		contaMarcela.titular = new Cliente();
		contaMarcela.setSaldo (500);
		contaMarcela.titular.nome = "Marcelinha";
		contaMarcela.titular.cpf = "00.000.000-56";
		contaMarcela.titular.profissao = "programadora";
		System.out.println("nome: " + contaMarcela.titular.nome);
		System.out.println("profissão: " + contaMarcela.titular.profissao);
		System.out.println("cpf: " + contaMarcela.titular.cpf);
		System.out.println("saldo: "+ contaMarcela.getSaldo()+"\n");

	}

}
