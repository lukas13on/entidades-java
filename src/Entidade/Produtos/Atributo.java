package Entidade.Produtos;

public class Atributo {
    private String idAtributo;
    private String nome;
    private String valor;

    public Atributo(String idAtributo, String nome, String valor) {
        this.idAtributo = idAtributo;
        this.nome = nome;
        this.valor = valor;
    }

    public String getIdAtributo() {
        return this.idAtributo;
    }

    public void setIdAtributo(String idAtributo) {
        this.idAtributo = idAtributo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValor() {
        return this.valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}
