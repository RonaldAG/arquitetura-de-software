package model;

public class Gerencia implements Departamento{
	
	private final double bonus = 0.06;

	@Override
	public double salarioBonificado(double salario) {
		return  salario + (salario * bonus);
	}

}
