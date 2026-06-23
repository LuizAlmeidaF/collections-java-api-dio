package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo
    Map<String, Integer> agendaContatos;

    public AgendaContatos() {
        this.agendaContatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatos.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!agendaContatos.isEmpty()) {
            agendaContatos.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatos);
    }

    public void pesquisaPorNome(String nome) {
        if(!agendaContatos.isEmpty()) {
            System.out.println(agendaContatos.get(nome));;
        }
    }

    static void main() {
        //Criando o Map com o construtor
        AgendaContatos contatosAgenda = new AgendaContatos();
        //Adicionando os contatos
        contatosAgenda.adicionarContato("Luiz", 11918381);
        contatosAgenda.adicionarContato("Ruth", 11993839);
        contatosAgenda.adicionarContato("Phedro", 11928391);
        //Exibindo os contatos
        contatosAgenda.exibirContatos();
        //Removendo contato pela chave
        contatosAgenda.removerContato("Phedro");
        //Exibindo lista sem o contato removido
        contatosAgenda.exibirContatos();
        //Pesquisando o contato pela chave
        contatosAgenda.pesquisaPorNome("Luiz");
    }
}
