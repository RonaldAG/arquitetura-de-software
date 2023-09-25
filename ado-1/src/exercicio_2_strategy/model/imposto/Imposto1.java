package exercicio_2_strategy.model.imposto;

import exercicio_2_strategy.model.orcamento.Orcamento;

public class Imposto1 implements Imposto{
	
	private static double imposto = 0.10;

	@Override
	public double calculoImposto(Orcamento orcamento) {
		Double total = 0d;
		
		for (Double valor : orcamento.getValores()) {
			total += valor;
		}
		
		return total + (total * imposto);
	}

}
