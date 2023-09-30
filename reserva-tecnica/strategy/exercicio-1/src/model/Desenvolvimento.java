package model;

public class Desenvolvimento implements Departamento{
	
	private final double bonus = 0.05;

	@Override
	public double salarioBonificado(double salario) {
		return salario + (salario * bonus);
	}

	
}
