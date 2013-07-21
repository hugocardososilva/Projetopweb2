package com.classes;

import java.util.Date;

public class Monografia {
	String codigo, nomeAluno, matriculaAluno, arquivo;
	double nota;
	Date dataEnvio;
	Curso curso;
	public Monografia(String codigo, String nomeAluno, String matriculaAluno,
			String arquivo, double nota, Date dataEnvio, Curso curso) {
		super();
		this.codigo = codigo;
		this.nomeAluno = nomeAluno;
		this.matriculaAluno = matriculaAluno;
		this.arquivo = arquivo;
		this.nota = nota;
		this.dataEnvio = dataEnvio;
		this.curso = curso;
	}
	private String getCodigo() {
		return codigo;
	}
	private void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	private String getNomeAluno() {
		return nomeAluno;
	}
	private void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	private String getMatriculaAluno() {
		return matriculaAluno;
	}
	private void setMatriculaAluno(String matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}
	private String getArquivo() {
		return arquivo;
	}
	private void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}
	private double getNota() {
		return nota;
	}
	private void setNota(double nota) {
		this.nota = nota;
	}
	private Date getDataEnvio() {
		return dataEnvio;
	}
	private void setDataEnvio(Date dataEnvio) {
		this.dataEnvio = dataEnvio;
	}
	private Curso getCurso() {
		return curso;
	}
	private void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
	

}
