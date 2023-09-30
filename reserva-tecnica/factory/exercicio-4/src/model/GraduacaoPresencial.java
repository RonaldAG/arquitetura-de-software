package model;

public class GraduacaoPresencial implements EnsinoSuperior{
	private final String requisito;
	
	private String local;
	
	public GraduacaoPresencial(String local) {
		requisito = Requisito.ENSINO_MEDIO.getRequisito();
		this.local = local;
	}
	
	@Override
	public String getRequisito() {
		return "Requisito para entrar na graduação presencial: " + requisito;
	}
	
	public String getLocal() {
		return local;
	}
}
