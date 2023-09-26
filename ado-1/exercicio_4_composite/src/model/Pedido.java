package model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private String nomeCliente;
	private long numeroPedido;
	private double totalPreco;
	
	private List<Produto> produtos;
	
	public Pedido(String nomeCliente, long numeroPedido) {
		produtos = new ArrayList<>();
		this.nomeCliente = nomeCliente;
		this.numeroPedido = numeroPedido;
		this.totalPreco = 0;
	}
	

    public void adicionar(Produto produto){
      produtos.add(produto);
    }
    
    public void remover(Produto produto){
      produtos.remove(produto);
    }
	

	public double getTotalPreco() {
		
		for (Produto produto : produtos) {
			totalPreco += produto.getPreco();
		}
		
		return totalPreco;
	}


	@Override
	public String toString() {
		return "Pedido [nomeCliente=" + nomeCliente + ", numeroPedido=" + numeroPedido + ", totalPreco=" + totalPreco
				+ ", produtos=" + produtos + "]";
	}
	
}
