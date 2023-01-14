package br.com.alura;

public class TesteBuscarAlunos {

	public static void main(String[] args) {
		
		Curso javaColec = new Curso("Dominando Colections", "Paulo");

		javaColec.adiciona(new Aula("Trabalhando com array list", 21));
		javaColec.adiciona(new Aula("Mudando lita", 23));
		javaColec.adiciona(new Aula("Modificando Curso", 16));
		
		
		Aluno a1 = new Aluno("Joao medeiros", 123);
		Aluno a2 = new Aluno("Pedro Henrique", 234);
		Aluno a3 = new Aluno("Mauricio aninche", 345);
		
		javaColec.matricula(a1);
		javaColec.matricula(a2);
		javaColec.matricula(a3);
		
		Aluno aluno = javaColec.buscaMatriculado(234);
		System.out.println(aluno);
	}

}
