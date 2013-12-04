package com.labJava.beans;

public class JuegoArcadeBean {
	
	private Integer id_juegoArcade;
	private String nombreArcade;
	private String companiaArcade;
	private Integer anioEdicion;
	private Integer id_comboEstado;
	private ComboEstadoBean comboEstadoBean;
	
	public JuegoArcadeBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JuegoArcadeBean(Integer id_juegoArcade, String nombreArcade,
			String companiaArcade, Integer anioEdicion, Integer id_comboEstado,
			ComboEstadoBean comboEstadoBean) {
		super();
		this.id_juegoArcade = id_juegoArcade;
		this.nombreArcade = nombreArcade;
		this.companiaArcade = companiaArcade;
		this.anioEdicion = anioEdicion;
		this.id_comboEstado = id_comboEstado;
		this.comboEstadoBean = comboEstadoBean;
	}

	public Integer getId_juegoArcade() {
		return id_juegoArcade;
	}

	public void setId_juegoArcade(Integer id_juegoArcade) {
		this.id_juegoArcade = id_juegoArcade;
	}

	public String getNombreArcade() {
		return nombreArcade;
	}

	public void setNombreArcade(String nombreArcade) {
		this.nombreArcade = nombreArcade;
	}

	public String getCompaniaArcade() {
		return companiaArcade;
	}

	public void setCompaniaArcade(String companiaArcade) {
		this.companiaArcade = companiaArcade;
	}

	public Integer getAnioEdicion() {
		return anioEdicion;
	}

	public void setAnioEdicion(Integer anioEdicion) {
		this.anioEdicion = anioEdicion;
	}

	public Integer getId_comboEstado() {
		return id_comboEstado;
	}

	public void setId_comboEstado(Integer id_comboEstado) {
		this.id_comboEstado = id_comboEstado;
	}

	public ComboEstadoBean getComboEstadoBean() {
		return comboEstadoBean;
	}

	public void setComboEstadoBean(ComboEstadoBean comboEstadoBean) {
		this.comboEstadoBean = comboEstadoBean;
	}
	
}
