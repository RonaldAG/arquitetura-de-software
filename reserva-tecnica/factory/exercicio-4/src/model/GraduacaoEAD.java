package model;

public class GraduacaoEAD implements EnsinoSuperior{
	private final String requisito;
	
	private String polo;
	
	public GraduacaoEAD(String polo) {
		requisito = Requisito.ENSINO_MEDIO.getRequisito();
		this.polo = polo;
	}
	
	@Override
	public String getRequisito() {
		return "Requisito para entrar na graduação EAD: " + requisito;
	}
	
	public String getPolo() {
		return polo;
	}
}
