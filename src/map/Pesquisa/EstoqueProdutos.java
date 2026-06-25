package map.Pesquisa;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class EstoqueProdutos {
    //atributo
    private Map<Long, Produto> estoqueDeProdutos;

    public EstoqueProdutos() {
        this.estoqueDeProdutos = new HashMap<>();
    }

    public void adicionarProduto(long cod, String name, int quantidade, double preco) {
        estoqueDeProdutos.put(cod, new Produto(name, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(estoqueDeProdutos);
    }

    public double calcularValorTotalEstoque() {
        double valorTotal = 0;
        if(!estoqueDeProdutos.isEmpty()) {
            for (Produto p : estoqueDeProdutos.values()) {
                valorTotal += p.getQuantidade() * p.getPreco();

            }
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueDeProdutos.isEmpty()) {
            for (Produto p : estoqueDeProdutos.values()) {
                if(p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;

    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!estoqueDeProdutos.isEmpty()) {
            for(Produto p : estoqueDeProdutos.values()) {
                if(p.getPreco() < menorPreco) {
                    produtoMaisBarato = p;
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorNoEstoque = null;
        double maiorValorTotalProdutoEstoque = 0d;
        if(!estoqueDeProdutos.isEmpty()) {
            for(Map.Entry<Long, Produto> entry : estoqueDeProdutos.entrySet()) {
                double valorProdutoEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutoEstoque > maiorValorTotalProdutoEstoque) {
                    maiorValorTotalProdutoEstoque = valorProdutoEstoque;
                    produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
                }
            }
        }
        return produtoMaiorQuantidadeValorNoEstoque;
     }

    static void main() {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1241, "Mouse Gamer", 5, 79.99);
        estoqueProdutos.adicionarProduto(3112, "Teclado Gamer", 7, 200.00);

        estoqueProdutos.exibirProdutos();
        System.out.println("O valor total do estoque é: " + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("O produto mais caro no estoque é: " + estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("O produto mais barato no estoque é: "+ estoqueProdutos.obterProdutoMaisBarato());
        System.out.println("E o produto em maior quantidade no estoque considerando" +
                " o valor total de cada produto é: " + estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());

    }
}
