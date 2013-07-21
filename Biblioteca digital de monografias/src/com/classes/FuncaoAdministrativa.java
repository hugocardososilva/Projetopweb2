package com.classes;

public class FuncaoAdministrativa {
	int codígo;
	String privilegio, descricao;
	public FuncaoAdministrativa(int codígo, String privilegio, String descricao) {
		super();
		this.codígo = codígo;
		this.privilegio = privilegio;
		this.descricao = descricao;
	}
	private int getCodígo() {
		return codígo;
	}
	private void setCodígo(int codígo) {
		this.codígo = codígo;
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
