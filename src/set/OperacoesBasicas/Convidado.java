package set.OperacoesBasicas;

public class Convidado{
    private String name;
    private int codigoConvite;

    public Convidado(String name, int codigoConvite) {
        this.name = name;
        this.codigoConvite = codigoConvite;
    }

    public String getName() {
        return name;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    @Override
    public String toString(){
        return "Nome: " + name + "\n"
                + "Codigo de Convite: " + codigoConvite + "\n";
    }
}
