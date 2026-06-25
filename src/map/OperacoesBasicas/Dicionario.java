package map.OperacoesBasicas;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionario.isEmpty()) {
            dicionario.remove(palavra);
        }
    }

    public void exibirPalavras() {
        System.out.println(dicionario);
    }

    public void pesquisarPorNome(String palavra) {
        if(!dicionario.isEmpty()){
            System.out.println(dicionario.get(palavra));
        }
    }

    static void main() {
        Dicionario dicionarioMap = new Dicionario();

        dicionarioMap.adicionarPalavra("Cachoeira", "Cachoeira é uma queda volumosa de água da corrente de um rio ou córrego.");
        dicionarioMap.adicionarPalavra("Roda", "Roda é um componente rotativo, tipicamente de formato circular");

        dicionarioMap.exibirPalavras();

        dicionarioMap.removerPalavra("Roda");

        dicionarioMap.exibirPalavras();

        dicionarioMap.pesquisarPorNome("Cachoeira");
    }
}