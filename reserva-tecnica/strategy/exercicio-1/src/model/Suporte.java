package model;

public class Suporte implements Departamento{
	
	private final double bonus = 0.04;

	@Override
	public double salarioBonificado(double salario) {
		return salario + (salario * bonus);
	}
	
}
