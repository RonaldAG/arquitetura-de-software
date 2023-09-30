package main;

import java.util.ArrayList;
import java.util.List;

import imposto.Imposto1;
import imposto.Imposto2;
import imposto.Imposto3;
import orcamento.Orcamento;

public class Client {
	
	public static void main(String[] args) {
		List<Double> produtos = new ArrayList<>();
		
		produtos.add(100d);
		produtos.add(200.50);
		produtos.add(20d);
		produtos.add(45.50);
		
		Orcamento orcamento = new Orcamento();
		orcamento.setValores(produtos);
		
		double total1 = orcamento.calculaImposto(new Imposto1());
		double total2 = orcamento.calculaImposto(new Imposto2());
		double total3 = orcamento.calculaImposto(new Imposto3());
		
		System.out.println("Total com o imposto 1: " + total1);
		System.out.println("Total com o imposto 2: " + total2);
		System.out.println("Total com o imposto 3: " + total3);
		
	}
	
}
