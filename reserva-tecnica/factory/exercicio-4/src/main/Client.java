package main;

import factory.Factory;
import factory.FactoryImpl;
import model.EnsinoSuperior;
import model.TipoEnsino;

public class Client {
	
	public static void main(String[] args) {
		Factory factory = new FactoryImpl();
		
		EnsinoSuperior senac = factory.getEnsinoSuperior("Santo Amaro", TipoEnsino.GRADUACAO_PRESENCIAL);
		EnsinoSuperior senacEAD = factory.getEnsinoSuperior("Largo Treze", TipoEnsino.GRADUACAO_EAD);
		EnsinoSuperior posGraduacao = factory.getEnsinoSuperior("Largo Treze", TipoEnsino.POS_GRADUACAO);
		
		System.out.println(senac.getRequisito());
		System.out.println(senacEAD.getRequisito());
		System.out.println(posGraduacao.getRequisito());
	}
}
