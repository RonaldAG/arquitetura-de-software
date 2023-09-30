package model;

public class DemaisSetores implements Departamento{
	
	private final double bonus = 0.03;

	@Override
	public double salarioBonificado(double salario) {
		return salario + (salario * bonus);
	}
	
}
