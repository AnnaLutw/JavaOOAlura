package java8;

import java.util.*;

class Curso {
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
    
    
}

public class EemploCursos {

	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comparing(Curso:: getAlunos));		
		//cursos.forEach(c-> System.out.println(c.getNome()));
		
		int sum = cursos.stream()
			.filter(c-> c.getAlunos()>= 50) //USANDO LAMBDA
			.mapToInt(Curso:: getAlunos)  // dado um curso devolve o numero de alunos do curso USANDO REFERENCE
			.sum();	//somando todos os alunos em cursos com mais de 100 alunos
		
			System.out.println(sum);
			
			//forEach(System.out::println) total de alunos de cada curso a mais de 100 alunos USANDO REFERENCE
		
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.findAny()
			.ifPresent(c -> System.out.println(c.getNome()));
		
	}

}
