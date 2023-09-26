package model;

import java.util.ArrayList;
import java.util.List;

public class Items implements Produto{
	private double totalPreco;
	private List<Produto> produtos;
	
	public Items() {
		produtos = new ArrayList<>();
		this.totalPreco = 0;
	}
	

    public void adicionar(Produto produto){
      produtos.add(produto);
    }
    
    public void remover(Produto produto){
      produtos.remove(produto);
    }
	
	@Override
	public double getPreco() {
		
		for (Produto produto : produtos) {
			totalPreco += produto.getPreco();
		}
		
		return totalPreco;
	}


	@Override
	public String toString() {
		return "Items [totalPreco=" + totalPreco + ", produtos=" + produtos + "]";
	}

	
}
