package Entidades.Produtos;

public class Variacao {
    private String idVariacao;
    private double preco;

    public Variacao(String idVariacao, double preco) {
        this.idVariacao = idVariacao;
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

}
