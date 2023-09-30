package model;

public enum Requisito {
	ENSINO_MEDIO("Ensino médio"),
	GRADUACAO("Graduação");
	
	
	private String requisito;
	
	private Requisito(String requisito) {
		this.requisito = requisito;
	}
	
	public String getRequisito() {
		return requisito;
	}
}
