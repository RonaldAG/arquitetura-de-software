package factory;

import model.EnsinoSuperior;
import model.GraduacaoEAD;
import model.GraduacaoPresencial;
import model.PosGraduacao;
import model.TipoEnsino;

public class FactoryImpl implements Factory{

	@Override
	public EnsinoSuperior getEnsinoSuperior(String local, TipoEnsino tipoEnsino) {
		
		if (tipoEnsino.equals(TipoEnsino.GRADUACAO_PRESENCIAL)) {
			return new GraduacaoPresencial(local);
		} else if (tipoEnsino.equals(TipoEnsino.GRADUACAO_EAD)) {
			return new GraduacaoEAD(local);
		} else if (tipoEnsino.equals(TipoEnsino.POS_GRADUACAO)) {
			return new PosGraduacao(local);
		}
		
		return null;
	}

}
