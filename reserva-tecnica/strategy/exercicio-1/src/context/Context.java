package context;

import model.Departamento;

public class Context {

	
	public double salarioBonificado(double salario, Departamento departamento) {
		return departamento.salarioBonificado(salario);
	}
}
