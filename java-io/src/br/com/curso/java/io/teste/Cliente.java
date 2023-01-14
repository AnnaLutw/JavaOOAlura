package br.com.curso.java.io.teste;

import java.io.Serializable;

public class Cliente implements Serializable{
	
	private static final long serialVersionUID = -1225724421356729675L;
	String nome;
	String cpf;
	String profissao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String i) {
		this.cpf = i;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
		
	
}
