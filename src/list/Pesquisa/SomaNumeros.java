package list.Pesquisa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {
    List<Integer> numerosInteiros;

    public SomaNumeros(){
        this.numerosInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerosInteiros.add(numero);
    }

    public int calcularSoma(){
        int somaTotal = 0;
        for(int n : numerosInteiros){
            somaTotal += n;
        }
        return somaTotal;
    }

    public int encontrarMaiorNumero(){
        return Collections.max(numerosInteiros);
    }

    public int encontrarMenorNumero(){
        return Collections.min(numerosInteiros);
    }

    public void exibirNumeros(){
        System.out.println(numerosInteiros);
    }

    public static void main(String[] args) {
        SomaNumeros listNumeros = new SomaNumeros();

        listNumeros.adicionarNumero(25);
        listNumeros.adicionarNumero(89);
        listNumeros.adicionarNumero(65);
        listNumeros.adicionarNumero(78);
        listNumeros.adicionarNumero(22);

        System.out.println("O maior numero é " + listNumeros.encontrarMaiorNumero());
        System.out.println("E o menor numero é " + listNumeros.encontrarMenorNumero());

        listNumeros.exibirNumeros();
    }
}
