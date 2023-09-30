package main;

import context.Context;
import model.Gerencia;

public class Client {

	
	public static void main(String[] args) {
		
		
		double salario = 1000;
		
		Context context = new Context();
		
		double novoSalario = context.salarioBonificado(salario, new Gerencia());
		
		System.out.println(novoSalario);
		
	}
}
