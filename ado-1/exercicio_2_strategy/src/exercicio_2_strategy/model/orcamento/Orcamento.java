package exercicio_2_strategy.model.orcamento;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import exercicio_2_strategy.model.imposto.Imposto;

public class Orcamento {

	private List<Double> valores;
	
	public Orcamento() {
		valores = new ArrayList<>();
	}

	public List<Double> getValores() {
		return valores;
	}

	public void setValores(List<Double> valores) {
		this.valores = valores;
	}
	
	public void addValor(Double valor) {
		this.valores.add(valor);
	}
	
	public double calculaImposto(Imposto imposto) {
		return imposto.calculoImposto(this);
	}

	@Override
	public int hashCode() {
		return Objects.hash(valores);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orcamento other = (Orcamento) obj;
		return Objects.equals(valores, other.valores);
	}

	@Override
	public String toString() {
		return "Orcamento [valores=" + valores + "]";
	}
	
	
	
}
