package com.labJava.beans;

public class ComboEstadoBean {
	
	private Integer id_comboEstado;
	private String descComboEstado;
	
	public ComboEstadoBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ComboEstadoBean(Integer id_comboEstado, String descComboEstado) {
		super();
		this.id_comboEstado = id_comboEstado;
		this.descComboEstado = descComboEstado;
	}

	public Integer getId_comboEstado() {
		return id_comboEstado;
	}

	public void setId_comboEstado(Integer id_comboEstado) {
		this.id_comboEstado = id_comboEstado;
	}

	public String getDescComboEstado() {
		return descComboEstado;
	}

	public void setDescComboEstado(String descComboEstado) {
		this.descComboEstado = descComboEstado;
	}
	
}
