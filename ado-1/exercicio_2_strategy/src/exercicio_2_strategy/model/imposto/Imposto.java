package exercicio_2_strategy.model.imposto;

import exercicio_2_strategy.model.orcamento.Orcamento;

public interface Imposto {

	double calculoImposto(Orcamento orcamento);
}
