package javaTeste;

public class testaMetodo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.saldo=100;
		conta.deposita(100);
		System.out.println(conta.saldo);
		
		
		boolean concluido = conta.saca(30);
		System.out.println(concluido);
		System.out.println(conta.saldo);
		
		Conta contaMarcela = new Conta();
		contaMarcela.deposita(1000);
		System.out.println("\nConta Marcela saldo: "+ contaMarcela.saldo);
		
		if(contaMarcela.tranfere(300, conta)) {
			System.out.println("tranferencia feita com Sucesso!\n");
			System.out.println("conta Marcela tranfere 300 fica com: " + contaMarcela.saldo);
			System.out.println("conta qualquer recebe 300 fica com: " + conta.saldo);


		}
		else {
			System.out.println("Saldo Insuficiente!");
			
		}
		
		
	}

}
