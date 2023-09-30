package model;

public class PosGraduacao implements EnsinoSuperior{
	private final String requisito;
	
	private String local;
	
	
	public PosGraduacao(String local) {
		requisito = Requisito.GRADUACAO.getRequisito();
		this.local = local;
	}
	
	@Override
	public String getRequisito() {
		return "Requisito para entrar na pós-graduação: " + requisito;
	}
	
	public String getLocal() {
		return local;
	}
}
