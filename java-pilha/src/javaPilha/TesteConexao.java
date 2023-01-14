package javaPilha;


public class TesteConexao {
	
	public static void main(String[] args) {
	
		try(Conexao con = new Conexao()){
			con.leDados();
		}catch(IllegalStateException ex) {
			System.out.println("Erro");
		}
		
		
		
//		Conexao c = null;
//		try {
//			c = new Conexao();
//			c.leDados();
//			
//		}
//		catch(IllegalStateException ex) {
//			System.out.println("Erro de conexao");
//			
//		}finally {
//			System.out.println("finally");
//			if(c != null) {
//				c.close();
//
//			}
//
//		}
	}
}