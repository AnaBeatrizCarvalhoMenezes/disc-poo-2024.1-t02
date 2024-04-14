package br.edu.principal;
import br.edu.funcoes.*;
public class Principal {

	public static void main(String[] args) {
		double valor, valorTotal, desconto;
		System.out.println("Este programa calcula o custo da compra de um produto.");
		Funcoes fun = new Funcoes();
		valor = fun.CalculaPreco(fun.CalculaValor(fun.RecebeCodigo()),fun.RecebeQuantidade());
		desconto = fun.CalculaDesconto(valor);
		valorTotal = fun.CalculaValorT(desconto, valor);
		System.out.println("Fim de programa.");
	
	}
}


