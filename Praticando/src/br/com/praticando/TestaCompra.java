package br.com.praticando;
import java.util.ArrayList;
import java.util.List;

public class TestaCompra {
	public static void main(String[] args) {

		Produto notebook = new Produto();
		Produto mouse = new Produto();
		Produto teclado = new Produto();
		
		Cliente sillas = new Cliente("Sillas Santos", "095.346.564.02", "Rua Istambul, 90 A");

		System.out.println(sillas.getNome());
		System.out.println(sillas.getCpf());
		System.out.println(sillas.getEndereco());
		
		List<Produto> produtosComprados = new ArrayList<>();
		
		produtosComprados.add(notebook);
		produtosComprados.add(mouse);
		produtosComprados.add(teclado);
		
		notebook.setPreco(1500);
		mouse.setPreco(150);
		teclado.setPreco(250);
		
		notebook.setDescricao("Notebook i3 500gb 4gb ram ");
		
		System.out.println(notebook.getDescricao());

		CarrinhoCompra compraSillas = new CarrinhoCompra(sillas, produtosComprados);
		//compraSillas.calculadorFrete(produtosComprados);
		compraSillas.calcularPrecoTotal(produtosComprados);

//		System.out.println("Frete Total: " 
//		+ compraSillas.calculadorFrete(produtosComprados));
		System.out.println("Valor à pagar: " 
		+ compraSillas.calcularPrecoTotal(produtosComprados));
		
	}
}