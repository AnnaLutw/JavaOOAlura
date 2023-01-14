package javaTeste;

public class criandoConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("primeira conta tem: " + primeiraConta.saldo + " de saldo");
		System.out.println("segunda conta tem: " + segundaConta.saldo + " de saldo");

	}

}
