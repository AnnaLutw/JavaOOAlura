package br.com.alura;

import java.util.Collection;
import java.util.HashSet;


public class TestaAlunos {
	
	public static void main(String[] args) {
		
		Collection<String> alunos = new HashSet<>();
		
		alunos.add("Ana Luiza");
		alunos.add("Ricardo");
		alunos.add("Joao Souza");
		alunos.add("Não sei quem");
		alunos.add("Julia medeiros");

		System.out.println(alunos);
		System.out.println(alunos.size());
		
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		boolean pauloMatriculado = alunos.contains("Paulo silveira");
		System.out.println(pauloMatriculado);
	}
}
