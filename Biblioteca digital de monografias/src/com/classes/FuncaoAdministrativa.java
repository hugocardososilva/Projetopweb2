package com.classes;

public class FuncaoAdministrativa {
	int cod�go;
	String privilegio, descricao;
	public FuncaoAdministrativa(int cod�go, String privilegio, String descricao) {
		super();
		this.cod�go = cod�go;
		this.privilegio = privilegio;
		this.descricao = descricao;
	}
	private int getCod�go() {
		return cod�go;
	}
	private void setCod�go(int cod�go) {
		this.cod�go = cod�go;
	}
	private String getPrivilegio() {
		return privilegio;
	}
	private void setPrivilegio(String privilegio) {
		this.privilegio = privilegio;
	}
	private String getDescricao() {
		return descricao;
	}
	private void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
