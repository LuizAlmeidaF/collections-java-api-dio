package set.OperacoesBasicas;


import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String name, int codigoConvite){
        convidadoSet.add(new Convidado(name, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public Set<Convidado> exibirConvidados(){
        return convidadoSet;
    }

    static void main() {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Luiz", 12341);
        conjuntoConvidados.adicionarConvidado("Ruth", 12423);
        conjuntoConvidados.adicionarConvidado("Roberto", 13452);

        System.out.println(conjuntoConvidados.exibirConvidados());
        System.out.printf("Atualmente tem %s convidados.%n", conjuntoConvidados.contarConvidados());

        conjuntoConvidados.removerConvidadoPorCodigoConvite(13452);

        System.out.println(conjuntoConvidados.exibirConvidados());
        System.out.printf("Atualmente tem %s convidados.%n", conjuntoConvidados.contarConvidados());

    }
}
