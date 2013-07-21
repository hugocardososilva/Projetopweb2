package com.classes;

public class Administrador {
	int codigo, telefone;
	String senha, nome, endereco, email;
	public Administrador(int codigo, int telefone, String senha, String nome,
			String endereco, String email) {
		super();
		this.codigo = codigo;
		this.telefone = telefone;
		this.senha = senha;
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
	}
	private int getCodigo() {
		return codigo;
	}
	private void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	private int getTelefone() {
		return telefone;
	}
	private void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	private String getSenha() {
		return senha;
	}
	private void setSenha(String senha) {
		this.senha = senha;
	}
	private String getNome() {
		return nome;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}
	private String getEndereco() {
		return endereco;
	}
	private void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	private String getEmail() {
		return email;
	}
	private void setEmail(String email) {
		this.email = email;
	}
	
	

}
