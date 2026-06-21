package list.OperacoesBasicas;

import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras {
    private List<Item> carrinhoDeCompras;

    public CarrinhoDeCompras(){
        this.carrinhoDeCompras = new ArrayList<>();
    }

    public void adicionarItem(String name, double preco, int quantidade){
        carrinhoDeCompras.add(new Item(name, preco, quantidade));
    }

    public void removerItem(String name){
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item i : carrinhoDeCompras){
            if(i.getName().equalsIgnoreCase(name)){
                itensParaRemover.add(i);
            }
        }
        carrinhoDeCompras.removeAll(itensParaRemover);

    }

    public double calcularValor(){
        double valorTotal = 0;
        for(Item i : carrinhoDeCompras){
            double totalItem = i.getPreco() * i.getQuantidade();
            valorTotal += totalItem;
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(carrinhoDeCompras);
    }

    static void main() {
        CarrinhoDeCompras carrinhoDeCompras1 = new CarrinhoDeCompras();
        carrinhoDeCompras1.exibirItens();

        carrinhoDeCompras1.adicionarItem("Livro", 69.99, 1);
        carrinhoDeCompras1.adicionarItem("Caderno", 25.60, 3);
        carrinhoDeCompras1.adicionarItem("Conjunto de Canetas", 20, 2);
        carrinhoDeCompras1.exibirItens();

        System.out.println(String.format("O valor total do seu carrinho de compras é: %.2f", carrinhoDeCompras1.calcularValor()));
    }
}
