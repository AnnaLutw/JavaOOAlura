package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		
		String aula1 = "conhwecendo mais de listas";
		String aula2 = "Modelando a classe aula";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		ArrayList<String> aulas = new ArrayList<>();
		
		aulas.add(aula1);
		aulas.add(aula3);
		aulas.add(aula2);
		
		//System.out.println(aulas);
		
		aulas.remove(0);
		
		//System.out.println(aulas);
		
		/*
		 * for (String aula : aulas) { System.out.println("Aula : " +aula);
		 * 
		 * }
		 */
		
		//String primeiraAula = aulas.get(0);
		//System.out.println("A primeira aula �: " + primeiraAula);
		
		aulas.forEach(aula -> {System.out.println("Percorrendo: " + aula);});
		
		aulas.add("Aumentando nosso conhecimento");
		System.out.println("Antes de ordenar \n" + aulas);
		Collections.sort(aulas);
		System.out.println("Depois de ordenar \n" +aulas);
		
		
		
	}

}
