package model;

public class Promocao implements Produto{
	
	private String nome;
	private double preco;
	private double desconto;
	
	public Promocao(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	@Override
	public double getPreco() {
		return preco - (preco * desconto);
	}

	@Override
	public String toString() {
		return "Promocao [nome=" + nome + ", preco=" + preco + ", desconto=" + desconto + "]";
	}

}
