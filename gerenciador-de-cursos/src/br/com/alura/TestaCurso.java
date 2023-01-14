package br.com.alura;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColec = new Curso("Dominando Colections", "Paulo");

		javaColec.adiciona(new Aula("Trabalhando com array list", 21));
		javaColec.adiciona(new Aula("Mudando lita", 23));
		javaColec.adiciona(new Aula("Modificando Curso", 16));

		System.out.println(javaColec.getAulas());

	}
}
