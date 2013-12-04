package com.labJava.beans;

public class PrimerObjetoBean {
	
	private Integer prop1I;
	private String prop1S;
	
	public PrimerObjetoBean(Integer prop1i, String prop1s) {
		super();
		prop1I = prop1i;
		prop1S = prop1s;
	}

	public PrimerObjetoBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getProp1I() {
		return prop1I;
	}
	public void setProp1I(Integer prop1i) {
		prop1I = prop1i;
	}
	public String getProp1S() {
		return prop1S;
	}
	public void setProp1S(String prop1s) {
		prop1S = prop1s;
	}
	
	

}
