package calculadora;

import imposto.Imposto;
import orcamento.Orcamento;

public class CalculaImposto {
	
	public double calculaImposto(Orcamento orcamento, Imposto imposto) {
		return imposto.calculoImposto(orcamento);
	}
	
}
