package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		Curso javaColec = new Curso("Dominando Colections", "Paulo");

		javaColec.adiciona(new Aula("Trabalhando com array list", 21));
		javaColec.adiciona(new Aula("Mudando lita", 23));
		javaColec.adiciona(new Aula("Modificando Curso", 16));

		List<Aula> aulasImutaveis = javaColec.getAulas();

		System.out.println(aulasImutaveis);

		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		Collections.sort(aulas);
		System.out.println(aulas);

		System.out.println(javaColec.getTempoTotal());

		System.out.println(javaColec);

	}
}
