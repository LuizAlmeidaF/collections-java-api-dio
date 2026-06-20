package list.OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    //Atributo
    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefaParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefaParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();

    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }



    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println("O número de tarefas é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefa("Jogar Lixo fora.");

        System.out.println("O numero total de tarefas é: " + listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.obterDescricoesTarefas();
    }
}
