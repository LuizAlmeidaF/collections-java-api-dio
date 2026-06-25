package map.Pesquisa;

public class Produto {
    //atributos
    private String name;
    private int quantidade;
    private double preco;

    public Produto(String name, int quantidade, double preco) {
        this.name = name;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getName() {
        return name;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "name=" + name + "\n" +
                ", quantidade=" + quantidade + "\n" +
                ", preco=" + preco + "\n" +
                '}';
    }
}
