package br.com.alura;

import java.util.Iterator;
import java.util.Set;


public class TestaCursoAluno {

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

		/*
		 * javaColec.getAlunos().forEach(a ->{ System.out.println(a); });
		 */
		
		Set<Aluno> alunos = javaColec.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		
		while(iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
		
		
		
		
		System.out.println("Aluno esta matriculado? " + javaColec.estaMatriculado(a1));
		
		
		Aluno joao = new Aluno("Joao medeiros", 123);
		
		System.out.println(javaColec.estaMatriculado(joao));
				
		
		System.out.println("São iguais?"+a1.equals(joao));
		System.out.println(a1.hashCode()==joao.hashCode());
	}

}
