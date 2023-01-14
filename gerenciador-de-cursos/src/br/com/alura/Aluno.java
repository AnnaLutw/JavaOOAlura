package br.com.alura;

public class Aluno {
	
	private String nome;
	private int Matricula;
	
	public Aluno(String nome, int matricula) {
		super();
		this.nome = nome;
		Matricula = matricula;
	}

	public String getNome() {
		if(nome == null) {
			throw new NullPointerException("Nome invalido");
		}
		return nome;
	}

	public int getMatricula() {
		return Matricula;
	}
	
	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", matricula: " + this.Matricula + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		
		return this.nome.equals(outro.nome);
	}
	
	@Override
	public int hashCode() {
		
		return this.nome.hashCode();
	}
}
