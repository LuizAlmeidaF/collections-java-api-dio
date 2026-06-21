package list.Ordenacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class OrdenacaoNumeros {

    private List<Integer> listaNumeros;

    public OrdenacaoNumeros(){
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int num){
        listaNumeros.add(num);
    }

    public List<Integer> ordenarCrescente() {
        List<Integer> ordenadoCrescente = new ArrayList<>(listaNumeros);
        Collections.sort(ordenadoCrescente);
        return ordenadoCrescente;
    }

    public List<Integer> ordenarDecrescente() {
        List<Integer> ordenadoDecrescente = new ArrayList<>(listaNumeros);
        Collections.sort(ordenadoDecrescente, Collections.reverseOrder());
        return ordenadoDecrescente;
    }

    static void main() {
        OrdenacaoNumeros numberList = new OrdenacaoNumeros();

        numberList.adicionarNumero(159);
        numberList.adicionarNumero(174);
        numberList.adicionarNumero(22);
        numberList.adicionarNumero(85);
        numberList.adicionarNumero(63);
        numberList.adicionarNumero(256);

        System.out.println("Lista em ordem ascendente: " + numberList.ordenarCrescente());
        System.out.println("Lista em ordem descendente: " + numberList.ordenarDecrescente());
    }
}
