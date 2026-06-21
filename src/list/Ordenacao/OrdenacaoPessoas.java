package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> listaPessoas;

    public OrdenacaoPessoas(){
        this.listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String name, int idade, double altura) {
        listaPessoas.add(new Pessoa(name, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> ordenadoPorIdade = new ArrayList<>(listaPessoas);
        Collections.sort(ordenadoPorIdade);
        return ordenadoPorIdade;

    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> ordenadoPorAltura = new ArrayList<>(listaPessoas);
        Collections.sort(ordenadoPorAltura, new ComparatorPorAltura());
        return ordenadoPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas pessoasList = new OrdenacaoPessoas();

        pessoasList.adicionarPessoa("Luiz", 22, 1.77);
        pessoasList.adicionarPessoa("Ruth", 24, 1.69);
        pessoasList.adicionarPessoa("Pedro", 20, 1.65);

        System.out.println("A lista das pessoas ordenadas por sua idade é: \n" + pessoasList.ordenarPorIdade());
        System.out.println("A lista ordenada pela altura é: \n" + pessoasList.ordenarPorAltura());
    }
}
