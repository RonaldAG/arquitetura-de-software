package factory;

import model.EnsinoSuperior;
import model.TipoEnsino;

public interface Factory {

	// metodo de retorno de uma classe
	public EnsinoSuperior getEnsinoSuperior(String local, TipoEnsino tipoEnsino);
}
