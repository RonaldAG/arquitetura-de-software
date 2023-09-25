package exercicio_2_strategy.tax;

import exercicio_2_strategy.model.imposto.Imposto;
import exercicio_2_strategy.model.orcamento.Orcamento;

public class CalculaImposto {
	
	public double calculaImposto(Orcamento orcamento, Imposto imposto) {
		return imposto.calculoImposto(orcamento);
	}
}
