package br.com.praticando;
import java.util.ArrayList;
import java.util.List;

public class Produto {

	private String descricao;
	private double preco;
	private String categoria;
	protected List<Produto> produto = new ArrayList<>();
	private double frete;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public double setPreco( double preco) {
		
		return this.preco = preco;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void adciona(Produto produto) {
		this.produto.add(produto);

	}

	public double getFrete() {
		return frete;
	}

	public double setFrete(int frete) {
		return frete;

	}

}
