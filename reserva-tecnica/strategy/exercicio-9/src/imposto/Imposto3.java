package imposto;

import orcamento.Orcamento;

public class Imposto3 implements Imposto{
	private static double imposto = 0.25;

	@Override
	public double calculoImposto(Orcamento orcamento) {
		Double total = 0d;
		
		for (Double valor : orcamento.getValores()) {
			total += valor;
		}
		
		return total + (total * imposto);
	}
}
