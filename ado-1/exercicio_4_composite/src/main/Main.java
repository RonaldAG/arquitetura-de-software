package main;

import model.Item;
import model.Items;
import model.Pedido;
import model.Produto;
import model.Promocao;

public class Main {
	
	public static void main(String[] args) {
		 Pedido carrinho=new Pedido("Ronald", 1);
	      
	      Produto prod1=new Item("Caneca", 43.12);
	      Produto prod2=new Item("Café blaster", 18.5);
	      Produto prod3=new Item("Leite", 12.67);
	      
	      carrinho.adicionar(prod1);
	      carrinho.adicionar(prod2);
	      carrinho.adicionar(prod3);
	      
	      Items pacote=new Items();
	      Produto prod4=new Promocao("Morango", 5.4, 0.15);
	      Produto prod5=new Promocao("Morango", 5.4, 0.15);
	      Produto prod6=new Promocao("Morango", 5.4, 0.15);
	      Produto prod7=new Promocao("Morango", 5.4, 0.15);
	      
	      pacote.adicionar(prod4);
	      pacote.adicionar(prod5);
	      pacote.adicionar(prod6);
	      pacote.adicionar(prod7);
	      
	      carrinho.adicionar(pacote);
	        System.out.println("Total: "+ String.format("%.2f", carrinho.getTotalPreco()));
	}

}
