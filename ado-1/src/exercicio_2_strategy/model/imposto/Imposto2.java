package exercicio_2_strategy.model.imposto;

import exercicio_2_strategy.model.orcamento.Orcamento;

public class Imposto2 implements Imposto{
	
	private static double imposto = 0.15;

	@Override
	public double calculoImposto(Orcamento orcamento) {
		Double total = 0d;
		
		for (Double valor : orcamento.getValores()) {
			total += valor;
		}
		
		return total + (total * imposto);
	}

}
