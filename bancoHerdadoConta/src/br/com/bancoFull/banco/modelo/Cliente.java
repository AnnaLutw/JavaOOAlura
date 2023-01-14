package br.com.bancoFull.banco.modelo;

import java.io.Serializable;

public class Cliente implements Serializable {
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
