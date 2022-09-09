package Entidade.Produtos;

public class Variacao {
    private String idVariacao;
    private double preco;
    private Estoque estoque;
    private Atributo[] atributos;
    private Imagem[] imagens;

    public Variacao(String idVariacao, Estoque estoque, Atributo[] atributos, Imagem[] imagens, double preco) {
        this.idVariacao = idVariacao;
        this.estoque = estoque;
        this.atributos = atributos;
        this.imagens = imagens;
        this.preco = preco;
    }

    public String getIdVariacao() {
        return this.idVariacao;
    }

    public void setIdVariacao(String idVariacao) {
        this.idVariacao = idVariacao;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Estoque getEstoque() {
        return this.estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public Atributo[] getAtributos() {
        return this.atributos;
    }

    public void setAtributos(Atributo[] atributos) {
        this.atributos = atributos;
    }

    public Imagem[] getImagens() {
        return this.imagens;
    }

    public void setImagens(Imagem[] imagens) {
        this.imagens = imagens;
    }

}
