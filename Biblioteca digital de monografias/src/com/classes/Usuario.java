package com.classes;

public class Usuario {
	String login, senha, cpf, endereco, instituicao, email, niveleducacional;
	
	
	
	public Usuario(String login, String senha, String cpf, String endereco,
			String instituicao, String email, String niveleducacional) {
		super();
		this.login = login;
		this.senha = senha;
		this.cpf = cpf;
		this.endereco = endereco;
		this.instituicao = instituicao;
		this.email = email;
		this.niveleducacional = niveleducacional;
	}

	private String getLogin() {
		return login;
	}

	private void setLogin(String login) {
		this.login = login;
	}

	private String getSenha() {
		return senha;
	}

	private void setSenha(String senha) {
		this.senha = senha;
	}

	private String getCpf() {
		return cpf;
	}

	private void setCpf(String cpf) {
		this.cpf = cpf;
	}

	private String getEndereco() {
		return endereco;
	}

	private void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	private String getInstituicao() {
		return instituicao;
	}

	private void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	private String getEmail() {
		return email;
	}

	private void setEmail(String email) {
		this.email = email;
	}

	private String getNiveleducacional() {
		return niveleducacional;
	}

	private void setNiveleducacional(String niveleducacional) {
		this.niveleducacional = niveleducacional;
	}



}
