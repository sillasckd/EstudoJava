package br.com.praticando;

import java.util.List;
import java.util.stream.Collectors;

public class CarrinhoCompra extends Produto implements CalculaPreco {

	public static final double FRETE_FIXO = 150;

	public CarrinhoCompra(Cliente cliente, List<Produto> produtosComprados) {

	}

//	@Override
//	public double calculadorFrete(List<Produto> produtosComprados) {
//		for (Produto produto : produtosComprados) {
//			produto.getPreco();
//			if(produto.getPreco()>=2500) {
//				return produto.setFrete(0);
//			}
//				//return produto.setFrete(150);
//				calcularPrecoTotal(produtosComprados);
//			}
//		
//		throw new NullPointerException("Produto ou preco inexistente");
//		}
//				

	@Override
	public Double calcularPrecoTotal(List<Produto> produtosComprados) {
		final var total = produtosComprados
		.stream()
		.map(produto -> pegarPreco(produto))
		.collect(Collectors.toList());
		
		Double somaTotal = 0.0;
		
		for (Double totalCompra : total) {
			somaTotal += totalCompra.doubleValue();
		}
		return somaTotal;
	}

	private Double pegarPreco(Produto produto) {
		if (produto.getPreco() >= 2500) {
			return (produto.setFrete(0));
		}
		return (produto.getPreco() + FRETE_FIXO);

	}

}
