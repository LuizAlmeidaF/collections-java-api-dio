package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> conjuntoPalavras;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        conjuntoPalavras.add(palavra);
    }

    public void removerPalavra(String palavra){
        String palavraParaRemover = null;
        for(String p : conjuntoPalavras){
            if(p.equalsIgnoreCase(palavra)){
                palavraParaRemover = p;
                break;
            }
        }
        conjuntoPalavras.remove(palavraParaRemover);
    }
    public void verificarPalavra(String palavra){
        for(String p : conjuntoPalavras){
            if(p.equalsIgnoreCase(palavra)){
                System.out.println("Essa palavra já está inserida.");
            }else{
                System.out.println("Essa palavra não está inserida.");
            }
            break;
        }
    }

    public void exibirPalavrasUnicas(){
        System.out.println(conjuntoPalavras);
    }

    static void main() {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Bola");
        conjuntoPalavrasUnicas.adicionarPalavra("Foguete");
        conjuntoPalavrasUnicas.adicionarPalavra("Mouse");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("Foguete");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.verificarPalavra("Foguete");
        conjuntoPalavrasUnicas.adicionarPalavra("Teclado");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

    }
}
