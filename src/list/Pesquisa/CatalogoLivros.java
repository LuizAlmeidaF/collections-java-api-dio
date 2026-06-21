package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> catalogoDeLivros;

    public CatalogoLivros(){
        this.catalogoDeLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        catalogoDeLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public void pesquisarPorAutor(String autor){
        List<Livro> livrosParaProcurar = new ArrayList<>();

        for(Livro l : catalogoDeLivros){
            if(l.getAutor().equalsIgnoreCase(autor)){
                livrosParaProcurar.add(l);
            }
        }
        System.out.println(livrosParaProcurar);
    }

    public void pesquisarPorAno(int anoInicial, int anoFinal){
        List<Livro> livrosPorPeriodo = new ArrayList<>();
        for(Livro l : catalogoDeLivros){
            if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                livrosPorPeriodo.add(l);
            }
        }
        System.out.println(livrosPorPeriodo);

    }

    public void pesquisaPorTitulo(String titulo){
        List<Livro> porTitulo = new ArrayList<>();
        for(Livro l : catalogoDeLivros){
            if(l.getTitulo().equalsIgnoreCase(titulo)){
                porTitulo.add(l);
            }
        }
        if(porTitulo.isEmpty()){
            System.out.println("Não tem nenhum livro com esse titulo.");
        }else{
            System.out.println(porTitulo);
        }
    }

    public static void main(String[] args){
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Harry Potter e a Pedra Filosofal", "JK Rolling", 1997);
        catalogoLivros.adicionarLivro("Harry Potter e o Prisioneiro de Azkaban", "JK Rolling", 1999);
        catalogoLivros.adicionarLivro("Revolução dos Bichos", "George Orwell", 1945);
        catalogoLivros.adicionarLivro("A Metamorfose", "Franz Kafka", 1915);
        catalogoLivros.adicionarLivro("Harry Potter e a Camara Secreta", "JK Rolling", 1998);

        catalogoLivros.pesquisarPorAutor("jk rolling");
        catalogoLivros.pesquisarPorAutor("franz kafka");
        catalogoLivros.pesquisarPorAno(1987, 2001);
        catalogoLivros.pesquisaPorTitulo("Harry Potter e a Camara Secreta");
    }
}
